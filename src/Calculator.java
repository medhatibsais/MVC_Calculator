
public class Calculator {

	public static void main(String args[]){
		
		CalculatorView view =new CalculatorView();
		CalculatorModel model=new CalculatorModel();
		CalculatorController con=new CalculatorController(model, view);
		view.setVisible(true);
		
		
	}
	
}
