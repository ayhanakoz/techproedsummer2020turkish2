package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		//Kullanicidan Tam ismini alin ekrana yazin
		// Kllan�c�dan yasini alin ekrana yazin
		// Kullanicidan isminin ilk harfini alin ekrana yazin alin
		// Kullan�c�n�n �ocuk say�s�n� byte ile al�n�z
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam isminizi giriniz");
		String tamIsim = scan.nextLine();
		System.out.println(tamIsim);
		
		
		System.out.println("Ya��n�z� giriniz");
		//Data type int ise; nextint() methodunu kullan�n�z
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("�sminiz ilk harfini giriniz");
		//Kullan�c�dan char almak i�in scan.next89.charAt(0);kullan�l�r
		char ilkHarf = scan.next().charAt(0);
		System.out.println(ilkHarf);
		 

		System.out.println("�ocuk say�s�n� giriniz" );
		byte cocukSayisi = scan.nextByte();
		System.out.println(cocukSayisi);
		
		
		
		
		
		
		
	}

}
