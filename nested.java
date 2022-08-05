import java. util.*;
class nested
{
    int a,b,c;
    double S,or;
    void getdata()
    {
        a=2;
        b=3;
        c=4;
    }
    double semiperimeter()
    {
        double t;
        t=(a+b+c)/2;
        return(t);
    }
    void getarea()
    {
        S= perimeter();
        or=math.sqrt(S*(S-a)*(S-b)*(S*c));
    }
    void display()
    {
        System.out.println("Area of Triangle="+or);
    }
    public static void main()
    {
        nested ob=new nested();
        ob.getdata();
        ob.area();
        ob.display();
    }
}