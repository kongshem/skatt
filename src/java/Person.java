import java.util.UUID;

//TODO: Fullfør klassen Person
public class Person {
    String firstName;
    String lastName;
    UUID socialSecurityNumber;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = UUID.randomUUID();
    }
}
