package Builder;

public class Dealer {

	private BuildCarInterface carBuilder;
	
	public Dealer(BuildCarInterface carBuilder) {
		
		this.carBuilder = carBuilder;
	}
	
	public Car getCar() {
		
		return this.carBuilder.getCar();
	}
	
	public void buildCar() {
		
		carBuilder.buildBrand();
		carBuilder.buildColor();
		carBuilder.buildModel();
	} 
	
}
