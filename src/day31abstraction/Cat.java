package day31abstraction;

public class Cat extends Mammal {
	/*contrete classlar parentlari olan abstract classslardaki
	 *  tum abstract methodlari override etmek zorundadir.Aksi takdirde CTE olusur.
	 * 2.contrete classlar parentlari olan abstract classlardaki contrete mthodlari override 
	 * etmek zorunda degildirler.
	 * 3. 3)Concrete class'lar TUM abstract parent'larindaki TUM abstract methodlari
	   override etmek zorundadirlar. Aksi takdirde Compile Time Error olusur.  
	 * 
	 * 
	 */
	
	
	

	public static void main(String[] args) {
		

	}

	@Override
	public void asi() {
		System.out.println("ey kedi igne ol");
	}

	@Override
	public void feed() {
		
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

}
