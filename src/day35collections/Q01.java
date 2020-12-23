package day35collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q01 {

	public static void main(String[] args) {
		//ilk eklenen ilk silinir.FIFO:First In First Out
		Queue<String> q01 = new LinkedList<>();
		q01.add("Apple");
		q01.add("Mango");
		q01.add("Fig");
		q01.add("Peach");
		q01.add("Grape");
		System.out.println(q01);
		
		q01.remove();
		System.out.println(q01);
		
		q01.element();//size ilk elemani verir ama ilk elemani queue'dan silmez.ilk eleman yoksa nosuchelementexception verir.
		System.out.println(q01);
		q01.peek();// ilk elemani size verir queue'dan silmez element'den farki , ilk eleman yoksa " null" return eder.
		q01.poll();// size ilk elemni verir ama ilk elemani queu'dan siler.
	    System.out.println(q01);
			
	    //PriorityQueue Bazen natural order'e gore dizer bazende java arkada kendine gore bir kural olusturur ve ona dizer.
	    Queue<String> q02 = new PriorityQueue<>();
	    q02.add("Apple");
		q02.add("Mango");
		q02.add("Fig");
		q02.add("Peach");
		q02.add("Grape");
		System.out.println(q02);
		
	}

}
