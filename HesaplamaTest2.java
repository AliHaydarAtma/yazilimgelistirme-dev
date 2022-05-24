package tr.edu.medipol.yazilim.islemler;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest2 {

private Hesaplama testEdilenSinif = new Hesaplama();
	
	@Test
	public void testIkiSayiyiCikar() {
		// GIVEN - On sartlar / Verilenler
		int sayi1 = 100;
		int sayi2 = 50;
		int beklenenSonuc = 50;
		
		// WHEN - Islem/Aksiyon gerceklestiginde
		int sonuc = testEdilenSinif.cikar(sayi1, sayi2);
		
		// THEN - Islem sonrasi kontroller
		assertEquals(beklenenSonuc, sonuc);
	}

}
