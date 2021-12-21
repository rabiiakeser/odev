package CoffeeMachine;

public class Coffee {
	 private CoffeeSelection selection;
	 private double quantity;
	  	
	    public Coffee(CoffeeSelection selection , double quantity) {
	        super();
	        this.selection = selection;
	        this. quantity = quantity;
	    }
	

		public CoffeeSelection getSelection() {
			return selection;
		}

		public void setSelection(CoffeeSelection selection) {
			this.selection = selection;
		}

		public double getQuantity() {
			return quantity;
		}

		public void setQuantity(double quantity) {
			this.quantity = quantity;
		}
	
      
}
