import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;



public class travel_Destination extends JFrame {

		
	ImageIcon image1 = new ImageIcon("sra.png");
	 
	    travel_Destination()  {
	    JPanel p1 = new JPanel();// creating instance of JPanel
	    p1.setBounds(0,0,785,160);
	    p1.setBackground(Color.cyan);
	   
	   
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(300, 10, 600, 218); // THE POP UP FRAME
	    setTitle("jtable");
	    getContentPane().setLayout(null);

	    String data[][] = { 
	    		{ "Manila", "Batanes", "8,000"},
	            { "Batanes", "Manila", "9,800" },
	            { "Manila", "Palawan", "9,100" },
	            { "Palawan", "Manila", "9,850" }, 
	            
	    };

	    String header[] = { "FROM", "TO", "Column 3"};

	 
	    // Table
	    JTable table = new JTable(data,header);
	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(50, 20, 700, 100);// TABLE place
	    getContentPane().add(scrollPane);
	    
	    
	    
	    JLabel lbl1 = new JLabel("Name: ");
	    lbl1.setBounds(30,160,90,100);
	    lbl1.setForeground(Color.BLACK);
	    lbl1.setFont(new Font("VERDANA",Font.BOLD,17));
	    this.add(lbl1);
	   
   
	  
	   
	  
	    this.getContentPane().setBackground(new Color(27, 95, 98)); // Background Color
	    this.setLayout(null);
	    this.setSize(800,700);
	    this.setVisible(true);
	    this.add(p1);
	   
	    this.setIconImage(image1.getImage());
	    	
	    }

	

	
}
	