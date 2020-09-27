import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
public class GridBagEx extends JFrame{
	public GridBagEx(){
		setTitle("GridBagLayout");
			GridBagLayout grid=new GridBagLayout();
GridBagConstraints g1=new GridBagConstraints();
setLayout(grid);
GridBagLayout lout=new GridBagLayout();
this.setLayout(lout);
g1.fill=GridBagConstraints.VERTICAL;
	g1.gridx=1;
	g1.gridy=1;
	 this.add(new JButton("java"), g1);  
    g1.gridx = 0;  
    g1.gridy = 1;  
	this.add(new JButton("c++"), g1);  
    g1.fill = GridBagConstraints.VERTICAL;  
    g1.ipady = 20;  
    g1.gridx = 1;  
    g1.gridy = 0;  
    this.add(new JButton("PYTHON"), g1);  
    g1.gridx = 0;  
    g1.gridy = 0;  
    this.add(new JButton("HTML"), g1);  
    g1.gridx = 2;  
    g1.gridy = 0;  
    g1.fill = GridBagConstraints.VERTICAL;  
    g1.gridwidth = 0;  
    this.add(new JButton("PHP"), g1);  
            setSize(300, 300);  
            setPreferredSize(getSize());  
            setVisible(true);  
            setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}
	    public static void main(String[] args) {  
			new GridBagEx();  
        }  
}