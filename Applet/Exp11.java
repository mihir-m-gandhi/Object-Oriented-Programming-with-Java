import java.util.*;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;

/*<applet code="Exp11.class" height=200 width=100></applet>*/

public class Exp11 extends Applet implements ActionListener
{
	TextField t1,t2;
	Label l1,l2;
	Button b1,b2;
   	public void init()
  	{                        
		l1=new Label("Enter the number: ");
      		l2=new Label("Factorial is:");
      		t1=new TextField(10);
      		t2=new TextField(10);
     		b1=new Button("Calculate");
      		b2=new Button("Clear");	
		add(l1);
		add(t1);
      		add(b1);
      		add(b2);
		add(l2);
      		add(t2);
		b1.addActionListener(this);			
  	} 
	public void actionPerformed(ActionEvent ae)
	{
		int n=Integer.parseInt(t1.getText());
		int fact=1;
		if(ae.getSource()==b1)
      		{
         		if(n==0||n==1)
        		{ 
              			fact=1;
         		}
        		else
          		{
          			for(int i=1;i<=n;i++)
				{
             				fact=fact*i;
				}
          		}
    			t2.setText(String.valueOf(fact));
      		}
		else if(ae.getSource()==b2)
      		{
         		t1.setText("");
          		t2.setText("");
     		}	
	}
}