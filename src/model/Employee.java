package model;

public abstract class Employee {
    private String id;
    private String fullname;
    private int age;
    private String phone;
    private String email;

    public  abstract float getSalary();

    public Employee(){

    }
    public Employee(String id, String fullname, int age, String phone, String email) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
