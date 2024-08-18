import java.util.Scanner;


class student{
    java.lang.String name;
    java.lang.String uid;
    long phone;

    void take_data()
    {
        System.out.println("ENter the Students name:");
        Scanner scanner = new Scanner(System.in);
         name = scanner.nextLine();

        System.out.println("Enter your uid");
         uid = scanner.nextLine();

         System.out.println("Enter your phone number:");
         phone = scanner.nextLong();



    }
    
}
public class assi2 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.take_data();
    }
}
