import java.awt.*;
import java.applet.*;
public class Dets extends Frame{
	public static void main(String[] args){
		Frame f=new Frame("Flow Layout");
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		f.setSize(350,450);
		Button b1=new Button("1");
		Button b2=new Button("2");
		Button b3=new Button("3");
		Button b4=new Button("4");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setVisible(true);
	}	
}
