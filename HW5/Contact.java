package HW5;

import java.util.ArrayList;

public class Contact {
    
    public String name;
    public ArrayList<String> phoneNumbers = new ArrayList<>();
    
    public Contact(String name, String number){
        this.name = name;
        phoneNumbers.add(number);
    }

}


