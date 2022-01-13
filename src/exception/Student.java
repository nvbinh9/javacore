package exception;

import java.util.InputMismatchException;

public class Student extends Object {
    private int age;
    private String name;
    private String address;
    private String mobile;
    private String job;

    public static Student AgeAttribute(int age) {
        Student student = new Student();
        student.age = age;
        return student;
    }

    public Student() {

    }

    public Student() {

    }

    public void setAge(int age) {
        if(age < 0) throw new InputMismatchException("Tuổi không hợp lệ");
        else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    private String Pen() {
        return "Pen ACC";
    }

    public void Cut() {
        System.out.println(Pen());
    }

    public static Student NameAddressAttribute(String name, String address) {
        Student student = new Student();
        student.name = name;
        student.address = address;
        return student;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getJob() {
        return job;
    }



}

class Person extends Student{

}
