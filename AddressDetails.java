import java.util.Iterator;
import java.util.LinkedList;

class Address{
    String name;
    String city;
    String state;

    Address(String name, String city, String state){
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public String toString(){
        return name + " | " + city + " | " + state;
    }
}
public class AddressDetails {
    public static void main(String[] args) {
        LinkedList<Address> addressList = new LinkedList<>();

        addressList.add(new Address("Rupesh", "Mumbai", "Maharashtra"));
        addressList.add(new Address("Adarsh", "Alleppey", "Kerala"));
        addressList.add(new Address("Raj", "Vapi", "Gujarat"));

        Iterator<Address> iterator = addressList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
