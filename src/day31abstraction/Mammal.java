package day31abstraction;

public abstract class Mammal extends Animal {
	/*Gordugunuz gibi Mammal ,Animal'in child classi ve asi() methodu ile drink() 
	 * methodunu override etmedi.Ama herhangi bir CTE yok.cunku;abstact childlarin abstract
	 *  methodlari override etme zorunlulugu yoktur.
	 * 
	 * 
	 * 
	 */

	public abstract void feed();
	
	public  void move() {
		System.out.println("Hareket ederler");
	}
	
	
	
}
