package day27inheritance;

public class Mammal extends Animal{
	
	public boolean dogum = true;
	
	
	public Mammal() {
		System.out.println("Mammal");
	}
	
	

	public static void main(String[] args) {
		
	}

	public void feed() {
		System.out.println("Yavrularini beslerler");
	}
}
