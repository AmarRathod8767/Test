package Test;

public class Coustmor {

	public static void main(String[] args) {
		Bank obj=new Bank();
		System.out.println("Enter Pin");
		obj.bal=500000;
		int pin=obj.s.nextInt();
		obj.logic(pin);

	}

}
