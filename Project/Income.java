public class Income {
    private double salary;          // เงินเดือน 40(1)
    private double otherEarnings;   // รายได้อื่น ๆ 40(1)

    public double getTotalIncome() {
        return this.salary + this.otherEarnings;
    }

    public double getSalary(double salary) {
        return this.salary= salary;
    }

    public double getOtherEarnings(double otherEarnings) {
        return this.otherEarnings = otherEarnings;
    }
}