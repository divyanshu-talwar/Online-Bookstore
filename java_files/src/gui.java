import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class gui extends JFrame{
	
	private JButton button1;
	private JButton button2;
	
	public gui(){
		setLayout(new GridLayout(2,0));
		
		button1= new JButton("Use as Customer");
		add(button1);
		
		button2= new JButton("Use as ADMIN");
		add(button2);
		
		event e = new event();
		button1.addActionListener(e);
		
//		event2 ev = new event2();
//		button2.addActionListener(ev);
	}
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			signup signupgui= new signup();
			signupgui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			signupgui.setSize(400,200);
			signupgui.setLocation(500,500);
			signupgui.setVisible(true);
		}
//	public class event2 implements ActionListener{
//		public void actionPerformed(ActionEvent ev){
//			inventory inventorygui= new inventory(gui.this);
//			inventorygui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//			inventorygui.setSize(1300,1300);
//			inventorygui.setLocation(200,200);
//			inventorygui.setVisible(true);
//		}

		
	}
	
	
	public static void main (String args[]){
		gui mainpage = new gui();
		mainpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainpage.setSize(400,200);
		mainpage.setLocation(500,500);
		mainpage.setVisible(true);
		mainpage.setTitle("online book store");
	}
}