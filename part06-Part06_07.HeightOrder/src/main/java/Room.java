import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        if (this.people.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }

        Person shortestPerson = people.get(0);

        for (Person person: people) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }

        return shortestPerson;

    }

    public Person take() {
        if (people.isEmpty()) {
            return null;
        }

        Person taken = shortest();
        people.remove(taken);

        return taken;

    }

}
