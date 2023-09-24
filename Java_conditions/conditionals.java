import java.util.Scanner;
class conditionals {
    public static void main(String[] args) {
        Scanner my_object = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = my_object.nextInt();
        if (number%2==0)
        {
            System.out.print("The given number is even");
        } 
        else {
            System.out.print("The give number is odd");
        }
    }
}