public class lastclass {

    public static void main(String[] args) {

        String name = "Rakshak";
        int marks1 = 85;
        int marks2 = 78;
        int marks3 = 92;

        int total = marks1 + marks2 + marks3;
        double percentage = total / 3.0;

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}