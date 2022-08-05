import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class test
{
Public Static Void Main(String[] args);
{
frame obj=new frame();
}
}
class frame extends JFrame
{
public frame()
{
Container c=this.getContentPane();
this.setBounds(100,100,500,500);
this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JButton b1=new JButton("1");
JButton b2=new JButton("1");
JButton b3=new JButton("1");
JButton b4=new JButton("1");
JButton b5=new JButton("1");
JButton b6=new JButton("1");

c.add(b1);
c.add(b2);
c.add(b3);
c.add(b4);
c.add(b5);
c.add(b6);
c.setLayout(new FlowLayout(FlowLayout.TRAILING));
}
}