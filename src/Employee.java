public class Employee {
    private  String name;
    private int year;
    private double salary;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(String name, int year, double salary, String address) {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.address = address;
    }
    public void display(){

        System.out.println(getName()+" "+getYear()+"  "+getSalary()+" - "+getAddress());
    }


}

