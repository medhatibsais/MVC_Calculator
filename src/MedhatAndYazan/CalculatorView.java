package MedhatAndYazan;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class CalculatorView extends JFrame{

	public JTextField firstNumber=new JTextField(10);
	public JTextField secondNumber=new JTextField(10);
	public JTextField resultField=new JTextField(10);
	public JLabel equal=new JLabel("=");
	public JButton addButton=new JButton("+");
	public JButton subButton=new JButton("-");
	public JButton mulButton=new JButton("*");
	public JButton divButton=new JButton("/");
	public JButton modButton=new JButton("%");
	public JButton sqrtButton=new JButton("sqrt");
	
	
	
	
	public CalculatorView(){
		
		JPanel resultPanel=new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,100);
		this.setResizable(false);
		firstNumber.setText("First Number");
		secondNumber.setText("second Number");
		
		resultPanel.add(firstNumber);
		resultPanel.add(secondNumber);
		resultPanel.add(equal);
		resultPanel.add(resultField);
		resultPanel.add(addButton);
		resultPanel.add(subButton);
		resultPanel.add(mulButton);
		resultPanel.add(divButton);
		resultPanel.add(modButton);
		resultPanel.add(sqrtButton);
		
		this.add(resultPanel);
		
	}
	
	
	
	public double getFirstNumber(){
		double res=0;
		try{
	res=Double.parseDouble(firstNumber.getText());
		}
		
		catch(NumberFormatException ex){
			
			JOptionPane.showMessageDialog(this, "Please enter a number in the two both fields");
		
		}
	
		return res;
	
		
	}
	
public double getSecondNumber(){
		
	double res=0;
	try{
res=Double.parseDouble(secondNumber.getText());
	}
	
	catch(NumberFormatException ex){
		
		JOptionPane.showMessageDialog(this, "Please enter a number");
	
	}

	return res;

	
}
	
	


public double getResult() {
	
	
	return Double.parseDouble(resultField.getText());
}

public void setResult(double result){
	
	resultField.setText(new DecimalFormat("##.###").format(result));
	
}



public void resultListener(ActionListener listener){
	
	addButton.addActionListener(listener);
	subButton.addActionListener(listener);
	mulButton.addActionListener(listener);
	divButton.addActionListener(listener);
	modButton.addActionListener(listener);
	sqrtButton.addActionListener(listener);
	
	
}




	
	
}
