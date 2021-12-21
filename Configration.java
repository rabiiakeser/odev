package CoffeeMachine;

public class Configration {
	
	 private double quantityCoffee;
	 private double quantityWater;
	 
	 public void Configuration(double quantityCoffee, double quantityWater) {
		 this.quantityCoffee = quantityCoffee;
		 this.quantityWater = quantityWater;
		 
	 }

	public double getQuantityCoffee() {
		return quantityCoffee;
	}

	public double getQuantityWater() {
		return quantityWater;
	}

}
