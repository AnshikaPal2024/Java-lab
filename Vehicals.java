package Inheritence;

public class Vehicals implements car,Bike{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicals v=new Vehicals();
		v.ride();
		v.drive();
		v.parking();
		v.servicing();

	}

	@Override//to change the body
	public void ride() {
		System.out.println("i love to ride bike");
		
	}

	@Override//to change the body
	public void drive() {
		System.out.println("car is my favatorite");
		
		
	}

	@Override//to change the body
	public void parking() {
		System.out.println("parking inside my house");
		
	}
	@Override
	//to change the body
	public void servicing() {
		System.out.println("giving service to customer");
	}

	
	

}
