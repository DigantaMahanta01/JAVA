import java.util.*;
public class calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        switch(c)
        {
        case 1: 
        int sum = a+b;
        System.out.println(sum);
        break;
        case 2: 
        int sub = a-b;
        System.out.println(sub);
        break;
        case 3: 
        int mult = a*b;
        System.out.println(mult);
        break;
        case 4: 
        int div = a/b;
        System.out.println(div);
        break;
        case 5: 
        int mod = a%b;
        System.out.println(mod);
        break;
        }
    }
}