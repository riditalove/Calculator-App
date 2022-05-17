package branch;

public class Sample_branch_b1 {
    String name;
    float cgpa;
    int number_of_classes;

    public Sample_branch_b1(String name, float cgpa, int number_of_classes) {
        this.name = name;
        this.cgpa = cgpa;
        this.number_of_classes = number_of_classes;
    }

    public int getNumber_of_classes() {
        return number_of_classes;
    }

    public void setNumber_of_classes(int number_of_classes) {
        this.number_of_classes = number_of_classes;
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
