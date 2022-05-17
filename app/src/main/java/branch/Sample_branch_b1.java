package branch;

public class Sample_branch_b1 {
    String name;
    float cgpa;
    double income;

    public Sample_branch_b1(String name, float cgpa, double income) {
        this.name = name;
        this.cgpa = cgpa;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
