package com.ogiraffers.model.dto;


public class EmployeeDTO {

    private String empId;
    private String empName;
    private String empNo;
    private String email;
    private String phone;
    private String deptCode;
    private String jobCode;
    private String salLevel;
    private double salary;
    private double bonus;
    private String managerId;
    private java.sql.Date hireDate;
    private java.sql.Date entDate;
    private String entYn;


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }


    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }


    public String getSalLevel() {
        return salLevel;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }


    public java.sql.Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(java.sql.Date hireDate) {
        this.hireDate = hireDate;
    }


    public java.sql.Date getEntDate() {
        return entDate;
    }

    public void setEntDate(java.sql.Date entDate) {
        this.entDate = entDate;
    }


    public String getEntYn() {
        return entYn;
    }

    public void setEntYn(String entYn) {
        this.entYn = entYn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empNo='" + empNo + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salLevel='" + salLevel + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", managerId='" + managerId + '\'' +
                ", hireDate=" + hireDate +
                ", entDate=" + entDate +
                ", entYn='" + entYn + '\'' +
                '}';
    }
}
