package model;

public class FulltimeEmployee  extends Employee {
private int bonus;
private int fines;
private int netSalary;

    @Override
    public float getSalary() {
        float salary = netSalary + bonus - fines;
        return salary;
    }
    public FulltimeEmployee(String id, String fullname, int age, String phone, String email, int bonus, int fines, int salary) {
        super(id, fullname, age, phone, email);
        this.bonus = bonus;
        this.fines = fines;
        this.netSalary = salary;
    }

    public FulltimeEmployee() {
    }


    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFines() {
        return fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    public int getNeSalary() {
        return netSalary;
    }

    public void setNetsalary(int netsalary) {
        this.netSalary = netsalary;
    }


    @Override
    public String toString() {
        return "model.FulltimeEmployee{" +
                "bonus=" + bonus +
                ", fines=" + fines +
                ", salary=" + netSalary +
                '}';
    }
}
