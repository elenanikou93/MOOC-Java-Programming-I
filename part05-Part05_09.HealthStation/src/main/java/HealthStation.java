
public class HealthStation {
    private int counter;

    public HealthStation() {
        this.counter = 0;
    }


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        counter += 1;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(weigh(person) + 1);        
    }

    public int weighings() {
        return this.counter;
    }

}
