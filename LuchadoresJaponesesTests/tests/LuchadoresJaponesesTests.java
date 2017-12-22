package tests;

import org.junit.Assert;
import org.junit.Test;

import LuchadoresJaponeses.LuchadoresJaponeses;

public class LuchadoresJaponesesTests {
	
	@Test
	public void queLuchadorPese1000()
	{
		LuchadoresJaponeses l1= new LuchadoresJaponeses(1000,2000);
		Assert.assertEquals(1000, l1.getP());
	}
	
	@Test
	public void queLuchadorMida2000()
	{
		LuchadoresJaponeses l1=new LuchadoresJaponeses(1000,2000);
		Assert.assertEquals(2000, l1.getH());
	}
	
	@Test
	public void masPesadoDominaAMasLivianoYAmbosTienenMismaAltura()
	{
		LuchadoresJaponeses l1=new LuchadoresJaponeses(1000,2000);
		LuchadoresJaponeses l2= new LuchadoresJaponeses(900,2000);
		Assert.assertTrue(l1.domina(l2));
	}
	
	public void masAltoDominaAMasBajoYAmbosTienenMismoPeso()
	{
		LuchadoresJaponeses l1= new LuchadoresJaponeses(1000,2000);
		LuchadoresJaponeses l2= new LuchadoresJaponeses(1000,1000);
		Assert.assertTrue(l1.domina(l2));
	}
	
	public void ningunoGanaANadie()
	{
		LuchadoresJaponeses l1= new LuchadoresJaponeses(1000,2000);
		LuchadoresJaponeses l2= new LuchadoresJaponeses(900,2010);
		Assert.assertFalse(l1.domina(l2));
	}

}
