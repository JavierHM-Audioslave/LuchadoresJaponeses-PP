package LuchadoresJaponeses;

import java.io.*;
import java.util.ArrayList;

public class Torneo {
			LuchadoresJaponeses[] todos = null;
			
			public Torneo(String ruta)
			{
				File arch = null;
				FileReader fr = null;
				BufferedReader br = null;
				try
				{
					arch = new File(ruta);
					fr = new FileReader(arch);
					br = new BufferedReader(fr);
					int cant,i, peso, altura;
					String[] s = new String[2];
					cant = Integer.parseInt(br.readLine());
					todos = new LuchadoresJaponeses[cant];
					for(i=0; i<cant; i++)
					{
						s = br.readLine().split(" ");
						peso = Integer.parseInt(s[0]);
						altura = Integer.parseInt(s[1]);
						todos[i] = new LuchadoresJaponeses(peso, altura);				
					}
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				finally
				{
					try
					{
						fr.close();
					}
					catch(Exception ee)
					{
						System.out.println(ee);
						System.exit(-1);
					}
				}
			}
			
			public void resolver(){
				int i,j, cant;
				int[] cantidad = new int[todos.length];
				FileWriter fw = null;
				PrintWriter pw = null;
				for(i=0; i<todos.length; i++)
				{
					cant=0;
					LuchadoresJaponeses l1 = todos[i];
					for(j=0; j<todos.length; j++)
					{
						if(l1.domina(todos[j]))
						{
							cant++;
						}
					}
					cantidad[i] = cant;
				}
				try
				{
					fw = new FileWriter("out.txt");
					pw = new PrintWriter(fw);
					for(i=0; i<todos.length; i++)
					{
						pw.println(cantidad[i]);
					}
				}
				catch(Exception eee)
				{
					System.out.println(eee);
				}
				finally
				{
					
					try
					{
						fw.close();
						pw.close();
					}
					catch(Exception eeee)
					{
						System.out.println(eeee);
					}
					finally
					{
						System.exit(-1);
					}
				}
			}
			
}
