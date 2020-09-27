import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardLayoutExample extends JFrame implements ActionListener
{ 
JButton b1,b2;
	Container c;
	CardLayout c1;
	CardLayoutExample()
	{
		
		c1=new CardLayout(50,30);
		c=getContentPane();
		c.setLayout(c1);
		b1=new JButton("click me");
		b2=new JButton("Click");
		b1.addActionListener(this);
		b2.addActionListener(this);
		c.add("a",b1);
		c.add("b",b2);
		}
		public void actionPerformed(ActionEvent e)
		{
			c1.next(c);
		}
		public static void main(String[] args){
			CardLayoutExample c2=new CardLayoutExample();
			c2.setSize(300,300);
			c2.setVisible(true);
			c2.setDefaultCloseOperation(EXIT_ON_CLOSE);
			c2.setTitle("card layout");
		}
}

