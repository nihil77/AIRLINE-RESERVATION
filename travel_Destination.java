import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;




public class travel_Destination extends JFrame{

	
	 
	ImageIcon image1 = new ImageIcon("sra.png");
	 
	 
// LOCAL
	travel_Destination() {
	    String data[][] = { {"Manila","Batanes","8,000","12,500","3,500"},    
	            {"Batanes","Manila","9,800","12,950","3,900"},    
	            {"Manila","Palawan","9,100","10,500","3,200"},
	            {"Palawan", "Manila","9,850","10,975","3,575"},
	            }; 
	    
	    String column[] = {"FROM","TO","Private Class", "Business Class", "Regular Class"};  
    
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    
    //Start
    JLabel lbl = new JLabel("Passenger's Details ");
    lbl.setBounds(30,100,200,100);
    lbl.setForeground(Color.BLACK);
    lbl.setFont(new Font("VERDANA",Font.BOLD,17));
    this.add(lbl);
    //END
 
    
    
    //LABEL NAME
    JLabel lbl1 = new JLabel("Name    : ");
    lbl1.setBounds(30,220,90,100);
    lbl1.setForeground(Color.BLACK);
    lbl1.setFont(new Font("VERDANA",Font.PLAIN,12));
    this.add(lbl1);
    
    JTextField txt1 = new JTextField();
    txt1.setBounds(100,255,190,30);
    this.add(txt1);
    
   
    
    // END NAME
    
    JLabel lbl2 = new JLabel("Age      : ");
    lbl2.setBounds(30,265,90,100);
    lbl2.setForeground(Color.BLACK);
    lbl2.setFont(new Font("VERDANA",Font.PLAIN,12));
    this.add(lbl2);
    
    JTextField txt2 = new JTextField();
    txt2.setBounds(100,300,70,30);
    this.add(txt2);
    
   
  
	   //From start
	    JLabel lbl3 = new JLabel("From      : ");
	    lbl3.setBounds(30,160,90,100);
	    lbl3.setForeground(Color.BLACK);
	    lbl3.setFont(new Font("VERDANA",Font.PLAIN,12));
	    this.add(lbl3);
	    
	    String country[]={"Manila","Batanes","Palawan"};        
	    JComboBox cb = new JComboBox(country);    
	    cb.setBounds(100,198,100,30);    
	    this.add(cb);
	    //From end
	    
	    
	    
	    //Start TO
	    JLabel lbl4 = new JLabel("To       : ");
	    lbl4.setBounds(440,160,90,100);
	    lbl4.setForeground(Color.BLACK);
	    lbl4.setFont(new Font("VERDANA",Font.PLAIN,12));
	    this.add(lbl4);
	    
	    String to[]={"Batanes","Manila","Palawan"};        
	    JComboBox cb1 = new JComboBox(to);    
	    cb1.setBounds(520,198,100,30);    
	    this.add(cb1);
	    // END To
	    
	    
	    // START NUMBER_PASS
	    JLabel lbl5 = new JLabel("Number of Passenger  :  ");
	    lbl5.setBounds(440,220,200,100);
	    lbl5.setForeground(Color.BLACK);
	    lbl5.setFont(new Font("VERDANA",Font.PLAIN,12));
	    this.add(lbl5);
   
	    JTextField txt3 = new JTextField();
	    txt3.setBounds(600,255,70,30);
	    this.add(txt3);	
	    //END NUMBER_PASS
    
    
    
	    JLabel lbl6 = new JLabel("Flight type               :  ");
	    lbl6.setBounds(440,265,200,100);
	    lbl6.setForeground(Color.BLACK);
	    lbl6.setFont(new Font("VERDANA",Font.PLAIN,12));
	    this.add(lbl6);
    
	    String flight[]={"Private Class","Business Class","Regular Class"};        
	    JComboBox cb2 = new JComboBox(flight);    
	    cb2.setBounds(600,300,130,30);   
	  
	    this.add(cb2);
	   

		
	    
	    JButton button = new JButton();
		button.setText("Confirm");
		button.setFocusable(false);
		button.setFont(new Font("Comic Sans", Font.BOLD,13));
		button.setBounds(300,390,100,50);
		button.setBackground(new Color(58, 176, 124));
		button.setForeground(new Color(0,0,0));
	    this.add(button);
	    
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e ) {
			
				int d = JOptionPane.showOptionDialog(null, "Click (Yes) to Confirm", "SR Airline", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

			if (d == 0) {
					new Transaction();
					  dispose();
					  
			} else if (d == 1){
					//new travel_Destination();
					 // dispose();
					  
			}
				
				}
			});
		
		
		//START OF AGE 
		txt2.addKeyListener(new java.awt.event.KeyAdapter(){
			
			public void keyReleased(java.awt.event.KeyEvent evt) {
				try {
					long number = Long.parseLong(txt2.getText());
					if (number > 100) {
						JOptionPane.showMessageDialog(rootPane, "Invalid Age Please Try Again!", "SR Airline", JOptionPane.OK_OPTION);
						txt2.setText("");
					} else if (number == 0) {
						JOptionPane.showMessageDialog(rootPane, "Invalid Age Please Try Again!", "SR Airline", JOptionPane.OK_OPTION);
						txt2.setText("");
					}
					
				}catch (Exception e) {
					JOptionPane.showMessageDialog(rootPane, "Only Numbers Allowed");
	                txt2.setText("");
				}
			}
		});
		// END OF AGE
		
		
		
		txt3.addKeyListener(new java.awt.event.KeyAdapter() {
			
	        public void keyReleased(java.awt.event.KeyEvent evt) {
	        	try 
	        	{
	        		int x = Integer.parseInt(txt3.getText());
	               if (x > 20) {
			JOptionPane.showMessageDialog(rootPane, "Maximum Capacity 20 for Private Class", "SR Airline", JOptionPane.OK_OPTION);
	               }  

	            } 
	        	
	        	catch (NumberFormatException nfe) 
	        	{
	        		
	            	txt3.setText("");
	            }
	        }
	    });
					
		 
	    cb2.addItemListener(new ItemListener() {
	    	@Override
	  
			public void itemStateChanged(ItemEvent ie) {
	    		
	    		Object flg_type;
				if (ie.getStateChange() == ItemEvent.SELECTED) {
	    			//System.out.println(cb2.getSelectedItem());
	    			flg_type = cb2.getSelectedItem(); 
	    		} 
				
			}
			
				
		});
		
		
         
    
		
		
		
    setBounds(300, 30, 300, 218); // THE POP UP FRAME
    this.add(sp); 
    this.setSize(790,500);  
    this.setVisible(true); 
    this.setIconImage(image1.getImage());
    this.setTitle("International Type");
   // this.setResizable(false);
	    	
	    }



    	

    
	
	}



	





	import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;




