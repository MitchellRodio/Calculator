package cm;


import javax.swing.*;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;  
public class Calculator {  
public static void main(String[] args) {  
	
	String input1 = null;
	String input2 = null;
	String operator = null;
	
	String finalAnswer;
	
	
	
	
//	BELOW = JAVA GUI 
JFrame f=new JFrame();//creating instance of JFrame  
f.getContentPane().setBackground(Color.BLACK);
f.getContentPane().setForeground(Color.BLACK);
          
JButton answer=new JButton("");
answer.setEnabled(false);
answer.setBackground(Color.DARK_GRAY);
answer.setForeground(Color.RED);
answer.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
answer.setBounds(10,10,366, 40);//x axis, y axis, width, height  
          
f.getContentPane().add(answer);//adding button in JFrame  
          
f.setSize(400,500);//400 width and 500 height  
f.getContentPane().setLayout(null);//using no layout managers  
JButton divide = new JButton("Divide (/)");
divide.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String operator = "/";
		JButton clicked = (JButton) e.getSource();
		 answer.setText("/");
	}
});
divide.setBounds(207, 70, 169, 40);
f.getContentPane().add(divide);
JButton clear = new JButton("Clear");
clear.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String input1 = null;
		String input2 = null;
		String operator;
		
		JButton clicked = (JButton) e.getSource();
		 answer.setText("Cleared");
		
	}
});
clear.setBounds(10, 70, 176, 40);
f.getContentPane().add(clear);
JButton seven = new JButton("7");
seven.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if (input1 == null) {
			 final String input1 = "7";
			 JButton clicked = (JButton) e.getSource();
			 answer.setText(input1);
			
		} else if (input1 != null) {
			final String input2 = "7";
			JButton clicked = (JButton) e.getSource();
			 answer.setText(input2);
		}
	}
});
seven.setBounds(10, 120, 80, 40);
f.getContentPane().add(seven);
JButton eight = new JButton("8");
eight.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if (input1 == null) {
			 final String input1 = "8";
			 JButton clicked = (JButton) e.getSource();
			 answer.setText(input1);
			
		} else if (input1 != null) {
			final String input2 = "8";
			JButton clicked = (JButton) e.getSource();
			 answer.setText(input2);
		}
	}
});
eight.setBounds(106, 120, 80, 40);
f.getContentPane().add(eight);
JButton nine = new JButton("9");
nine.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if (input1 == null) {
			 final String input1 = "9";
			 JButton clicked = (JButton) e.getSource();
			 answer.setText(input1);
			
		} else if (input1 != null) {
			final String input2 = "9";
			JButton clicked = (JButton) e.getSource();
			 answer.setText(input2);
		}
	}
});
nine.setBounds(206, 120, 80, 40);
f.getContentPane().add(nine);
JButton multiply = new JButton("*");
multiply.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String operator = "*";
		JButton clicked = (JButton) e.getSource();
		 answer.setText("*");
	}
});
multiply.setBounds(296, 120, 80, 40);
f.getContentPane().add(multiply);
JButton four = new JButton("4");
four.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if (input1 == null) {
			 final String input1 = "4";
			 JButton clicked = (JButton) e.getSource();
			 answer.setText(input1);
			
		} else if (input1 != null) {
			final String input2 = "4";
			JButton clicked = (JButton) e.getSource();
			 answer.setText(input2);
		}
	}
});
four.setBounds(10, 170, 80, 40);
f.getContentPane().add(four);
JButton five = new JButton("5");
five.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if (input1 == null) {
			 final String input1 = "5";
			 JButton clicked = (JButton) e.getSource();
			 answer.setText(input1);
			
		} else if (input1 != null) {
			final String input2 = "5";
			JButton clicked = (JButton) e.getSource();
			 answer.setText(input2);
		}
	}
});
five.setBounds(106, 170, 80, 40);
f.getContentPane().add(five);
JButton six = new JButton("6");
six.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if (input1 == null) {
			 final String input1 = "6";
			 JButton clicked = (JButton) e.getSource();
			 answer.setText(input1);
			
		} else if (input1 != null) {
			final String input2 = "6";
			JButton clicked = (JButton) e.getSource();
			 answer.setText(input2);
		}
		
	}
});
six.setBounds(206, 170, 80, 40);
f.getContentPane().add(six);
JButton subtract = new JButton("-");
subtract.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String operator = "-";
		JButton clicked = (JButton) e.getSource();
		 answer.setText("-");
	}
});
subtract.setBounds(296, 170, 80, 40);
f.getContentPane().add(subtract);
JButton one = new JButton("1");
one.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if (input1 == null) {
			 final String input1 = "1";
			 JButton clicked = (JButton) e.getSource();
			 answer.setText(input1);
			
		} else if (input1 != null) {
			final String input2 = "1";
			JButton clicked = (JButton) e.getSource();
			 answer.setText(input2);
		}
	}
});
one.setBounds(10, 220, 80, 40);
f.getContentPane().add(one);
JButton two = new JButton("2");
two.setBounds(106, 220, 80, 40);
f.getContentPane().add(two);
JButton three = new JButton("3");
three.setBounds(206, 220, 80, 40);
f.getContentPane().add(three);
JButton b_1_1_1_11 = new JButton("+");
b_1_1_1_11.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String operator = "+";
		JButton clicked = (JButton) e.getSource();
		 answer.setText("+");
	}
});
b_1_1_1_11.setBounds(296, 220, 80, 40);
f.getContentPane().add(b_1_1_1_11);
JButton equals = new JButton("=");
equals.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String finalAnswer = (input1 + (operator) + input2);
		
		JButton clicked = (JButton) e.getSource();
		 answer.setText(finalAnswer);
	}
});
equals.setBounds(296, 270, 80, 40);
f.getContentPane().add(equals);
JButton point = new JButton(".");
point.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		// TBD
	}
});
point.setBounds(206, 270, 80, 40);
f.getContentPane().add(point);
JButton zero = new JButton("0");
zero.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		if (input1 == null) {
			 final String input1 = "0";
			 JButton clicked = (JButton) e.getSource();
			 answer.setText(input1);
			
		} else if (input1 != null) {
			final String input2 = "0";
			JButton clicked = (JButton) e.getSource();
			 answer.setText(input2);
		}
		
	}
});






zero.setBounds(10, 270, 176, 40);
f.getContentPane().add(zero);
JLabel label = new JLabel("New label");
label.setBounds(177, 370, 45, 13);
f.getContentPane().add(label);
f.setVisible(true);//making the frame visible  
}  

public void actionPerformed(ActionEvent a) {
	
	double input1, input2;
	
	
	
}




}  
