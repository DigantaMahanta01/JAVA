import java.util.*;
public class Calculate
{
   private int result;
   Calculate()
   {
       result = 0;
       
   }
   void add(int a)
   {
       result = result + a;
   }
   void sub(int a)
   {
       result = result - a;
   }
   void mul(int a)
   {
       result = result * a;
   }
   void div(int a)
   {
       result = result / a;
   }
   void display()
   {
       System.out.println("The result is" +result);
   }
   void clear()
   {
       result = 0;
   }
}