public class travel_Destination extends JFrame{

	
	 
	ImageIcon image1 = new ImageIcon("sra.png");
	 
	 
// LOCAL
	travel_Destination() {
	    String data[][] = { {"Manila","Batanes","8,000","12,500","3,500"},    
	            {"Batanes","Manila","9,800","12,950","3,900"},    
	            {"Manila","Palawan","9,100","10,500","3,200"},
	            {"Palawan", "Manila","9,850","10,975","3,575"},
	            }; 
	    
	    String column[] = {"FROM","TO","Private Class", "Business Class", "Regular Class"};  
    
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    
    //Start
    JLabel lbl = new JLabel("Passenger's Details ");
    lbl.setBounds(30,100,200,100);
    lbl.setForeground(Color.BLACK);
    lbl.setFont(new Font("VERDANA",Font.BOLD,17));
    this.add(lbl);
    //END
 
    
    
    //LABEL NAME
    JLabel lbl1 = new JLabel("Name    : ");
    lbl1.setBounds(30,220,90,100);
    lbl1.setForeground(Color.BLACK);
    lbl1.setFont(new Font("VERDANA",Font.PLAIN,12));
    this.add(lbl1);
    
    JTextField txt1 = new JTextField();
    txt1.setBounds(100,255,190,30);
    this.add(txt1);
    
   
    
    // END NAME
    
    JLabel lbl2 = new JLabel("Age      : ");
    lbl2.setBounds(30,265,90,100);
    lbl2.setForeground(Color.BLACK);
    lbl2.setFont(new Font("VERDANA",Font.PLAIN,12));
    this.add(lbl2);
    
    JTextField txt2 = new JTextField();
    txt2.setBounds(100,300,70,30);
    this.add(txt2);
    
   
  
	   //From start
	    JLabel lbl3 = new JLabel("From      : ");
	    lbl3.setBounds(30,160,90,100);
	    lbl3.setForeground(Color.BLACK);
	    lbl3.setFont(new Font("VERDANA",Font.PLAIN,12));
	    this.add(lbl3);
	    
	    String country[]={"Manila","Batanes","Palawan"};        
	    JComboBox cb = new JComboBox(country);    
	    cb.setBounds(100,198,100,30);    
	    this.add(cb);
	    //From end
	    
	    
	    
	    //Start TO
	    JLabel lbl4 = new JLabel("To       : ");
	    lbl4.setBounds(440,160,90,100);
	    lbl4.setForeground(Color.BLACK);
	    lbl4.setFont(new Font("VERDANA",Font.PLAIN,12));
	    this.add(lbl4);
	    
	    String to[]={"Batanes","Manila","Palawan"};        
	    JComboBox cb1 = new JComboBox(to);    
	    cb1.setBounds(520,198,100,30);    
	    this.add(cb1);
	    // END To
	    
	    
	    // START NUMBER_PASS
	    JLabel lbl5 = new JLabel("Number of Passenger  :  ");
	    lbl5.setBounds(440,220,200,100);
	    lbl5.setForeground(Color.BLACK);
	    lbl5.setFont(new Font("VERDANA",Font.PLAIN,12));
	    this.add(lbl5);
   
	    JTextField txt3 = new JTextField();
	    txt3.setBounds(600,255,70,30);
	    this.add(txt3);	
	    //END NUMBER_PASS
    
    
    
	    JLabel lbl6 = new JLabel("Flight type               :  ");
	    lbl6.setBounds(440,265,200,100);
	    lbl6.setForeground(Color.BLACK);
	    lbl6.setFont(new Font("VERDANA",Font.PLAIN,12));
	    this.add(lbl6);
    
	    String flight[]={"Private Class","Business Class","Regular Class"};        
	    JComboBox cb2 = new JComboBox(flight);    
	    cb2.setBounds(600,300,130,30);   
	  
	    this.add(cb2);
	   

		
	    
	    JButton button = new JButton();
		button.setText("Confirm");
		button.setFocusable(false);
		button.setFont(new Font("Comic Sans", Font.BOLD,13));
		button.setBounds(300,390,100,50);
		button.setBackground(new Color(58, 176, 124));
		button.setForeground(new Color(0,0,0));
	    this.add(button);
	    
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e ) {
			
				int d = JOptionPane.showOptionDialog(null, "Click (Yes) to Confirm", "SR Airline", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

			if (d == 0) {
					new Transaction();
					  dispose();
					  
			} else if (d == 1){
					//new travel_Destination();
					 // dispose();
					  
			}
				
				}
			});
		
		
		//START OF AGE 
		txt2.addKeyListener(new java.awt.event.KeyAdapter(){
			
			public void keyReleased(java.awt.event.KeyEvent evt) {
				try {
					long number = Long.parseLong(txt2.getText());
					if (number > 100) {
						JOptionPane.showMessageDialog(rootPane, "Invalid Age Please Try Again!", "SR Airline", JOptionPane.OK_OPTION);
						txt2.setText("");
					} else if (number == 0) {
						JOptionPane.showMessageDialog(rootPane, "Invalid Age Please Try Again!", "SR Airline", JOptionPane.OK_OPTION);
						txt2.setText("");
					}
					
				}catch (Exception e) {
					JOptionPane.showMessageDialog(rootPane, "Only Numbers Allowed");
	                txt2.setText("");
				}
			}
		});
		// END OF AGE
		
		
		
		txt3.addKeyListener(new java.awt.event.KeyAdapter() {
			
	        public void keyReleased(java.awt.event.KeyEvent evt) {
	        	try 
	        	{
	        		int x = Integer.parseInt(txt3.getText());
	               if (x > 20) {
			JOptionPane.showMessageDialog(rootPane, "Maximum Capacity 20 for Private Class", "SR Airline", JOptionPane.OK_OPTION);
	               }  

	            } 
	        	
	        	catch (NumberFormatException nfe) 
	        	{
	        		
	            	txt3.setText("");
	            }
	        }
	    });
					
		 
	    cb2.addItemListener(new ItemListener() {
	    	@Override
	  
			public void itemStateChanged(ItemEvent ie) {
	    		
	    		Object flg_type;
				if (ie.getStateChange() == ItemEvent.SELECTED) {
	    			//System.out.println(cb2.getSelectedItem());
	    			flg_type = cb2.getSelectedItem(); 
	    		} 
				
			}
			
				
		});
		
		
         
    
		
		
		
    setBounds(300, 30, 300, 218); // THE POP UP FRAME
    this.add(sp); 
    this.setSize(790,500);  
    this.setVisible(true); 
    this.setIconImage(image1.getImage());
    this.setTitle("International Type");
   // this.setResizable(false);
	    	
	    }



    	

    
	
	}



	





	
