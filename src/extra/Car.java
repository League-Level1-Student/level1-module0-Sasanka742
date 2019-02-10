package extra;

public class Car {
	public static void main(String[] args) {
		CarMain s = new CarMain("AMG 63",2016);
		
	
	}	
	
	
}

public  class CarMain{
	private String carModel;
	private int carYear;
	
	CarMain(String model,int year){
		this.carModel=model;
		this.carYear=year;
	}
	
	
	String getModel() {
		return this.carModel;
	}
	void setMode(String model) {
		this.carModel=model;
	}
	
	
	
	
}
