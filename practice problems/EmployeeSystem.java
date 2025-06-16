class Employee {
    private String name;
    private int id;
    private double salary;
    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getsalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getid() {
        return id;
    }

    public double calculateSalary() {
        return salary;
    }

}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getsalary() + bonus;
    }
}
class Developer extends Employee{
    private int overtime;
    private double rate;
    
    public Developer (String name, int id, double salary, int overtime, double rate) {
        super(name, id, salary);
        this.overtime = overtime;
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        return getsalary() + overtime * rate;
    }
}

public class EmployeeSystem {

    public static void main(String[] args) {
        Manager m = new Manager("Ram", 01, 50000, 10000);
        Developer d = new Developer("Shyam", 02, 40000, 20, 400);

        System.out.println("Manager Salary: " + m.calculateSalary());
        System.out.println("Developer Salary: " + d.calculateSalary());
    }
}