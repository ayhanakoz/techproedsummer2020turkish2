package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n 
		 E�er �� kenar uzunlu�u birbirine e�it ise ekrana �E�kenar ��gen� yazd�r�n. 
		 Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n.
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
