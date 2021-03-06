import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminMenu extends JFrame{
	
	String[] queries={"Total number of customers registered","Best Sellers","Number of customers who bought a particular book","Books in price range","most popular authors","Search Book by keyphrase","Books with quantity more than 'X' in stock","Search by Genre","Find Books by author or set of author","Find books by publisher or set of publisher","Names of all customers who bought all the books written by some Author","Names of all customers who bought all the books published by some Publisher","Stock summary"};
	JComboBox cb1 ;
	String a;
	
	JPanel panel1,panel2;
	JButton button1;
	final static boolean shouldFill = true;
	String s;
	public AdminMenu(String basketID){
		super();
		a= basketID;
		
		setLayout(new GridBagLayout());
		GridBagConstraints c= new GridBagConstraints();
	
		if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.BOTH;
        }
        c.insets= new Insets(5,5,5,5);
		
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
		cb1=new JComboBox(queries);
		
//		s=(String)cb1.getSelectedItem();
//		s = String.valueOf(cb1.getSelectedItem());
//		System.out.println(cb1.getSelectedIndex());
		panel1.add(cb1);
		add(panel1,c);
		c.gridy=1;
		panel2=new JPanel();
		panel2.setLayout(new FlowLayout());
		button1=new JButton("Search");
		panel2.add(button1);
		add(panel2,c);
		
		 event e = new event();
			button1.addActionListener(e);
				
	}public class event implements ActionListener{
		

		public void actionPerformed(ActionEvent e){
			AdminMenu AdminMenugui= new AdminMenu(a);
			AdminMenugui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			AdminMenugui.setSize(600,250);
			AdminMenugui.setLocation(500,500);
			AdminMenugui.setVisible(true);
			s = String.valueOf(cb1.getSelectedItem());
			System.out.println(cb1.getSelectedIndex());
			
			
			System.out.println(s);
			if (s.equals("Best Sellers")){
				frame2 frame2gui= new frame2();
				frame2gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame2gui.setSize(1000,700);
				frame2gui.setLocation(200,200);
				frame2gui.setVisible(true);
				
			}
			if (s.equals("Names of all customers who bought all the books written by some Author")){
				frame14 frame14gui= new frame14();
				frame14gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame14gui.setSize(1000,700);
				frame14gui.setLocation(200,200);
				frame14gui.setVisible(true);
				
			}
			if (s.equals("Names of all customers who bought all the books published by some Publisher")){
				frame15 frame15gui= new frame15();
				frame15gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame15gui.setSize(1000,700);
				frame15gui.setLocation(200,200);
				frame15gui.setVisible(true);
				
			}
				
			if (s.equals("Total number of customers registered")){
				frame8 frame8gui= new frame8();
				frame8gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame8gui.setSize(1000,700);
				frame8gui.setLocation(200,200);
				frame8gui.setVisible(true);
				
			}
			
			if (s.equals("Number of customers who bought a particular book")){
				frame4 frame4gui= new frame4();
				frame4gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame4gui.setSize(1200,550);
				frame4gui.setLocation(200,200);
				frame4gui.setVisible(true);
//				System.out.println(s);
			}
			
			if (s.equals("Books in price range")){
				frame5 frame5gui= new frame5();
				frame5gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame5gui.setSize(1000,700);
				frame5gui.setLocation(200,200);
				frame5gui.setVisible(true);
				System.out.println("q3");
			}
				
			if(s.equals( "most popular authors")){
				frame6 frame6gui= new frame6();
				frame6gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame6gui.setSize(1000,700);
				frame6gui.setLocation(1000,700);
				frame6gui.setVisible(true);
			}
				
			if (s.equals("Search Book by keyphrase")){
				frame7 frame7gui= new frame7();
				frame7gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame7gui.setSize(1000,700);
				frame7gui.setLocation(200,200);
				frame7gui.setVisible(true);
			}
				
				
			if(s.equals( "Books with quantity more than 'X' in stock")){
				frame11 frame11gui= new frame11();
				frame11gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame11gui.setSize(1000,700);
				frame11gui.setLocation(200,200);
				frame11gui.setVisible(true);
			}
				
			if(s.equals( "Find Books by author or set of author")){
				frame9 frame9gui= new frame9();
				frame9gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame9gui.setSize(1000,700);
				frame9gui.setLocation(200,200);
				frame9gui.setVisible(true);
			}
				
			if(s.equals( "Search by Genre")){
				frame10 frame10gui= new frame10();
				frame10gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame10gui.setSize(1000,700);
				frame10gui.setLocation(500,500);
				frame10gui.setVisible(true);
			}
				
			if(s.equals( "Find books by publisher or set of publisher")){
				frame13 frame13gui= new frame13();
				frame13gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame13gui.setSize(1000,700);
				frame13gui.setLocation(200,200);
				frame13gui.setVisible(true);
			}
				
			if( s.equals("Stock summary")){
				frame12 frame12gui= new frame12();
				frame12gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame12gui.setSize(1000,700);
				frame12gui.setLocation(200,200);
				frame12gui.setVisible(true);
			}
			dispose();
		}}}
			

  