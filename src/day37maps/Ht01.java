package day37maps;

import java.util.Hashtable;

public class Ht01 {

	public static void main(String[] args) {
		/*
		 * Soru: HashMap ile Hashtable'in farki nedir?
		 * Cevap: 1)HashMap not-synchronized ve not-threadsafe'dir ama Hashtable synchronized ve threadsafe'dir.
		    2)HashMap 1 tane null key ve 1'den fazla null value kabul eder ama Hashtable key icin de value icin de null kabul etmez.
		    3)HashMap hizli, HashTable yavastir.
	 */
		 Hashtable<Integer,String> ht = new Hashtable<>();
         ht.put(100, "Ali");
         ht.put(101, "Veli");
         ht.put(102, "Aylin");
         ht.put(103, "Emine");
         System.out.println(ht);
        // ht.put(null, "Ramazan");//Hastableda key yerine null kullanilmaz."nullpointerexception aliriz.
         //System.out.println(ht);
         
         //ht.put(104, null);
         //System.out.println(ht);//Hastableda value yerine null kullanilmaz."nullpointerexception aliriz
         
         ht.putIfAbsent(101, "Kemal");//101 key yoksa kemal i map e yerlestirir varsa yerlestirmez.
         System.out.println(ht);
         
         
         
         
         
         
         
}
}