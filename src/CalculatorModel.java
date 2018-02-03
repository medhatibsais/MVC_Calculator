
public class CalculatorModel {

	private double result=0;
	
	public void Add(double firstNumber,double secondNumber){
		
		result=firstNumber+secondNumber;
	}

	public void Subtract(double firstNumber,double secondNumber){
		
		result=firstNumber-secondNumber;
	}
	
	
	public void Multiply(double firstNumber,double secondNumber){
		
		result=firstNumber*secondNumber;
	}
	
	public void Divide(double firstNumber,double secondNumber){
		
		result=firstNumber/secondNumber;
	}
	
	
public void Mod(double firstNumber,double secondNumber){
		
		result=firstNumber%secondNumber;
	}
	
	
	
	public void MySqrt(double firstNumber){
		result=Math.sqrt(firstNumber);
		
	}
	
	public double getResult(){
		
		return result;
	}
	
}
