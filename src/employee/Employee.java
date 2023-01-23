package employee;

public class Employee {
    private int id;
    private String name;
    private double hour;
    private double rate;
    private double rateTax;

    public Employee(int id, String name, double hour, double rate, double rateTax) {
        this.id = id;
        this.name = name;
        this.hour = hour;
        this.rate = rate;
        this.rateTax = rateTax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRateTax() {
        return rateTax;
    }

    public void setRateTax(double rateTax) {
        this.rateTax = rateTax;
    }

    public String toString(){
        return getId()+"    "+getName()+"    "+getHour()+"    "+getRate()+"    "+
                getRateTax()+"\n";
    }
}
