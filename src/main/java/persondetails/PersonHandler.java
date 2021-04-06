package persondetails;

public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = " ";
        int counter = 0;
        while (counter < personArray.length) {
            String currentPerson = personArray[counter].toString();
            StringBuilder output = (new StringBuilder().append(currentPerson).append(result));
            System.out.println(output);
            counter++;
        }
        return result;
    }

    public String forLoop() {
        String result = " ";
        for (int counter = 0; counter < personArray.length; counter++) {
            String currentPerson = personArray[counter].toString();
            StringBuilder output = (new StringBuilder().append(currentPerson).append(result));
            System.out.println(output);
        }
        return result;
    }

    public String forEachLoop() {
        String result = " ";
        for (Person p : personArray) {
            String currentPerson = p.toString();
            StringBuilder output = (new StringBuilder().append(currentPerson).append(result));
            System.out.println(output);
        }
        return result;
    }

    public Person[] getPersonArray() {
        return personArray;
    }

    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Joe","Shmoe");
        people[1] = new Person("Joe","Brick");
        people[2] = new Person("Joe","Shmoe");


        PersonHandler personHandler = new PersonHandler(people);
        personHandler.whileLoop();
        personHandler.forLoop();
        personHandler.forEachLoop();
        personHandler.getPersonArray();
    }
}

