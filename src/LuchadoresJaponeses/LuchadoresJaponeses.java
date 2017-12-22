package LuchadoresJaponeses;

public class LuchadoresJaponeses{
	int p, h;
	public LuchadoresJaponeses(int p, int h){
		this.p = p;
		this.h= h;
	}
	
	public boolean domina(LuchadoresJaponeses l)
	{
		return (  (p>l.p && h>=l.h) || ( p>=l.p && h>l.h )    );
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	} 
	
	
	
	
	
	

}
