import java.util.*;
class consumer
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name;
        int num,unit;
        double charge = 0;
        System.out.println("Enter name,num,unit");
        name=in.next();
        num=in.nextInt();
        unit=in.nextInt();
        {
            System.out.println("name" +name);
            System.out.println("num" +num);
            System.out.println("unit" +unit);
            System.out.println("charge" +charge);
            
            if(unit<100)
            {
                charge=5.50*100;
                System.out.println("amount to be paid" +charge);
            }
            else if(unit<200)
            {
                charge=6.50*100;
                System.out.println("amount to be paid" +charge);
            }
            else if(unit<300)
            {
                 charge=7.50*100;
                System.out.println("amount to be paid" +charge);
            }
            else
            {
                charge=8.50*100;
                System.out.println("amount to be paid" +charge);
            }
        }
    }
}