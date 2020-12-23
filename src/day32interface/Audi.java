package day32interface;

public class Audi implements Car,Klima{

	public static void main(String[] args) {
		

	}

	public void motor() {
		System.out.println("2.8 Turbo Benzinli");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri");
		
	}

	@Override
	public void teker() {
		System.out.println("Michellin 24 inch celik jant");
		
	}

	@Override
	public void isitma() {
	System.out.println("Akilli isitma");
		
	}

	@Override
	public void antiBakteri() {
		System.out.println("100% bakteri koruma");
		
	}

	@Override
	public void fiyat() {
		// TODO Auto-generated method stub
		
	}

}
