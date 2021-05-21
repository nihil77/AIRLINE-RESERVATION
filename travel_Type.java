import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class travel_Type extends JFrame{
	JButton button1,button2,button3;
	JLabel label;
	
	travel_Type(){
		
		Border border = BorderFactory.createLineBorder(Color.BLACK,3);
		ImageIcon image1 = new ImageIcon("sra.png");
		
		button1 = new JButton("LOCAL");
		button1.setBounds(100,60,90,30);
		button1.setFocusable(false);
		button1.setFont(new Font("Comic Sans", Font.BOLD,13));
		button1.setBackground(new Color(58, 176, 124));
		button1.setForeground(new Color(0,0,0));
		
		button2 = new JButton("INTERNATIONAL");
		button2.setBounds(230,60,140,30);
		button2.setFocusable(false);
		button2.setFont(new Font("Comic Sans", Font.BOLD,13));
		button2.setBackground(new Color(58, 176, 124));
		button2.setForeground(new Color(0,0,0));
		
		button3 = new JButton("HOME");
		button3.setBounds(410,60,90,30);
		button3.setFocusable(false);
		button3.setFont(new Font("Comic Sans", Font.BOLD,13));
		button3.setBackground(new Color(58, 176, 124));
		button3.setForeground(new Color(0,0,0));
		
		label = new JLabel();
		label.setText("Please Select a Travel type");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.CENTER);
		label.setForeground(new Color(3, 28, 29));
		label.setFont(new Font("VERDANA",Font.BOLD,25));
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(60,40,500,160);
	
		
		button1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			      if(e.getSource()==button1) 
			      {
			    	  new travel_Destination();
			    	  dispose();   
			      }
			}
		});

		button2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			      if(e.getSource()==button2) 
			      {
			    	 new travel_Destination2();
			    	  dispose();   
			      }
			}
		});
		
		button3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			      if(e.getSource()==button3) 
			      {
			    	  new flyhighMain();
			    	  dispose();
			    	    
			      }
			}
		});
		

		setBounds(360, 100, 600, 218); // THE POP UP FRAME
		this.getContentPane().setBackground(new Color(27, 95, 98));
		this.setTitle("Travel Type");
		this.setSize(640,300);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(label);
		this.setIconImage(image1.getImage());
		
	}
}

			
			
			
			
