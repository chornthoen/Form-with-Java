package registration;

public class Registration {
    private String name,gender,address,month,day,year;
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Registration(String name, String gender, String mobile, String month, String day, String year, String address) {
        this.name = name;
        this.mobile = mobile;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.address = address;
    }
    public String toString(){
        return getName()+", "+getMobile()+", "+getGender()+", "+getDay()+"-"+getMonth()+"-"+getYear()+", "+getAddress()+"\n";
    }

}
