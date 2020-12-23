package day28overriding;

public class Dog extends Animal {
/* 1.Parent daki methodu signature sini degisrmden
 *  method body sini dgistirerek Child Class da kullanmaya "Method Overriding" denir
 * 2.Parent class daki private methodlar override edilemez.
 * 3.Final methodlar ovrid edilemezler cunku 
 * final methodlarin body leri olabilecekleri son haldedir yani 
 * method boyd leri degistirilemez/
 * 4.Static methodlar override edilemez.CUNKU STATIC METHODLAR ORTAK KULLANIMA ACIKTIR.
 * Degistirmek hrkesi etkilecginden java buna musade etmez.
 * 5.Child class daki ovrride edilmis method (overridding method) acces modifire i
 *  Parent class daki override edilmis (overriden method) un 
 *  acces modifireinden daha dar olamaz.
 *  6.Child class daki override edilmis methodun return type i
 *   ya parent class daki override edilmis methodun return type ile
 *    ayni olur veya onun child larindan biri olabilir
 * 
 */
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
   }
	
	public void sound() {
		System.out.println("Havlarlar");
	}

	@Override// Annotation : Bu asagidaki methodun override
	//kurallarina uygun olarak override edilip edilmedigini kontrol eder.
	public void numOfFood() {
		System.out.println("4 ayagi vardir");
		
	}
}
