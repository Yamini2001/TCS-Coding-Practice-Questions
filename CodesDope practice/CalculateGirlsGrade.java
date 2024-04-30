class Main {
    public static void main(String[] args) {
        int totalStudents = 90;
        int boys = 45;
        int boysWithGradeA = 20;

        // Calculate the total number of students with grade A
        int studentsWithGradeA = totalStudents / 2;

        // Calculate the total number of girls with grade A
        int girlsWithGradeA = studentsWithGradeA - boysWithGradeA;

        System.out.println("Total number of girls getting grade 'A': " + girlsWithGradeA);
    }
}
