import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class frame1 extends JFrame {
	
	JPanel panel1,panel2,panel3,panel4, panel5;
	   JLabel searchlabel, titleLabel, qtylabel;
	   JTextField searchfield, qtyfield;
	   JButton searchbutton ,checkout;
	   JTable q1table;
	   String basketID;
		
		final static boolean shouldFill = true;
		 
	public frame1(String a){
		super();
		basketID = a;
		setLayout(new GridBagLayout());
	    GridBagConstraints c = new GridBagConstraints();
		
	    if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.BOTH;
        }
        c.insets= new Insets(5,5,5,5);
        
        
        /** ----------panel1--------- */
        panel1= new JPanel();
        titleLabel = new JLabel("Add to Cart");
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        checkout=new JButton("ADD");
        
        panel1.add(titleLabel);
        //panel1.add(checkout);
        titleLabel.setFont(new Font("Lucida Handwriting", Font.PLAIN, 44));

        c.ipady = 40;
        c.weighty = 0.0;
        c.ipadx=40;
        c.weightx = 1.0;
        c.weighty= 0.25;
        c.gridwidth = 5;
        c.gridx=0;
        c.gridy=0;
        panel1.setBorder(BorderFactory.createMatteBorder(1,1,5,1,Color.BLACK));
        add(panel1,c);

        /**---------Panel2-----------*/

        panel2= new JPanel();
        panel2.setLayout(new GridBagLayout());
        searchlabel = new JLabel("ISBN :");
        c.ipady = 40;
        c.weighty = 0.0;
        c.ipadx=40;
        c.weightx = 1.25;
        c.weighty= 1.25;
        c.gridwidth = 10;
        c.gridx=0;
        c.gridy=0;
        panel4=new JPanel();
        panel4.setLayout(new FlowLayout());
        panel4.add(searchlabel);
        searchfield =new JTextField(15);
        JPanel fillpanel1=new JPanel();
        c.gridx=0;
        //panel2.add(fillpanel1,c);
        c.gridx=1;
        panel4.add(searchfield,c);
        panel2.add(panel4,c);
        
        qtylabel = new JLabel("Quantity :");
        panel4.add(qtylabel);
        qtyfield =new JTextField(15);
        c.gridx=0;
        c.gridx=1;
        panel4.add(qtyfield,c);
        panel2.add(panel4,c);
        c.gridx=1;
        c.gridy=2;
        searchbutton= new JButton("ADD");
        event e = new event();
        searchbutton.addActionListener(e);
        panel2.add(searchbutton,c);
        
        
        
        c.gridx=0;
        c.gridy=1;
        panel2.setBorder(BorderFactory.createMatteBorder(1,1,5,1,Color.BLACK));
        add(panel2,c);
        
  }
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String name = searchfield.getText();
			String qty = qtyfield.getText();
			String query = "insert into Contains values ('" + name + "','" + basketID +"', '"+ qty +"');";
			String query2 = "update Stocks set stock_quantity = stock_quantity - " + qty +" where ISBN = '" + name +"';"; 
			new sqlQuery().sqlQuery_update(query);
			new sqlQuery().sqlQuery_update(query2);
		}
}
	
}


