public class PrimeNumbersFrom1To200
{
   public static void main(String[] args)
   {
      int maxNumber = 200;
      boolean prime = true;
      String primeNumbers = "";
      for(int a = 1; a <= maxNumber; a++)
      {
         prime = checkPrime(a);
         if(prime)
         {
            primeNumbers = primeNumbers + a + " ";
         }
      }
      System.out.println("Display prime numbers from 1 to " + maxNumber + ": ");
      System.out.println(primeNumbers);
   }
   public static boolean checkPrime(int number)
   {
      int remainder;
      for(int a = 2; a <= number / 2; a++)
      {
         remainder = number % a;
         if(remainder == 0)
         {
            return false;
         }
      }
      return true;
   }
}