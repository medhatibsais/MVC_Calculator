import javax.swing.JOptionPane;

import javafx.scene.control.SplitPane.Divider;

public class CalculatorModel {

	private double result=0;
	
	public double Add(double firstNumber,double secondNumber){
		
		result=firstNumber+secondNumber;
		return result;
	}

	public double Subtract(double firstNumber,double secondNumber){
		
		result=firstNumber-secondNumber;
		return result;
	}
	
	
	public double Multiply(double firstNumber,double secondNumber){
		
		result=firstNumber*secondNumber;
		return result;
	}
	
	public double Divide(double firstNumber,double secondNumber){
		
	if(secondNumber!=0.0){
		result=firstNumber/secondNumber;
		return result;
	}
		
	else	{JOptionPane.showMessageDialog(null, "You Can't Divide By Zero");
	
return -2;	
	}
	
	
	}
	
	
public double Mod(double firstNumber,double secondNumber){
	
	
	if(secondNumber!=0.0){	
		result=firstNumber%secondNumber;
		return result;
	}

	
	else {	JOptionPane.showMessageDialog(null, "You Can't Divide By Zero");
	return -2;
	}
	
	}
	
	
	
	public double MySqrt(double firstNumber){
		if(firstNumber>0){
		result=Math.sqrt(firstNumber);
		return result;
		}
		else {
			JOptionPane.showMessageDialog(null, "Enter a Positive Number");
			return -2;
		}
	}
	

	
}
