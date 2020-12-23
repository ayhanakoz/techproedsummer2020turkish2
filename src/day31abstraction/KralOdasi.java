package day31abstraction;

public class KralOdasi extends Otel {

	public static void main(String[] args) {
		
		KralOdasi krl = new KralOdasi();
		krl.cay();
		krl.kahvalti();
		krl.wifi();
		
		
	}

	@Override
	public void kahvalti() {
		System.out.println("Insan gibi ye....");
	}

	@Override
	public void cay() {
		System.out.println("cay ic iyidir...");
		
	}
	
	
	

}
