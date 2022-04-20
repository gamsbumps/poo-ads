package Exercicios3;

public class Department {
    private int code;
    private String departmentName;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        if (code > 0) this.code = code;
        else System.out.println("Input a code higher than 0");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        if (departmentName != null) this.departmentName = departmentName;
        else System.out.println("Name cannot be null");
    }

    public Department(int code, String departmentName) {
        this.setCode(code);
        this.setDepartmentName(departmentName);
    }

    @Override
    public String toString() {
        return "Department " +
                "Code: " + code +
                ", Department name: " + departmentName;
    }
}
