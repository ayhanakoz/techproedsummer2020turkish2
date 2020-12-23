package day15constructors;

public class Araba {
	
	// 1. araba                    //  bir class tan farkli constructor ile farkli araba urettebiliriz
	
	String marka = "Toyota";
	String model = "Rav4";
	int fiyat = 20000;
	int yil = 2019;
	
	// 2. araba 
	//Constructor uretecegiz ve Arabanin bazi ozeliklerini degistirecegiz
	
	Araba(String model, int fiyat){
		this.model = model; 
		this.fiyat = fiyat;
	}
	// 3. araba
	// Constructor uretip Araba nin  tum ozellikleri degistirecegiz.
	
	Araba( String marka , String model, int yil,  int fiyat){
		
		this.marka = marka;
		this.model = model; 
		this.yil = yil;
		this.fiyat = fiyat;
		
		
		
		
	}
	Araba (){ // bunu asagidaki default constructor calissin diye yazdik (sonradan)
		
	}

	public static void main(String[] args) {
		
		//1.Araba 
	Araba a1 = new Araba();  // ilk obje
		
		System.out.println("Fiyat:"+ a1.fiyat);// 20000
		
		System.out.println("Marka:"+a1.marka); // Toyota
		
		System.out.println("Model:"+ a1.model);// Rav4
		
		System.out.println("Yil:"+ a1.yil); // 2019
		
		a1.hizlanma();
		a1.tuketim();
		
		System.out.println("================");
		
		//2.Araba
		
		Araba a2 = new Araba("Corolla" , 12000);// 2. obje 
		
         System.out.println("Fiyat"+ a2.fiyat);// 12000
		
		System.out.println("Marka:"+a2.marka); // Toyota
		
		System.out.println("Model:"+ a2.model);// Corolla
		
		System.out.println("Yil:"+ a2.yil); // 2019
		a2.hizlanma(9);
		a2.tuketim();
		
		System.out.println("================");
		
		//3.Araba
		
		Araba a3 = new Araba ("Honda", "Jazz", 2010 ,  7500);// 2. obje 
		
        System.out.println("Fiyat:"+ a3.fiyat);// 12000
		
		System.out.println("Marka:"+a3.marka); // Toyota
		
		System.out.println("Model:"+ a3.model);// Corolla
		
		System.out.println("Yil:"+ a3.yil); // 2019
		a3.hizlanma(8);
		a3.tuketim();
		
	}
	public void hizlanma() {                             // 1. Araba bu methodu kullanir. 
		System.out.println( "12 sn de 100 km/sa e ulasir");
	
}
	public void hizlanma(int i) {                        //2. ve 3. Araba bu methodu kullanir.(int kullandik
		System.out.println(i+ " sn de 100 km/sa e ulasir");
	}
	
	public void tuketim() {                               // Her 3 araba da bu methodu kullanir.
		System.out.println("km de 0,1 dolar yakar");
	}
}

