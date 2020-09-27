import java.awt.*;
import java.applet.*;
public class Det extends Frame{
	public static void main(String[] args)
		{
			Frame f=new Frame("Grid Layout");
		f.setSize(350,550);
		f.setLayout(new GridLayout(3,1));
		Button b1=new Button("1");
		Button b2=new Button("2");
		Button b3=new Button("3");
		Button b4=new Button("4");
		Button b5=new Button("5");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.setVisible(true);
		}
	}	

