package model;

public class PartimeEmployee extends Employee {
  private float workHours;

    public PartimeEmployee(String id, String fullname, int age, String phone, String email, float workHours) {
        super(id, fullname, age, phone, email);
        this.workHours = workHours;
    }


    @Override
    public float getNetsalary() {
        return workHours * 100000;
    }

    public PartimeEmployee() {
    }

    public float getWorkHours() {
        return workHours;
    }

    public void setWorkHours(float workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "PartimeEmployee{" +
                "workHours=" + workHours +
                '}';
    }
}
