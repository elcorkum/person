
package personDetails;


public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Mary", "Poppins");
        Person person2 = new Person("Mike", "Purdy");
        Person person3 = new Person("Maya", "Pugh");
        Person person4 = new Person("Monty", "Peaches");


        Person[] personArray = {person1, person2, person3, person4};
        PersonHandler people = new PersonHandler(personArray);
        System.out.println(people.forEachLoop());
        System.out.println(people.forLoop());
        System.out.println(people.whileLoop());

    }
}
