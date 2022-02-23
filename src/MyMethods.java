import java.util.Scanner;

public class MyMethods {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter firstname:");
            String firstname= sc.nextLine();
            System.out.println("Enter lastname:");
            String lastname=sc.nextLine();
            fullName(firstname,lastname);

        }

        public static void fullName(String firstName, String lastName){
            System.out.println("FullName: "+firstName +" " + lastName);
        }
    }


