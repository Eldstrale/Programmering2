package Aa2;

public class Audi extends Car{
	public Audi()
	{
		super.name ="Audi";
	}
	
	@Override
	void drive() {
		System.out.println("Audi is driving");
	}
}
