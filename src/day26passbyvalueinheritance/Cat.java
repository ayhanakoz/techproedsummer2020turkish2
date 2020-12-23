package day26passbyvalueinheritance;

public class Cat extends Animal {

	public static void main(String[] args) {
		Cat oc = new Cat();
		oc.clean();
		oc.meow();
		oc.drink();
		oc.eat();
		
		
		
			}

	public  void meow() {
		System.out.println("Miyavlarlar");
	}
	
	public  void clean() {
		System.out.println("Temizlenirler");
	}
	
	
	
}
