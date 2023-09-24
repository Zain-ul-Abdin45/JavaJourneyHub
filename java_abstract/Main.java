abstract class Parent {
    abstract void message();
}

class FirstSubclass extends Parent{
    void message(){
        System.out.println("This is the subclass");
    }
}

class SecondSubclass extends Parent{
    void message(){
        System.out.println("This is the second subclass");
    }
}

public class Main {
    public static void main(String[] args){
        Parent firstObj = new FirstSubclass();
        Parent secondObj = new SecondSubclass();
        firstObj.message();
        secondObj.message();
    }
}