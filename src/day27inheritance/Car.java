package day27inheritance;

public class Car extends Vehicle {
  /* super()ile parentten consturtor cagiriken parametrelre dikkat edin.
   * Parent class da olmayan bir constructor i super () ile cagirirsaniz CTE alirsiniz.
   * 
   * this () class icindki constructor lari cagirmak icin kullanilir.
   */
	
	
		public Car() {
		super(2);
		System.out.println("Car");
	}
	public Car(String name) {
		this();
		System.out.println("Car");
	}
					
	public static void main(String[] args) {
		Car car = new Car("Honda");

	}

}
