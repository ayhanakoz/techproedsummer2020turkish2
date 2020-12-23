package day31abstraction;

public abstract class Otel {
 /*abstract class'i final yapamayiz cunku final class'larin child class'lari olamaz; halbuki biz 
	 abstract class'lari child class'lari olsun ve child class'lari bazi seyleri yapmaya mecbur biraksin diye olustururuz.
	 Bu celiskiden dolayi Java abstract class'larin final olmasina musaade etmez, Compile Time Error verir.
  * 
  * 
  * 
  */


  public  void wifi() {
	  System.out.println("7/24 wifi servisi");
  }
  
  public abstract void kahvalti();
  
  
  public  void cay() {
	  System.out.println("7/24 cay servisi");
	  
  }
  
  

}