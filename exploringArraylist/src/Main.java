// Jose Horta
// 9/24/2025
//

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        // Create an Arraylist of Strings
        ArrayList<String> myListofStrings = new ArrayList<>();

        // Add a few elements yo my Arraylist.
        myListofStrings.add("first");
        myListofStrings.add("second");
        myListofStrings.add("third");

        //output our arrayslist
        System.out.println("my\n myListOfStrings is: " + myListofStrings);

        // Remove an element.
        myListofStrings.remove(0);

        // Output our ArrayList
        System.out.println("\n  After removing...");
        System.out.println("\n myListOfStrings is: " + myListofStrings);

        // Remove an element.
        myListofStrings.remove("third");
        System.out.println("\n  After removing...");
        System.out.println("\n myListOfStrings is: " + myListofStrings);


        for (int i=0; i<10; i++) {
            String toAdd ="";
            toAdd = toAdd + "a" + Integer.toString(i);
            myListofStrings.add(toAdd);
        }
        // Output our ArrayList
        System.out.println("After adding a bunch of stuff...");
        System.out.println(myListofStrings);

        // Use a for loop to output each element of our Arraylist
        for (int i = 0; i< myListofStrings.size(); i++) {
            System.out.println("An element in my list is: " + myListofStrings.get(i));
        }


    }
}