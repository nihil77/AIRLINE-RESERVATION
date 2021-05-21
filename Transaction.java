import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Transaction extends JFrame{
	ImageIcon image1 = new ImageIcon("sra.png");
	
	
	Transaction() {
    
    
	  JLabel lbl = new JLabel("TRANSACTION DETAILS");
	   
	    
	    this.add(lbl);
	    
	   
	  
	    setBounds(300, 30, 300, 218); // THE POP UP FRAME
	  	this.setSize(790,500);  
	    this.setVisible(true); 
	    this.setIconImage(image1.getImage());
	    this.setTitle("Transaction Details");
	    
	 
	}
}
