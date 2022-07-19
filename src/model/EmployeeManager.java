package model;

import java.util.ArrayList;

public class EmployeeManager {
    private static ArrayList<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
      FulltimeEmployee b1 = new FulltimeEmployee(100, 0, 100000);
      FulltimeEmployee b2 = new FulltimeEmployee(120, 0, 100000);
      FulltimeEmployee b3 = new FulltimeEmployee(110, 0, 100000);
      PartimeEmployee b4 = new  PartimeEmployee(60f);
      PartimeEmployee b5 = new  PartimeEmployee(50f);
        employees.add(b1);
        employees.add(b2);
        employees.add(b3);
        employees.add(b4);
        employees.add(b5);
    }
}
