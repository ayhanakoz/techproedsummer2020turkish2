package day27inheritance;

public class Dog extends Mammal {
/*java da bir class sadece bir class a extend edebilir.
 * java da bir class in sadece bir tane parent i olabilir.
 * java multiple inherintance i onaylamaz.
 * 2. protected ve public methodlar inheritance ye uygundur.
 * private methodlar inheratance a uygun degildirler.
 * default ayni package da iseniz inheritance a uygundur
 *  ama farkli package iseniz uygun degildir.Kulanmak risklidir 
 *  bu yuzden inheritance da default access modifier kullanilmaz.
 * 3.parent = super class
 *   child class=Sub Class
 */   
	public boolean loyal = true;
	
	public Dog() {
		System.out.println("Dog");
	}
	
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.drink();
		dog.eat();
		dog.feed();
		dog.smell();
		System.out.println("Sadik? " +dog.loyal);	
		System.out.println("Dogum? " + dog.dogum);
		System.out.println("Yas? " +dog.age);
	}

	
	public void bark() {
		System.out.println("Havlarlar");
	}
	public void smell() {
		System.out.println("iyi koku alilar");
	}
	
	
}
