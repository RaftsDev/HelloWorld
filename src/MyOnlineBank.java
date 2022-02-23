import java.util.Scanner;

public class MyOnlineBank {

     static double plusMethod(double x, double y) {
        return x + y;
    }

    static String plusMethod(String x, double y) {
        return "Your balance:"+y;
    }

        public static void main(String[] args)
        {
        /*Write a program which asks the user for a password. Make the password “shark50”. Each
time the user enters the password incorrectly, prompt them for a password again. When the
user enters the password correctly, print “ACCESS APPROVED”.
”. */
            double balance = 100.00;
            double money=0;

            Scanner scanner = new Scanner(System.in);
            int input;
            do
            {
                System.out.print("Enter pin code: ");
                input = scanner.nextInt();
            }
            while (input!=123);
            /* three functions balance() withdraw() deposit()*/
            System.out.println("/* three functions balance() withdraw() deposit()*/");

            System.out.println("Select option:");
            System.out.println("Press 1 if you want put a deposit on your account");
            System.out.println("Press 2 if you want withdraw a money from your account");
            System.out.println("Press 3 if you want check a balance of your account");
            System.out.println("Press 4 to finish work with ATM");
            input = scanner.nextInt();


            switch (input) {
                case 1:
                    System.out.println("You want put a deposit on your account");
                    System.out.println("How amount of money you want to put:");
                    input = scanner.nextInt();
                    System.out.println("Your balance: "+plusMethod(balance, input));
                    break;
                case 2:
                    System.out.println("You want withdraw a money from your account");
                    System.out.println("How amount of money you want to put:");
                    input = scanner.nextInt();
                    input = input * (-1);
                    System.out.println("Your balance: "+plusMethod(balance, input));
                    break;
                case 3:
                    System.out.println("You want check a balance of your account");
                    System.out.println("Your balance: "+plusMethod( "check",balance));
                    break;
                case 4:
                    System.out.println("You want finish work with ATM");
                    break;
            }
        }
    }


