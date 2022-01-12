package exception;

import java.util.InputMismatchException;

public class Student {
    private int age;
    public Student(int age) {
        this.age = age;
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
}

class Person extends Student{

    public Person(int age) {
        super(age);
    }
}
