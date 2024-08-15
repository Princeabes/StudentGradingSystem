import java.util.Scanner;

class Subject {
    private String name;
    private int internalMarks;
    private int externalMarks;
    private double credits;
    private int maxMarks;

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInternalMarks(int internalMarks) {
        this.internalMarks = internalMarks;
    }

    public void setExternalMarks(int externalMarks) {
        this.externalMarks = externalMarks;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public double getCredits() {
        return credits;
    }

    public String getName() {
        return name;
    }

    public int getTotalMarksObtained() {
        return internalMarks + externalMarks;
    }

    public int getInternalMarks() {
        return internalMarks;
    }

    public int getExternalMarks() {
        return externalMarks;
    }

    public double calculateGradePoints(int totalMarks, double credits, int marksObtained) {
        double gradePoint;
        double tenPercent = 0.1 * totalMarks;

        if (marksObtained > (totalMarks - tenPercent)) {
            gradePoint = 10;
        } else if (marksObtained > (totalMarks - 2 * tenPercent)) {
            gradePoint = 9;
        } else if (marksObtained > (totalMarks - 3 * tenPercent)) {
            gradePoint = 8;
        } else if (marksObtained > (totalMarks - 4 * tenPercent)) {
            gradePoint = 7;
        } else if (marksObtained > (totalMarks - 5 * tenPercent)) {
            gradePoint = 6;
        } else if (marksObtained > (totalMarks - 6 * tenPercent)) {
            gradePoint = 5;
        } else if (marksObtained > (totalMarks - 7 * tenPercent)) {
            gradePoint = 4;
        } else {
            gradePoint = 0;
        }

        return gradePoint * credits;
    }
}

class Student {
    private Scanner scanner = new Scanner(System.in);
    private int numberOfSubjects;

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }

    public double calculateSGPA() {
        Subject[] subjects = new Subject[numberOfSubjects];
        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 0; i < numberOfSubjects; i++) {
            subjects[i] = new Subject();
            System.out.println("Enter the Subject Name:");
            subjects[i].setName(scanner.nextLine());
            scanner.nextLine(); // Consume newline
            System.out.println("Enter the Credits of the Subject:");
            subjects[i].setCredits(scanner.nextDouble());
            System.out.println("Enter Internal Marks for the Subject:");
            subjects[i].setInternalMarks(scanner.nextInt());
            System.out.println("Enter External Marks for the Subject:");
            subjects[i].setExternalMarks(scanner.nextInt());
            System.out.println("Enter the Total Marks for the Subject:");
            subjects[i].setMaxMarks(scanner.nextInt());

            totalCredits += subjects[i].getCredits();
            totalGradePoints += subjects[i].calculateGradePoints(subjects[i].getMaxMarks(), subjects[i].getCredits(), subjects[i].getTotalMarksObtained());
        }

        return totalGradePoints / totalCredits;
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter the Number of Subjects:");
        student.setNumberOfSubjects(scanner.nextInt());

        System.out.println("The SGPA is: " + student.calculateSGPA());
    }
}
