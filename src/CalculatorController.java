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
		
			if(event.getSource()==view.addButton) view.setResult(model.Add(number1, number2));
			else if(event.getSource()==view.subButton)view.setResult( model.Subtract(number1, number2));
			else if(event.getSource()==view.mulButton)view.setResult( model.Multiply(number1, number2));
			else if(event.getSource()==view.modButton)view.setResult( model.Mod(number1, number2));
			else if(event.getSource()==view.sqrtButton)view.setResult( model.MySqrt(number1));
			else view.setResult(model.Divide(number1, number2));
			
			
			
			
			
		}
		
	}
	
	
}
