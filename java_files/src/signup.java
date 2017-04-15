import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup extends JFrame{
	private JButton button1;
	private JButton button2;
	
	public signup(){
		setLayout(new GridLayout(3,0));
		
		button1= new JButton("signup");
		add(button1);
		
		button2= new JButton("login");
		add(button2);
		
		event e = new event();
		button1.addActionListener(e);
		
		event2 e2 = new event2();
		button2.addActionListener(e2);
//		event2 ev = new event2();
//		button2.addActionListener(ev);
	}
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			udetails udetailsgui= new udetails();
			udetailsgui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			udetailsgui.setSize(300,250);
			udetailsgui.setLocation(500,500);
			udetailsgui.setVisible(true);
		}
}
	public class event2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("inhere success");
			loginDetails loginDetailsgui= new loginDetails();
			loginDetailsgui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			loginDetailsgui.setSize(300,250);
			loginDetailsgui.setLocation(500,500);
			loginDetailsgui.setVisible(true);
		}
}
}