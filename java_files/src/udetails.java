import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class udetails extends JFrame {
	
	JPanel panel1,panel2,panel3,panel4,panel5,panel6;
	JLabel label1,label2,label3,label4,label5;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JButton b1;
	
	
	final static boolean shouldFill = true;
	
	public udetails(){
		super();
		
		setLayout(new GridBagLayout());
		GridBagConstraints c= new GridBagConstraints();
		
		if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.BOTH;
        }
        c.insets= new Insets(5,5,5,5);
        
        //panel1----------------
        c.ipady = 40;
        c.weighty = 0.0;
        c.ipadx=40;
        c.weightx = 1.25;
        c.weighty= 1.25;
        c.gridwidth = 10;
        c.gridx=0;
        c.gridy=0;
        panel1=new JPanel();
        panel1.setLayout(new FlowLayout());        
        label1=new JLabel("Name:     ");
        panel1.add(label1,c);
        tf1 = new JTextField(10);
        c.gridx=1;
        c.weightx=2;
        panel1.add(tf1, c);
        c.gridx=0;
        
        add(panel1,c);
        
        
      //panel2----------------
        c.ipady = 40;
        c.weighty = 0.0;
        c.ipadx=40;
        c.weightx = 1.25;
        c.weighty= 1.25;
        c.gridwidth = 10;
        c.gridx=0;
        c.gridy=0;
        panel2=new JPanel();
        panel2.setLayout(new FlowLayout());        
        label2=new JLabel("email:     ");
        panel2.add(label2,c);
        tf2 = new JTextField(10);
        c.gridx=1;
        c.weightx=2;
        panel2.add(tf2, c);
        c.gridx=0;
        c.gridy=1;
        add(panel2,c);
        
      //panel3----------------
        c.ipady = 40;
        c.weighty = 0.0;
        c.ipadx=40;
        c.weightx = 1.25;
        c.weighty= 1.25;
        c.gridwidth = 10;
        c.gridx=0;
        c.gridy=0;
        panel3=new JPanel();
        panel3.setLayout(new FlowLayout());        
        label3=new JLabel("address:     ");
        panel3.add(label3,c);
        tf3 = new JTextField(10);
        c.gridx=1;
        c.weightx=2;
        panel3.add(tf3, c);
        c.gridx=0;
        c.gridy=2;
        add(panel3,c);
        
      //panel4----------------
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
        label4=new JLabel("Phone No.:     ");
        panel4.add(label4,c);
        tf4 = new JTextField(10);
        c.gridx=1;
        c.weightx=2;
        panel4.add(tf4, c);
        c.gridx=0;
        c.gridy=3;
        add(panel4,c);
      
      //panel5----------------
        c.ipady = 40;
        c.weighty = 0.0;
        c.ipadx=40;
        c.weightx = 1.25;
        c.weighty= 1.25;
        c.gridwidth = 10;
        c.gridx=0;
        c.gridy=0;
        panel5=new JPanel();
        panel5.setLayout(new FlowLayout());        
        label5=new JLabel("password:     ");
        panel5.add(label5,c);
        tf5 = new JTextField(10);
        c.gridx=1;
        c.weightx=2;
        panel5.add(tf5, c);
        c.gridx=0;
        c.gridy=4;
        add(panel5,c);
      
		//panel6
        c.ipady = 40;
        c.weighty = 0.0;
        c.ipadx=40;
        c.weightx = 1.25;
        c.weighty= 1.25;
        c.gridwidth = 10;
        c.gridx=0;
        c.gridy=0;
        panel6=new JPanel();
        panel6.setLayout(new FlowLayout());
        b1 = new JButton("SAVE AND PROCEED");
        panel6.add(b1, c);
        c.gridx=0;
        c.gridy=5;
        add(panel6,c); 
        
        event e = new event();
		b1.addActionListener(e);
        
	}
	
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String name = tf1.getText();
			String email = tf2.getText();
			String address = tf3.getText();
			String phone = tf4.getText();
			String password = tf5.getText();
			String basketID = phone;
			String query = "insert into Customer values( '"+ email +"', '" + name + "', '" + address + "', '" + phone + "', '" + password +"');";
			String query2 = "insert into ShoppingBasket values( '"+ email +"', '" + phone + "');";
			new sqlQuery().sqlQuery_update(query);
			new sqlQuery().sqlQuery_update(query2);
			cmenu cmenugui= new cmenu(basketID);
			cmenugui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			cmenugui.setSize(700,250);
			cmenugui.setLocation(500,500);
			cmenugui.setVisible(true);
			dispose();
		}
	}
}
