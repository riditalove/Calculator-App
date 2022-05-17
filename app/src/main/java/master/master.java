package master;

public class master {

    int roll;
    String name;

    public master(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }
}
