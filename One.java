import javax.swing.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class One extends JFrame implements ActionListener{    
	
			
		    private static JFrame f;
			private static JLabel l;
			JFrame frame = new JFrame("Fly High Plane");
		    JLabel label,l1,l2,l3,l4,l5,l6,l7,l8;
		    JPanel p1,p2;
		    JButton b1;
		    JTextField tf1,tf2,tf3,tf4;
		   
		   One() {

		    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			     frame.setResizable(true);
			     frame.setVisible(true);
			     frame.setSize(800, 700);
			     frame.setLayout(null);
			    
			     
			     String airplaneType[]={"PRIVATE","BUSINESS","REGULAR FEE"};        
			     final JComboBox cb1 =new JComboBox(airplaneType); 
			     cb1.setBounds(180,140,160,35);
			     frame.add(cb1);
			     
			   String travelType[] = {"LOCAL", "INTERNATIONAL"};
			   final JComboBox cb2 = new JComboBox(travelType);
			   cb2.setBounds(510,140,160,37);
			   frame.add(cb2);
			    
			   String LocalDestination[] = {"Manil - Batanes", "Batanes - Manila", "Manila - Palawan", "Palawan - Manila"};
			   final JComboBox cb3 = new JComboBox(LocalDestination);
			   cb3.setBounds(550,420,155,30);
			   frame.add(cb3);
			   
			   String ToDestination[] = {"", "Batanes", "Palawan"};
			   final JComboBox cb4 = new JComboBox(ToDestination);
			   cb3.setBounds(550,420,155,30);
			   frame.add(cb4);
			   
			   
		        //LABEL 0
		        label = new JLabel("WELCOME TO FLY HIGH TICKETING SYSTEM");
		        label.setBounds(190, 10, 700, 50);
		        label.setFont(new Font("FORTE",Font.PLAIN,20));
		        label.setForeground(Color.white);
		        frame.add(label);
		        frame.setVisible(true);
		       
		        
		        ImageIcon image = new ImageIcon("airplane_033.jpg");
		        frame.setIconImage(image.getImage());
		        frame.getContentPane().setBackground(new Color(25, 32, 31));
		        frame.setVisible(true);
		        //END WITH MAIN FRAME
		        
		        
		        //LABEL 1
		        l1 = new JLabel("Booking Details");
		        l1.setBounds(310, 70, 700, 50);
			    l1.setFont(new Font("MV Boli",Font.PLAIN,20));
			    l1.setForeground(Color.black);
			    frame.add(l1);
			    frame.setVisible(true);  
			    //END
			    
		        
			    //LABEL 2
		       l2 =  new JLabel("Airplane type");;
		       l2.setBounds(50, 130, 700, 50);
		       l2.setFont(new Font("ARIAL",Font.PLAIN,20));
		       l2.setForeground(Color.black);
		       frame.add(l2);
		       l2.setVisible(true);
		       frame.setVisible(true);
		      //END LABEL 2
		      
		       
		       l3 = new JLabel("Travel Type");
		       l3.setBounds(400,130,700,50);
		       l3.setFont(new Font("ARIAL",Font.PLAIN,20));
		       l3.setForeground(Color.black);
		       frame.add(l3);
		       
		       b1 = new JButton("Next");
		       
		       //LABEL4
		       l4 = new JLabel("Passenger Details");
		       l4.setBounds(310,320,700,50);
		       l4.setFont(new Font("MV Boli", Font.PLAIN,20));
		       l4.setForeground(Color.black);
		       frame.add(l4);
		      
		       //END
		       
		       
		       //LABEL 5
		       l5 = new JLabel("Name: "); //CONDITION
		       l5.setBounds(40,360,300,50);
		       l5.setFont(new Font("VERDANA", Font.BOLD,15));
		       l5.setForeground(Color.black);
		       frame.add(l5);
		       //END
		       
		       l6 = new JLabel("Age: ");   //CONDITION
		       l6.setBounds(40,410,300,50);
		       l6.setFont(new Font("VERDANA", Font.BOLD,15));
		       l6.setForeground(Color.black);
		       frame.add(l6);
		       
		       JLabel l7 = new JLabel("Number of Passenger: ");	//CONDITION
		       l7.setBounds(360,360,300,50);
		       l7.setFont(new Font("VERDANA", Font.BOLD, 15));
		       l7.setForeground(Color.black);
		       frame.add(l7);
		       
		       l8 = new JLabel("Travel Destination: "); //CONDITION
		       l8.setBounds(360,410,300,50);
		       l8.setFont(new Font("VERDANA", Font.BOLD, 15));
		       l8.setForeground(Color.black);
		       frame.add(l8);
		      
		       
		       tf1=new JTextField();  
		       tf1.setBounds(100,370,155,30);  
		       //tf1.setVisible(true);
		       frame.add(tf1);
		       
		       tf2=new JTextField();  
		       tf2.setBounds(100,420,155,30);  
		      //tf2.setVisible(true);
		       frame.add(tf2);
		       
		       tf3=new JTextField();
		       tf3.setBounds(550,370,155,30);
		       //tf3.setVisible(true);
		       frame.add(tf3);
		       
		              
		       
		       //name age number of pass. destination
		       
		       
		       p1 = new JPanel();
		       p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
		       p1.setBounds(30,65,720,200);    
		       p1.setBackground(new Color(61, 196, 207));
		       frame.add(p1);
		      
		       
		       p2 = new JPanel();
		       p2.setLayout(new BoxLayout(p2,BoxLayout.X_AXIS));
		       p2.setBounds(30,310,720,400);    
		       p2.setBackground(new Color(61, 196, 207));
		       frame.add(p2);
		       
		       
		       // create button   
		    	   JButton b = new JButton("Submit");
		    	   frame.add(b);
		    	   b.setBounds(500,100,100,40);
		    	   
		       }
				
		       

		    private void Frame_new() {
				// TODO Auto-generated method stub
				
			}



			public static void main(String[] args) {
		        new One();
		       //new Airline_Type();
		        
		       
		    }


			@Override
			public void actionPerformed(ActionEvent e) {

						
				
			}
		}


