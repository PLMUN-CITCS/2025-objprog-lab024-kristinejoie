// Person class definition
class Person {
    // Attributes (Instance variables)
    String name;
    int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name; // Assign parameter value to instance variable
        this.age = age;
    }

    // Default Constructor
    public Person() {
        this.name = "Unknown"; // Default value for name
        this.age = 0;          // Default value for age
    }

    // Method to display person's details
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class
public class PersonDemo {
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Person person1 = new Person("Bob", 30);

        // Creating an object using the default constructor
        Person person2 = new Person();

        // Displaying person details
        person1.displayPerson();
        person2.displayPerson();
    }
}
