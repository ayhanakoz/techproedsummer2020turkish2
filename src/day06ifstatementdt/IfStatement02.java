package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		
		/*
		 Kullan�c�dan bir gun al�n e�er gun 
		 �Cuma� ise ekrana �M�sl�manlar icin kutsal g�n� yazd�r�n.
	     �Cumartesi� ise ekrana �Yahudiler icin kutsal g�n� yazd�r�n. 
	     �Pazar� ise ekrana �Hristiyanlar icin kutsal g�n� yazd�r�n
		*/
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Bir gun giriniz");
			String gun = scan.next();
			//String'leri karsilastirirken sakin haaa "==" kullanmayin
			//String'leri karsilastirirken kesinlikle equals() kullanin
			//equals() boolean return eder.
							
			if(gun.equals("Cuma")) {
				System.out.println("M�sl�manlar icin kutsal g�n");
			}	
			if(gun.equals("Cumartesi")) {
				System.out.println("Yahudiler icin kutsal g�n");
			}		
			if(gun.equals("Pazar")) {
				System.out.println("Hristiyanlar icin kutsal g�n");
			}
			
			scan.close();		

		
		
		
		

	}

}
