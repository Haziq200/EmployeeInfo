package sg.edu.rp.dmsd.employeeinfo;

/**
 * Created by 17010603 on 17/7/2018.
 */

public class EmpInfo {
    private String name;
    private  String diploma;
    private float salary;

    public EmpInfo(String name, String diploma, float salary) {
        this.name = name;
        this.diploma = diploma;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmpInfo{" +
                "name='" + name + '\'' +
                ", diploma='" + diploma + '\'' +
                ", salary=" + salary +
                '}';
    }
}
