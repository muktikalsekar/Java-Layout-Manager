import java.awt.*;  
import javax.swing.*;  
  
public class BoxLayoutEx extends Frame {  
 Button b1[];
 
 public BoxLayoutEx () {  
   b1 = new Button[3];
    for(int i=0;i<3;i++){
		b1[i]=new Button("Enter"+(i+1));
      add(b1[i]);
	}
	setTitle("BoxLayout");
   setLayout (new BoxLayout (this,BoxLayout.Y_AXIS));  
setSize(400,400);  
 setVisible(true); 
 }
public static void main(String args[]){  
BoxLayoutEx b=new BoxLayoutEx();  
 
}  
}  