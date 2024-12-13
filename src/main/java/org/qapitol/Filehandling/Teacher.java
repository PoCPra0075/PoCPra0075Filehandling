package org.qapitol.Filehandling;

public class Teacher extends Person {
    private String subject;
    private int salary;

    public Teacher(int teacherid, String teachername, int teacherage, String subject, int salary) {
        super(teacherid,teachername,teacherage);
        this.subject=subject;
        this.salary=salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    void displayInfo(){
        System.out.println("ID: "+getId()+ " Name: "+getName()+ " Age: "+getAge()+
                " Subject: "+getSubject()+" Salary: "+getSalary());
    }
}
