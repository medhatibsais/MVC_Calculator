import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class CalculatorView extends JFrame{

	private JTextField firstNumber=new JTextField(10);
	private JTextField secondNumber=new JTextField(10);
	private JTextField resultField=new JTextField(10);
	private JLabel equal=new JLabel("=");
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
		
		return Double.parseDouble(firstNumber.getText());
	}
	
public double getSecondNumber(){
		
		return Double.parseDouble(secondNumber.getText());
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
