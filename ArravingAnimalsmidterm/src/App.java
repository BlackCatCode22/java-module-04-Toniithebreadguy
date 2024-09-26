//JH
// 09/19/2024
//

package jose.zoo.com;

public class App {
    public static void main(String[] args) {
      System.out.println("\nWelcome to my Zoo program");

      jose.zoo.com.Animal myAnimal = new jose.zoo.com.Animal();
      myAnimal.setAnimalName("My first animal name");
      System.out.println("\n The name of the new animal is: " + myAnimal.getAnimalName());
    }
}