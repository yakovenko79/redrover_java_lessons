import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {


        Person p1 = new Person();
        p1.name = "John Smith";
        p1.age = 32;
        p1.sex = true;
        System.out.println(p1.getName());


        Employee employee1 = new Employee();
        employee1.name = "Jessica Smith";
        employee1.age = 22;
        employee1.sex = String.valueOf(false);
        employee1.salary = 100;

        Employee employee2 = new Employee();
        employee2.name = "Jessica Smith";
        employee2.age = 20;
        employee2.sex = String.valueOf(false);
        employee2.salary = 200;

        Employee[] employees = new Employee[]{employee1, employee2};
        System.out.println(employee1.isSameName(employee2));
        System.out.println(Salary.getSum(employees));
    }
}
