public class motorcycle {
        String make;
        String color;
        boolean engineState;
        void startEngine() {//engine method 
            if (engineState==true)
            System.out.println("The engine is already on. ");
            else {
                engineState = true;
                System.out.println("The engine is now on."); 
            }
        }
        void ShowAttributes(){ //creating method
            System.out.println("This motorcycle is a" + color + " " +make); //attributes
            if (engineState==true){
                System.out.println("The engine is on.");
            }
            else {
                System.out.println("The engine is off.");
            }
        }

public static void main(String[] args){
    motorcycle myMotorcycle = new motorcycle();
    myMotorcycle.make = "Royal Tag";
    myMotorcycle.color = "Black";
    myMotorcycle.startEngine();
    myMotorcycle.ShowAttributes();
}
}