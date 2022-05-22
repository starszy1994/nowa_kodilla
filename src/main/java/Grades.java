public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int grade) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = grade;
        this.size++;
    }
    public int returnLastGrade() {
        return this.grades[this.size-1];

    }
    public double returnAverage() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += this.grades[i];
        }
        return sum / this.size;
    }
}