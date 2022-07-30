package pers.dhx_.pojo;

/**
 * @author Dhx_
 * @className Emp
 * @description TODO
 * @date 2022/7/29 18:46
 */
public class Emp {
    private Integer empId;
    private String empName;
    private String gender;
    private  Integer age;

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", deptId=" + deptId +
                '}';
    }

    public Emp(Integer empId, String empName, String gender, Integer age, Integer deptId) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.age = age;
        this.deptId = deptId;
    }

    private Integer deptId;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}
