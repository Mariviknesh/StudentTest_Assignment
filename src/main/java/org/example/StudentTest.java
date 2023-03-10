package org.example;

import java.util.Scanner;
import java.util.*;
import java.util.logging.*;

public class StudentTest
{
    public static void main( String[] args )
    {

        String name;
        double gpa;
        int age;
        int n;
        Logger log=Logger.getLogger("com.api.jar");
        Scanner mysc=new Scanner(System.in);
        log.info("Enter the number of Students:");
        n=mysc.nextInt();
        Student[] s=new Student[n];
        List<Student> studList=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            log.info("Enter the Student's name:");
            name=mysc.next();
            log.info("Enter the Student's age:");
            age=mysc.nextInt();
            log.info("Enter the Student's gpa:");
            gpa=mysc.nextDouble();
            s[i]=new Student();
            s[i].setName(name);
            s[i].setAge(age);
            s[i].setGPA(gpa);
            studList.add(s[i]);
        }
        for(int i=0;i<n;i++)
        {
            log.info("Student name:"+s[i].getName()+"\n");
            log.info("Student age:"+s[i].getAge()+"\n");
            log.info("Student gpa:"+s[i].getGPA()+"\n");
        }
        Collections.sort(studList,new Comparator<>() {
            public int compare(Student s1,Student s2)
            {
                double res= s2.getGPA()-s1.getGPA();
                return (int)res;
            }
        });
        log.info("After Update\n");
        log.info("Array List\n");
        for(int i=0;i<n;i++)
        {
            log.info("Student name:"+studList.get(i).getName()+"\n");
            log.info("Student age:"+studList.get(i).getAge()+"\n");
            log.info("Student gpa:"+studList.get(i).getGPA()+"\n");

        }
        mysc.close();
    }
}


