import java.awt.*;
import java.applet.*;
public class Data extends Applet{
		public static void main(String[] args){
		Frame f=new Frame("Border Layout");
		Button b1=new Button("north");
		Button b2=new Button("south");
		Button b3=new Button("east");
		Button b4=new Button("west");
		Button b5=new Button("center");
		f.setSize(350,550);
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
			f.add(b4,BorderLayout.WEST);
				f.add(b5,BorderLayout.CENTER);
		f.setVisible(true);
		Data d=new Data();
		
		}
}

