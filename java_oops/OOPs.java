class Pen{
    String color;
    String type;


    public void write(){  //method
        System.out.println("Writing Something");
    }
    public void PrintColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class OOPs{
    public static void main(String args[]){
        Student student1 = new Student();
        student1.name = "Zain";
        student1.age = 24;
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";
        
        // pen1.PrintColor();
        // pen2.PrintColor();
    }
}