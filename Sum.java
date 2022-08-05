import java. util.*;
class Sum
{
    int x,y,z;
    void add()
    {
        z=x+y;
    }
    void display()
    {
        System.out.print("Sum of the two numbers"+z);
    }
}
class Abc
{
    public static void main(String args[])
    {
        Sum ob=new Sum();
        ob.x=5;
        ob.y=8;
        ob.add();
        ob.display();
    }
}
