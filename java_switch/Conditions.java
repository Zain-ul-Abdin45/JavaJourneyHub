import java.util.*;
public class Conditions{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("A.O.A");
            break;
            case 3: System.out.println("Banjour");
            break;
            default : System.out.println("Invalide Button.");
        }
    }
}