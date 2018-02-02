import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

	private CalculatorView view;
	private CalculatorModel model;
	
	public CalculatorController(CalculatorModel model,CalculatorView view){
		
		this.view=view;
		this.model=model;
		this.view.resultListener(new solutionListener());
		
		
	}
	
	class solutionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			double number1,number2=0;
			
			number1=view.getFirstNumber();
			number2=view.getSecondNumber();
		
			if(event.getSource()==view.addButton) model.Add(number1, number2);
			else if(event.getSource()==view.subButton) model.Subtract(number1, number2);
			else if(event.getSource()==view.mulButton) model.Multiply(number1, number2);
			else if(event.getSource()==view.modButton) model.Mod(number1, number2);
			else model.Divide(number1, number2);
			
			view.setResult(model.getResult());
			
			
			
		}
		
	}
	
	
}
