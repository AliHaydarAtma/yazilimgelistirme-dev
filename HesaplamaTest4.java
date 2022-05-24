package tr.edu.medipol.yazilim.islemler;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest4 {

	private Hesaplama testEdilenSinif = new Hesaplama();
	
	@Test
	public void testIkiSayiyiBol() {
		// GIVEN - On sartlar / Verilenler
		int sayi1 = 20;
		int sayi2 = 5;
		int beklenenSonuc = 4;
		
		// WHEN - Islem/Aksiyon gerceklestiginde
		int sonuc = testEdilenSinif.bol(sayi1, sayi2);
		
		// THEN - Islem sonrasi kontroller
		assertEquals(beklenenSonuc, sonuc);
	}


}
