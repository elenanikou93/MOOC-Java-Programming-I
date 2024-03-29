import java.util.ArrayList;

public class BirdWatching {
    private ArrayList<String> birdNames;
    private String birdName;
    private String birdNnameInLatin;
    private int observations;

    public BirdWatching(String birdName, String birdNameInLatin, int observations) {
        this.birdNames = new ArrayList<>();
        this.birdName = birdName;
        this.birdNnameInLatin = birdNameInLatin;
        this.observations = 0;
    }

    public String getName() {
        return this.birdName;
    }

    public String getNameInLatin() {
        return this.birdNnameInLatin;
    }

    public int getObservations() {
        return this.observations;
    }

    public void addObservation() {
        this.observations += 1;
    }

    public String toString() {
        return getName() + " (" + getNameInLatin() + "): " + getObservations() + " observations";
    }


}
