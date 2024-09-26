package jose.zoo.com;
import java.util.Date;

public class Animal {
    // Create a static int that keep track of the number of animals created
    static int numOfAnimals = 0;

    // Create a constructor for our new Animal objects
    public Animal() {
        numOfAnimals++;
    }

    public Animal(String aName) {
        this.animalName = aName;
        numOfAnimals++;
    }

    // Create a few attributes (fields)
    // sex will be 'male' or female
    private String sex = "";
    // age will be in years
    private int age = 0;
    // weight will be in pounds
    private int weight = 0;
    //unique ID for each Animal
    private String animalID = "";
    // Animal name
    private String animalName;
    //Animal bday
    private Date animalBirthdate;
    //Animal color
    private String animalColor;
    //Animal origin
    private String animalOrigin;

    //Create a constructor to create a animal name

    // create getters and setters

    public int getage() { return age; }
    public void setage(int age) { this.age = age; }

    public String getSex() { return sex; }
    public void setSex( String sex) { this.sex = sex; }

    public int getWeight() { return weight; }
    public void setWeight (String sex) { this.weight = weight; }

    public String getAnimalID() { return animalID; }
    public void setAnimalID( String AnimalID) { this.animalID = animalID; }

    public String getAnimalName() { return animalName; }
    public void setAnimalName( String AnimalName) { this.animalName = animalName; }

    public Date getAnimalBirthdate() { return animalBirthdate; }
    public void setAnimalBirthdate( String AnimalBirthdate) { this.animalBirthdate = animalBirthdate; }

    public String getAnimalColor() { return animalColor; }
    public void setAnimalColor( String AnimalColor) { this.animalColor = animalColor; }

    public String getAnimalOrigin() { return animalOrigin; }
    public void setAnimalOrigin( String AnimalOrigin) { this.animalOrigin = animalOrigin; }






    }
}