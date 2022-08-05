import java.util.*;
public class billing
{
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> arr= new ArrayList<Integer>();
    public void menu()
    {
         System.out.println("PLEASE SELECT YOUR CHOICE");
        System.out.print("(1) STATERS.\n(2) MAIN COURSE.\n(3)DESERTS.");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch(choice)
        {
            case 1:
            {
                menu_of_Staters();
                break;
            }
            case 2 :
            {
                menu_of_Main_Course();
                break;
            }
            case 3:
            {
                menu_of_Deserts();
                break;
            }
            default : 
            {
                System.out.println("PLEASE ENTER CORRECT CHOICE");
                break;
            }
    }
}
    
void menu_of_Staters()
    {
        System.out.println("<<<<<<<<<<<<MENU CARD OF STATERS>>>>>>>>>>>>>>>>>>");
        System.out.println("I T E M               |           P R I C E  ");
        System.out.println("===========================");
        System.out.println("* NONVEG");
         System.out.println("---------------------------------------");
        System.out.println("(1)chillichicke           |          200(8ps)");
        System.out.println("(2)chicken 65             |          150(8ps)");
        System.out.println("(3)cripsy chicken          |           210(6ps)");
        System.out.println("(4)Pepper chicken          |           210(8ps)");
        System.out.println("(5)(full)Tandoori Chicken          |           300");
        System.out.println("(6)(half)Tandoori Chicken          |           250(2ps)");
        System.out.println("(7)chicken tikka kabbab          |           263(6ps)");
        System.out.println("(8)Chicken Manchurian          |           263(6ps)");
        System.out.println("(9)Chicken Reshmi Kabbab          |           240(6ps)");
        System.out.println("(10)Chicken Garlic Kabbab          |           240(6ps)");
        System.out.println("* VEG");
         System.out.println("---------------------------------------");
         System.out.println("(11)Veg Manchurian          |           200(8ps)");
        System.out.println("(12)Panner 65             |          130");
        System.out.println("(13)Aloo pakora          |           150(6ps)");
        System.out.println("(14)Panner tikka kabbab          |           263(6ps)");
        System.out.println("PLEASE SELECT YOUR CHOICE FROM THE ABOVE MENU CARD");
         
        int choice = in.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*200);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 2 :
            {
                System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*150);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 3:
            {
                System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*210);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 4:
            {
                System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*210);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 5 :
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                 int q = in.nextInt();
                 arr.add(q*300);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 6:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*250);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 7:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*263);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 8 :
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                 arr.add(q*263);
                
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 9:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*240);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 10:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*240);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            case 11:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*200);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            case 12:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*130);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            case 13:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
               arr.add(q*150);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            case 14:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*263);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            default : 
            {
                System.out.println("PLEASE ENTER CORRECT CHOICE");
                break;
            }
        }
    }
    void menu_of_Main_Course()
    {
        System.out.println("<<<<<<<<<<<<MENU CARD OF STATERS>>>>>>>>>>>>>>>>>>");
        System.out.println("I T E M               |           P R I C E  ");
        System.out.println("===========================");
        System.out.println("* NONVEG");
         System.out.println("---------------------------------------");
        System.out.println("chillichicken          |           200(8ps)");
        System.out.println("chicken 65             |          150(8ps)");
        System.out.println("cripsy chicken          |           210(6ps)");
        System.out.println("Pepper chicken          |           210(8ps)");
        System.out.println("(full)Tandoori Chicken          |           300");
        System.out.println("(half)Tandoori Chicken          |           250(2ps)");
        System.out.println("chicken tikka kabbab          |           263(6ps)");
        System.out.println("Chicken Manchurian          |           263(6ps)");
        System.out.println("Chicken Reshmi Kabbab          |           240(6ps)");
        System.out.println("Chicken Garlic Kabbab          |           240(6ps)");
        System.out.println("* VEG");
         System.out.println("---------------------------------------");
         System.out.println("Veg Manchurian          |           200(8ps)");
        System.out.println("Panner 65             |          130");
        System.out.println("Aloo pakora          |           1506ps)");
        System.out.println("Panner tikka kabbab          |           263(6ps)");
        System.out.println("PLEASE SELECT YOUR CHOICE FROM THE ABOVE MENU CARD");
         
        int choice = in.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*200);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 2 :
            {
                System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*150);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 3:
            {
                System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*210);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 4:
            {
                System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*210);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 5 :
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                 int q = in.nextInt();
                 arr.add(q*300);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 6:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*250);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 7:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*263);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 8 :
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                 arr.add(q*263);
                
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 9:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*240);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 10:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*240);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            case 11:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*200);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            case 12:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*130);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            case 13:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
               arr.add(q*150);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            case 14:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*263);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            default : 
            {
                System.out.println("PLEASE ENTER CORRECT CHOICE");
                break;
            }
        }
    }
    void menu_of_Deserts()
    {
        System.out.println("<<<<<<<<<<<<MENU CARD OF STATERS>>>>>>>>>>>>>>>>>>");
        System.out.println("I T E M               |           P R I C E  ");
        System.out.println("===========================");
        System.out.println("* NONVEG");
         System.out.println("---------------------------------------");
        System.out.println("chillichicken          |           200(8ps)");
        System.out.println("chicken 65             |          150(8ps)");
        System.out.println("cripsy chicken          |           210(6ps)");
        System.out.println("Pepper chicken          |           210(8ps)");
        System.out.println("(full)Tandoori Chicken          |           300");
        System.out.println("(half)Tandoori Chicken          |           250(2ps)");
        System.out.println("chicken tikka kabbab          |           263(6ps)");
        System.out.println("Chicken Manchurian          |           263(6ps)");
        System.out.println("Chicken Reshmi Kabbab          |           240(6ps)");
        System.out.println("Chicken Garlic Kabbab          |           240(6ps)");
        System.out.println("* VEG");
         System.out.println("---------------------------------------");
         System.out.println("Veg Manchurian          |           200(8ps)");
        System.out.println("Panner 65             |          130");
        System.out.println("Aloo pakora          |           1506ps)");
        System.out.println("Panner tikka kabbab          |           263(6ps)");
        System.out.println("PLEASE SELECT YOUR CHOICE FROM THE ABOVE MENU CARD");
         
        int choice = in.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*200);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN TYPE TRUE OR IF NO THEN TYPE  FALSE ");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 2 :
            {
                System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*150);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 3:
            {
                System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*210);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 4:
            {
                System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*210);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 5 :
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                 int q = in.nextInt();
                 arr.add(q*300);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 6:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*250);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 7:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*263);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 8 :
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                 arr.add(q*263);
                
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 9:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                arr.add(q*240);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                
                break;
            }
            case 10:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*240);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            case 11:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*200);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            case 12:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*130);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            case 13:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
               arr.add(q*150);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            case 14:
            {
                 System.out.println("PLEASE ENTER THE QUANTITY:");
                int q = in.nextInt();
                
                arr.add(q*263);
                System.out.println("DO YOU WANT TO ORDER MORE:??\nIf YES THEN PRESS 1 or PRESS 0");
                boolean y = in.nextBoolean();
                if(y)
                {
                    menu();
                    break;
                }
                break;
            }
            default : 
            {
                System.out.println("PLEASE ENTER CORRECT CHOICE");
                break;
            }
        }
    }
    public void bill()
    {
        int sum = 0;
        double amount;
        for(int i=0;i < arr.size();i++)
        {
            sum = sum+ arr.get(i);
        }
        amount = (double)sum + 0.145;
        System.out.println("=======================================================>>>>>>>>>>>>>>>>B I L L<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<================================");
        System.out.println("AMOUNT OF ITEM ORDERD::      "+sum);
        System.out.println("VAT PRICE::                  "+"0.145"); 
        System.out.println("TOTAL AMOUNT TO BE PAID::    "+amount);
        
    }
    public static void main(String args[])
    {
        System.out.println("MULTI CUISUINE RESTURANT");
       billing ob = new billing();
       ob.menu();
       ob.bill();
    }
}