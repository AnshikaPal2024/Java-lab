package Inheritence;

public class Cat extends Dog  {
	
	public void mewo() {
		
		System.out.println("Cat is mewoing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat  c = new Cat();
		c.eat();
		
		c.bark();
		
		c.mewo();
		

	}

}
