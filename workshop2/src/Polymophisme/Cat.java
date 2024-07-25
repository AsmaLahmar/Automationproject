package Polymophisme;

public class Cat implements Animal  {

	@Override
	public void manger() {
		System.out.println("le chat peut manger");
		
		
	}

	@Override
	public void boire() {
		System.out.println("le chat peut boire");
		
		
	}

	@Override
	public void voyager() {
		System.out.println("le chat peut voyager");
		
		
	}

}
