package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		//Kullanicidan Tam ismini alin ekrana yazin
		// Kllanýcýdan yasini alin ekrana yazin
		// Kullanicidan isminin ilk harfini alin ekrana yazin alin
		// Kullanýcýnýn çocuk sayýsýný byte ile alýnýz
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam isminizi giriniz");
		String tamIsim = scan.nextLine();
		System.out.println(tamIsim);
		
		
		System.out.println("Yaþýnýzý giriniz");
		//Data type int ise; nextint() methodunu kullanýnýz
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("Ýsminiz ilk harfini giriniz");
		//Kullanýcýdan char almak için scan.next89.charAt(0);kullanýlýr
		char ilkHarf = scan.next().charAt(0);
		System.out.println(ilkHarf);
		 

		System.out.println("Çocuk sayýsýný giriniz" );
		byte cocukSayisi = scan.nextByte();
		System.out.println(cocukSayisi);
		
		
		
		
		
		
		
	}

}
