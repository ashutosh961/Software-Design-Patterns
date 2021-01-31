package Builder;

public class Car implements CarInterface {

	String brand;
	String color;
	String model;
	
	@Override
	public void setBrand(String brand) {
		// TODO Auto-generated method stub
		
		this.brand = brand;
	}

	@Override
	public void setModel(String model) {
		// TODO Auto-generated method stub
		
		this.model = model;
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		
		this.color = color;
	}
	
	public String getBrand() {
	
		return brand ;
	}
	
	public String getModel(){
		
		return model ;
	}
	
	public String getColor() {
	
		return color ;
	}
	
}
