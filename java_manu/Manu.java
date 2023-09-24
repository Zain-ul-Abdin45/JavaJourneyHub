import java.util.*; 
public class Manu{
    public static void main(String[] args){
        int cheese = 2;
        int taco = 5;
        int soda = 4;
        int salsa = 20;
        int mayo = 17;
        int butter = 900;
        int count = 0;
        int choice = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
    while (choice !=7){
        System.out.println("Select an option.");
        System.out.println("1) Cheese cost 2 bucks");
        System.out.println("2) taco cost 5 bucks");
        System.out.println("3) soda cost 4 bucks");
        System.out.println("4) salsa cost 20 bucks");
        System.out.println("5) mayo cost 17 bucks");
        System.out.println("6) butter cost 900 bucks");
        System.out.println("7) Exit the Main Manu");


    choice = input.nextInt();
            

        System.out.println("choose now: ");
        switch(choice){
            case 1: sum+=cheese;
            break;
            case 2: sum+=taco;
            break;
            case 3: sum+=soda;
            break;
            case 4: sum+=salsa;
            break;
            case 5: sum+=mayo;
            break;
            case 6: sum+=butter;
            break;
            case 7: 
            System.out.println("Your total is "+sum+" bucks.");
            break;
            default: System.out.println("Wrong Choice.");
        }
    }
}
    }