import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class travel_Destination2 extends JFrame{
	
	ImageIcon image1 = new ImageIcon("sra.png");
	
	 travel_Destination2() {    
	      
		 String data[][] = { {"Manila","South Korea","27,450","37,390","12,055"},    
		            {"South Korea","Manila","30,890","39,650","13,100"},    
		            {"Manila","Japan","40,450","45,355","27,800"},
		            {"Japan", "Manila","43,855","49,780","29,400"},
		            {"Manila", "Vietnam","8,505", "12,345","3,200"},
		            {"Vietman",	"Manila", "14,300",	"16,320", "4,600"},
		            }; 
		    
		    String column[] = {"FROM","TO","Private Class", "Business Class", "Regular Class"};  
	    
	    JTable jt=new JTable(data,column);    
	    jt.setBounds(30,40,200,300);          
	    JScrollPane sp=new JScrollPane(jt);    
	    
	    
	    //LABEL NAME
	    JLabel lbl1 = new JLabel("Name: ");
	    lbl1.setBounds(30,160,90,100);
	    lbl1.setForeground(Color.BLACK);
	    lbl1.setFont(new Font("VERDANA",Font.BOLD,17));
	    this.add(lbl1);
	    
	    JTextField txt1 = new JTextField();
	    txt1.setBounds(100,195,190,30);
	    this.add(txt1);
	    // END NAME
	    
	    JLabel lbl2 = new JLabel("Age: ");
	    lbl2.setBounds(30,205,90,100);
	    lbl2.setForeground(Color.BLACK);
	    lbl2.setFont(new Font("VERDANA",Font.BOLD,17));
	    this.add(lbl2);
	    
	    JTextField txt2 = new JTextField();
	    txt2.setBounds(100,240,190,30);
	    this.add(txt2);
	    
	    
	    
	    setBounds(300, 30, 300, 218); // THE POP UP FRAME
	    this.add(sp);          
	    this.setSize(800,700);   
	    this.setVisible(true);    
	    this.setIconImage(image1.getImage());
	    this.setTitle("International Type");
	   
	   }
}
