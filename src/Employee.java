public class Employee implements Comparable<Employee>{
    private Long id;
    private int age;
    private int salary;

    public Long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                '}'+System.lineSeparator();
    }

    public int getSalary() {
        return salary;
    }

    public Employee(Long id, int age, int salary) {
        this.id = id;
        this.age = age;
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee o) {
        return salary-o.getSalary();
    }
}
