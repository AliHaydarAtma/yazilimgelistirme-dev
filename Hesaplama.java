package tr.edu.medipol.yazilim.islemler;

public class Hesaplama {

	static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	static int topla(int ... sayilar) {
		int toplamSonuc = 0;
		for (int sayi : sayilar) {
			toplamSonuc += sayi;
		}
		return toplamSonuc;
	}
	
	static int cikar(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}
	
	static int carp(int sayi1, int sayi2) {
		return sayi1*sayi2;
	}
	
	static int bol(int sayi1, int sayi2){
		if(sayi1 > sayi2) {
			return sayi1/sayi2;
		}else {
			return sayi2/sayi1;
		}
	}
	public static void main(String[] args) {
		
		int sonuc = topla(243,654);
		
		int cikarmasonuc = cikar(350,300);
		
		int carpmasonuc = carp(5,25);
		
		int bolmesonuc = bol(20,4);
		
		// System.out.printf("%d + %d = %d %n",243,654,sonuc);
		
		System.out.println("243 + 654 = " + sonuc);
		System.out.println("350 -300 = " + cikarmasonuc);
		System.out.println("5 x 25 = " + carpmasonuc);
		System.out.println("20 / 4 = " + bolmesonuc);
		
	}

}
