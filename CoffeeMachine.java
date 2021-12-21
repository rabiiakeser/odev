package CoffeeMachine;

import java.util.Map;

public class CoffeeMachine {
	    
	   private Map<CoffeeSelection, Configration> configMap;
	   private Map<CoffeeSelection, CoffeeBean> beans;
	   private Grinder grinder;
	   private BrewingUnit brewingUnit;

	public CoffeeMachine(Map<CoffeeSelection, CoffeeBean> beans) {
		
	}


	public Coffee brewCoffee(CoffeeSelection selection ) {
	   return null;
	}
	
    private Coffee brewEspresso() {
       return null;
    }
    
    private Coffee brewFilterCoffee() {
      return null;
    }
}

