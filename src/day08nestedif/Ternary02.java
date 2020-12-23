package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn 
		 Eðer üç kenar uzunluðu birbirine eþit ise ekrana “Eþkenar üçgen” yazdýrýn. 
		 Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn.
		 Ternary ile cozun
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin uc kenar uzunlugunu giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
		String result = k1==k2 && k2==k3 ? "Eskenar Ucgen" : "Eskenar Ucgen Degil";
		System.out.println(result);

        scan.close();
	}

}
