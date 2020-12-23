package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		 
		List <Integer> il = new ArrayList<>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		il.add(26);
		// for-eachil.add(23); loop = enhanced loop
		// for-each loop array lerde kullanilmaz
		
		for (Integer w : il) {
			System.out.println(w);
		}
		
		// il list'inin tum elemanlarini toplayiniz 
		 int  sum = 0 ;
		 for (Integer w : il) {
			 sum = sum + w ;
		 }
		System.out.println(sum);
		 for (int w : il) {
			 if(w%2!=0) {
				 System.out.println(w);
			 }
		 }
		
		// break ve countinue karsilastirilmasi
		 // il list 'inin ilk 3 elemaninin yazdirilmasi
		 
		int count = 0;
				for (int w : il) {
			if(count<3) {
				System.out.print(w + " ");
				count++;
			}
		}
		
		for (int w : il) {
			if(w%3==0) {
				System.out.println(w);
			}
		}
		
		for(int w : il) {
			if(w%3!=0) {
				continue;
			}else {
				System.out.print(w + " " );
			}
		}
		
		
		
		
		
		
		
	}

}
