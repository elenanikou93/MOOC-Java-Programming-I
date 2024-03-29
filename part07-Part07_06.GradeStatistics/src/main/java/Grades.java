import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;    

    public Grades() {
        this.grades = new ArrayList<>();                
    }

    public void add(int input) {
        this.grades.add(input);
    }

    public double averageOfAll() {
        int sum = 0;

        for (Integer grade: grades) {
            sum += grade;
        }

        double average = (sum * 1.0) / grades.size();

        return average;
    }

    public double averageOfPassingGrades() {
        int sumOfPassed = 0;
        int counterOfPassed = 0;
        double averageOfPassed = 0;
        

        for (Integer grade: grades) {

            if (grade > 0 && grade < 50) {
                continue;
            } else if (grade >= 50) {
                sumOfPassed += grade;
                counterOfPassed++;
            }
        }

        if (counterOfPassed != 0) {
            averageOfPassed = (sumOfPassed * 1.0) / counterOfPassed;
        } else {
            averageOfPassed = 0;
        }

        return averageOfPassed;
    }

    public double passPercentage() {
        int passingGrades = 0;

        for (Integer grade: grades) {
            
            if (grade > 0 && grade < 49) {
                continue;
            } else if (grade >= 50 && grade <= 100) {
                passingGrades++;
            }           
           
        }

        double percentage = 100 * ((1.0 * passingGrades) / grades.size());

        return percentage;
    }

    public void gradeDistribution() {
        System.out.println("Grade distribution:");

        int[] numbers = new int[6];

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 50) {
                numbers[0]++;
            } else if (grades.get(i) < 60) {
                numbers[1]++;
            } else if (grades.get(i) < 70) {
                numbers[2]++;
            } else if (grades.get(i) < 80) {
                numbers[3]++;
            } else if (grades.get(i) < 90) {
                numbers[4]++;
            } else if (grades.get(i) >= 90) {
                numbers[5]++;
            }
        }

        int index = 5;

        while (index >=0) {
            System.out.print(index + ": ");
            for (int j = 0; j < numbers[index]; j++) {
                System.out.print("*");
            }

            index--;
            System.out.println("");
        }

        
    }

    public void printGrades() {
        gradeDistribution();
    }

    @Override
    public String toString() {
        String passingAverage = " ";

        if (averageOfPassingGrades() != 0) {
            passingAverage = "Point average (passing): " + averageOfPassingGrades();
        } else {
            passingAverage = "Point average (passing): -";
        }

        return "Point average (all): " + averageOfAll() + "\n" + passingAverage + "\nPass percentage: " + passPercentage();
    }

     

    

}
