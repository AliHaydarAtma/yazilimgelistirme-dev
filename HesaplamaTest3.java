package tr.edu.medipol.yazilim.islemler;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest3 {

	private Hesaplama testEdilenSinif = new Hesaplama();
	
	@Test
	public void testIkiSayiyiCarp() {
		// GIVEN - On sartlar / Verilenler
		int sayi1 = 5;
		int sayi2 = 10;
		int beklenenSonuc = 50;
		
		// WHEN - Islem/Aksiyon gerceklestiginde
		int sonuc = testEdilenSinif.carp(sayi1, sayi2);
		
		// THEN - Islem sonrasi kontroller
		assertEquals(beklenenSonuc, sonuc);
	}

}
