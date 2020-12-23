package day34collections;

import java.util.LinkedList;
import java.util.List;

public class Li01 {

	public static void main(String[] args) {
	 // Linkedlist elemanlari giri; sirasina gore siralar(insertion order)
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Veliye");
		linkedList.add("Aliye");
		linkedList.add("Burhan");
		linkedList.add("Burhan");
		linkedList.add("Canan");
		linkedList.add("Kemal");
		linkedList.add("Reyhane");
		System.out.println(linkedList);
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("XXXX");
		linkedList2.add("YYYY");
		linkedList2.add("ZZZZ");
		System.out.println(linkedList2);
		
		linkedList.add(1,"Cemal");
		System.out.println(linkedList);
		
		linkedList.addFirst("Kayhan");
		System.out.println(linkedList);
		  
		linkedList.addLast("Ayse");
		System.out.println(linkedList);
		
		linkedList.addAll(linkedList2);
		System.out.println(linkedList);
		
		linkedList.addAll(5,linkedList2);
		System.out.println(linkedList);
		
		linkedList.remove();//ilk elemani siler.
		System.out.println(linkedList);
		
		linkedList.remove(1);//index' i 1 olani siler/
		System.out.println(linkedList);
		
		linkedList.remove("Canan");
		System.out.println(linkedList);
		
		linkedList.remove("Saz");//olmayan elemani silmek istersek error vermez.
		System.out.println(linkedList);
		
		linkedList.remove("YYYY");//TEKRARLI ELEMANLARDAN ILKINI SILER.
		System.out.println(linkedList);
		
		linkedList.removeFirstOccurrence("ZZZZ");
		System.out.println(linkedList);
		
		linkedList.removeLastOccurrence("XXXX");
		System.out.println(linkedList);
		
		linkedList.removeAll(linkedList2);
		System.out.println(linkedList);
		
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		linkedList.removeLast();
		System.out.println(linkedList);
		
		linkedList.removeIf(t->t.contains("a"));
		System.out.println(linkedList);
		
		
		
		
		
		
		
		
		
		
		
	}

}
