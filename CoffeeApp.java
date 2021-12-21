package CoffeeMachine;
import java.util.HashMap;
import java.util.Map;

	public class CoffeeApp {
	  public static void main(String[] args) {
				
		Map<CoffeeSelection, CoffeeBean> beans = new HashMap<CoffeeSelection, CoffeeBean>();
			beans.put(CoffeeSelection.ESPRESSO, 
				new CoffeeBean("My favorite espresso bean", 1000));
			beans.put(CoffeeSelection.FILTER_COFFEE, 
				new CoffeeBean("My favorite filter coffee bean", 1000));
					
			CoffeeMachine machine = new CoffeeMachine(beans);
					     
			machine.brewCoffee(CoffeeSelection.ESPRESSO);
					System.out.println("Coffee is ready!");       
				} 
	}
			
