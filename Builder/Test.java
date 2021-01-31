package Builder;

public class Test {

	public static void main(String[] args) {
		
		BuildCarInterface buildBmw = new BuildBmw();
		
		Dealer dealer = new Dealer(buildBmw);
		dealer.buildCar();
		
		Car bmw = dealer.getCar();
		System.out.println("Brand: "+ bmw.getBrand()+ " Model: "+ bmw.getModel() + " Color: "+bmw.getColor() );
	}
}
