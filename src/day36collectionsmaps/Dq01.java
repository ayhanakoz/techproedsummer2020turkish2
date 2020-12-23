package day36collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;

public class Dq01 {

	public static void main(String[] args) {
		// Deque:Double Ended Queue/double ended = iki uclu demektir.
		// FIFO calisir.Last In First Out (LIFO) calisir.
		
		Deque<String> dq01 = new LinkedList<>();
		dq01.add("Ali");
		dq01.addFirst("Veli");
		dq01.addLast("Can");
		dq01.add("Ayse");
		dq01.addFirst("Emine");
		dq01.addLast("Reyhan");
		System.out.println(dq01); 
		
		dq01.element();// ilk elemani silmez  size gosterir.ilk eleman yoksa exception atar.
		System.out.println(dq01.element());
		dq01.peek();//ilk elemani getirir silmeden size gosterir.ilk eleman yoksa "null' return eder.
		System.out.println(dq01.peek());
		
		System.out.println(dq01.peekLast());
		
		System.out.println(dq01.poll());
		System.out.println(dq01);
		System.out.println(dq01.pollLast());
		System.out.println(dq01);
	}

}
