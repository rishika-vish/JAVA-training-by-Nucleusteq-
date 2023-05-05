
public class Student {
    private int rollNumber;
    private String name;
    private String course;
    private double marks1;
    private double marks2;
    private double marks3;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks1() {
        return marks1;
    }

    public void setMarks1(double marks1) {
        this.marks1 = marks1;
    }

    public double getMarks2() {
        return marks2;
    }

    public void setMarks2(double marks2) {
        this.marks2 = marks2;
    }

    public double getMarks3() {
        return marks3;
    }

    public void setMarks3(double marks3) {
        this.marks3 = marks3;
    }

    public double calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    public double calculateAverage() {
        return calculateTotal() / 3;
    }

    public String calculateGrade() {
        double average = calculateAverage();

        if (average >= 80) {
            return "A";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    public String toString() {
        return "Roll Number: " + rollNumber + "\n"
             + "Name: " + name + "\n"
             + "Course: " + course + "\n"
             + "Marks 1: " + marks1 + "\n"
             + "Marks 2: " + marks2 + "\n"
             + "Marks 3: " + marks3 + "\n"
             + "Total Marks: " + calculateTotal() + "\n"
             + "Average Marks: " + calculateAverage() + "\n"
             + "Grade: " + calculateGrade() + "\n";
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setRollNumber(1);
        student1.setName("John");
        student1.setCourse("Science");
        student1.setMarks1(75);
        student1.setMarks2(80);
        student1.setMarks3(85);

        Student student2 = new Student();
        student2.setRollNumber(2);
        student2.setName("Mary");
        student2.setCourse("Math");
        student2.setMarks1(90);
        student2.setMarks2(95);
        student2.setMarks3(85);

        Student student3 = new Student();
        student3.setRollNumber(3);
        student3.setName("Bob");
        student3.setCourse("English");
        student3.setMarks1(60);
        student3.setMarks2(70);
        student3.setMarks3(65);

        Student student4 = new Student();
        student4.setRollNumber(4);
        student4.setName("Alice");
        student4.setCourse("History");
        student4.setMarks1(40);
        student4.setMarks2(55);
        student4.setMarks2(65);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());

    }}