package org.example;

class Student{
    String name;
    int age;
    double gpa;
    Student()
    {
        this.name="";
        this.age=0;
        this.gpa=0;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setGPA(double gpa)
    {
        this.gpa=gpa;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public double getGPA()
    {
        return gpa;
    }
}
