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


public class frame14 extends JFrame {
	JPanel panel1,panel2,panel3;
	JLabel searchlabel, titleLabel;
	JTextField searchfield;
	JButton searchbutton ,checkout;
	JTable q1table;
	final static boolean shouldFill = true;
	
	public frame14(){
		super();
		setLayout(new GridBagLayout());
	    GridBagConstraints c = new GridBagConstraints();
		
	    if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.BOTH;
        }
        c.insets= new Insets(5,5,5,5);
        
        
        /** ----------panel1--------- */
        panel1= new JPanel();
        titleLabel = new JLabel("Best Sellers region wise");
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        checkout=new JButton("checkout");
        
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
        
        /**---------panel 3----------
         * contains the result area JTable*/

        panel3= new JPanel();
        //panel3.setBackground(Color.RED);
       // panel3.setBorder(newborder);
        //c.fill = GridBagConstraints.VERTICAL;
        c.ipadx = 40;
        c.weighty = 2.0;
        c.weightx = 2.0;
        c.gridwidth = 4;
        c.gridheight=6;
        c.gridx=0;
        c.gridy=1;
        

    

        
        Object [][] data={
        		{"d11","d12","d13"},
        		{"d21","d22","d23"},
        		{"d31","d32","d33"},
        };
		
		Object[] columnnnames ={"c1","c2","c3"};
		q1table=new JTable(data,columnnnames);
        q1table.setRowHeight(25);
        q1table.setPreferredScrollableViewportSize(new Dimension(500,50));
        q1table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(q1table);
        panel3.add(scrollPane,c);
        //JLabel labelcheck = new JLabel("check");
        //panel3.add(labelcheck,c);
        panel3.setBorder(BorderFactory.createMatteBorder(1,1,5,1,Color.BLACK));
        add(panel3,c);
        

		
   
   }
}


