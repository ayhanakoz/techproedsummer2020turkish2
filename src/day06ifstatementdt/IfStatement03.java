package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		// kullanicidan bir sayi alin sayi negatif ise "negatif" yazdirin
		// sayi pozitif ise "pozitif" yazdirin sayi sifir ise ekrana 'notr" yazdirin
		
		
		
		/*
		 Kullanicidan bir sayi alin
		 Bu sayi 0'dan 9'a kadar ise ekrana "Rakam" yazdirin
		 Bu sayi 9 dan buyuk ve 100 den kucuk ise ekrana "Iki basamakli sayi" yazdirin
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int num = scan.nextInt();
		
		if(num>=0 && num<=9) {
			System.out.println("Rakam");
		}		
		if(num>9 && num<100) {
			System.out.println("Iki basamakli sayi");
		}		
		scan.close();

	}

}