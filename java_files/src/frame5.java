import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class frame5 extends JFrame {
	
	JPanel panel1,panel2,panel3,panel4;
	   JLabel searchlabel, titleLabel;
	   JTextField searchfield,searchfield2;
	   JButton searchbutton ,checkout;
	   JTable q1table;
	   Object[] columnnnames ={"Title", "Price", "Genre", "Year", "ISBN"};
		
		final static boolean shouldFill = true;
		 
	public frame5(){
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
        titleLabel = new JLabel("Search in price range");
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

        /**---------Panel2-----------*/

        panel2= new JPanel();
        panel2.setLayout(new GridBagLayout());
        searchlabel = new JLabel("Insert the limits");
        c.ipady = 40;
        c.weighty = 0.0;
        c.ipadx=40;
        c.weightx = 1.25;
        c.weighty= 1.25;
        c.gridwidth = 10;
        c.gridx=0;
        c.gridy=0;
        panel4=new JPanel();
        panel4.setLayout(new FlowLayout(5,10,10));
        panel4.add(searchlabel);
        searchfield =new JTextField(15);
        searchfield2 =new JTextField(15);
        c.gridx=0;
        c.gridx=1;
        panel4.add(searchfield);
        panel4.add(searchfield2);
        searchbutton= new JButton("search");
        event e = new event();
        searchbutton.addActionListener(e);
        c.gridx=1;
        c.gridy=2;
        panel4.add(searchbutton,c);
        panel2.add(panel4,c);
        
//        c.gridx=1;
//        c.gridy=2;
//        searchbutton= new JButton("search");
//        event e = new event();
//        searchbutton.addActionListener(e);
//        panel2.add(searchbutton,c);
        
        
        
        c.gridx=0;
        c.gridy=1;
        panel2.setBorder(BorderFactory.createMatteBorder(1,1,5,1,Color.BLACK));
        add(panel2,c);
        
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
        c.gridy=2;
        

    

        
        Object [][] data={ {" "," "," "," ", " "},{" "," "," "," ", " "},{" "," "," "," ", " "}
        };
		
		q1table=new JTable(data,columnnnames);
        
        q1table.setRowHeight(25);
        q1table.setPreferredScrollableViewportSize(new Dimension(500,150));
        q1table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(q1table);
        panel3.add(scrollPane,c);
//        JLabel labelcheck = new JLabel("check");
//        panel3.add(labelcheck,c);
        panel3.setBorder(BorderFactory.createMatteBorder(1,1,5,1,Color.BLACK));
        add(panel3,c);
        
  
   }
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String a = searchfield.getText();
			String b = searchfield2.getText();
			String query = "Select * from Book where price between " + a +" and "+ b +" ;";
			System.out.println(query);
			String[][] answer = new sqlQuery().sqlQuery_run(query);
//			q1table=new JTable(answer,columnnnames);
			DefaultTableModel tm = new DefaultTableModel(answer, columnnnames);
	        q1table.setModel(tm);
		}
}
	
}


