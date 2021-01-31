package Builder;

public class BuildBmw implements BuildCarInterface{

	private Car car ;
	
	public BuildBmw() {
		
		this.car = new Car();
	}
	
	@Override
	public void buildBrand() {
		// TODO Auto-generated method stub
	
		car.setBrand("BMW");
	}

	@Override
	public void buildModel() {
		// TODO Auto-generated method stub
		
		car.setModel("M4");
	}

	@Override
	public void buildColor() {
		// TODO Auto-generated method stub
		
		car.setColor("black");
	}

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return this.car;
	}
	

}
