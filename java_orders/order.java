import java.util.ArrayList;
import java.util.List;

class Orders {
    private int orderId;
    private String customerName;
    private List <String> genres;

    public Orders (int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.genres = new ArrayList<>();
    }
}
public void addGenre(String genres) {
    if (!genres.contains(genres)){
        genres.add(genres);
    }
}

public void removeGenre(String genre){
    genres.remove(orderId);
}
public List<String> getGenres() {
    return genres;
}
public int getOrderId(){
    return orderId;
}
public String getCustomerName(){
    return customerName;
}
public class Order{
    public static void main(String[] args){
        Orders order1 = new Orders(1, "Zain");
        Orders order2 = new Orders(2, "Kashif");

        order1.addGenre("Action");
        order1.addGenre("Adventure");
        order2.addGenre("Comedy");
        order2.addGenre("Drama");
        
        
        System.out.println("Genres for Order " + order1.getOrderId() + ": " + order1.getGenres());
        System.out.println("Genres for Order " + order2.getOrderId() + ": " + order2.getGenres());

        order1.addGenre("Action"); 

        System.out.println("Updated Genres for Order " + order1.getOrderId() + ": " + order1.getGenres());

        order2.removeGenre("Comedy");

        System.out.println("Updated Genres for Order " + order2.getOrderId() + ": " + order2.getGenres());
 
    }
}
