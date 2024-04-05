package personDetails;

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        StringBuilder personsName = new StringBuilder();
        personsName.append("\nMy first name is " + firstName);
        personsName.append("\nMy last name is " + lastName);

        return personsName.toString();

    }
}
