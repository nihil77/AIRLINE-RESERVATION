import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;



public class flyhighMain extends JFrame{
	
	//BACKGROUND IMAGE
	
	flyhighMain(){
	
	ImageIcon image1 = new ImageIcon("sra.png");
	
	ImageIcon image3 = new ImageIcon("upAir.jpg");
	
	Border border = BorderFactory.createLineBorder(Color.BLACK,3);
	
	
	JLabel l1 = new JLabel();
	l1.setText("SAFE RESOURCE AIRLINE");
	l1.setIcon(image3);
	l1.setHorizontalTextPosition(JLabel.CENTER);
	l1.setVerticalTextPosition(JLabel.CENTER);
	l1.setForeground(new Color(75, 0, 130)); // COLOR OF FONT
	l1.setFont(new Font("Bookman old style",Font.PLAIN,35));//FONT STYLE 
	l1.setBorder(border);
	l1.setVerticalAlignment(JLabel.CENTER);
	l1.setHorizontalAlignment(JLabel.CENTER);
	l1.setBounds(60,40,500,160); 
	
	
	JLabel l2 = new JLabel();
	l2.setText("Keep yourself secure and ride to your destination");
	l2.setHorizontalTextPosition(JLabel.CENTER);
	l2.setVerticalTextPosition(JLabel.CENTER);
	l2.setForeground(new Color(207, 214, 224));
	l2.setFont(new Font("MV Boli",Font.BOLD,17));
	l2.setVerticalAlignment(JLabel.CENTER);
	l2.setHorizontalAlignment(JLabel.CENTER);
	l2.setBounds(70,130,500,200);
	//END OF LABEL
	
	JButton button = new JButton();
	button.setText("Book a Flight");
	button.setFocusable(false);
	button.setFont(new Font("Comic Sans", Font.BOLD,13));
	button.setBounds(200,320,200,50);
	button.setBackground(new Color(58, 176, 124));
	button.setForeground(new Color(0,0,0));
	button.addActionListener(new ActionListener() {
		
		String[] buttons = {"Yes","No"};
		
		public void actionPerformed(ActionEvent e ) {
			
		int c = JOptionPane.showOptionDialog(null, "Are you sure", "Booking", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (c == 0) {
				new travel_Type();
				
				dispose();   
			}
			
			 
		}
	});
    
	//END OF BUTTON
	setBounds(360, 100, 600, 218); // THE POP UP FRAME
	this.setTitle("Safe Resource Airline");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setSize(650,440);
	this.setVisible(true);
	
	this.add(l1);
	this.add(l2);
	this.add(button);
	this.setLayout(null);
	
	this.setIconImage(image1.getImage());
	this.getContentPane().setBackground(new Color(27, 95, 98)); // Background Color
	

	
	}
	
	

}
