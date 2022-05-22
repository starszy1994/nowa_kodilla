public class Grades2 {
    public static void main(String[] agrs) {
        Grades grades = new Grades();
        grades.add(2);
        grades.add(4);
        int lastGrades=grades.returnLastGrade();
        System.out.println(lastGrades);
        double returnAverage=grades.returnAverage();
        System.out.println(returnAverage);
    }
}
