package exception;

import java.util.*;

public class Entry {

    public static void main(String [] args) {
        List<String> array = new ArrayList<>();
        array.add("A");
        array.add("B");
        array.add("C");

        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }

        System.out.println(array.toString());
        array.add("G");
        array.add("M");
//        array.forEach(i -> System.out.println(i));
<<<<<<< HEAD
        Student student = new Student(3);
        Student student1 = new Student();
        System.out.println("set age:");
        System.out.println(student.getAge());
        try {
            student1.setAge(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("set age" + student1.getAge());
=======
        Student student = new Student();
>>>>>>> develop
        test(student);
        System.out.println("Result:" + student.getAge());
        test1(student);
        System.out.println("Result:" + student.getAge());
        System.out.println("---nvb");
        student.getAge();
        student.toString();

    }

    public static void test(Student student) {
        Student student1 = new Student();
        student = student1;
        System.out.println(student.getAge());
    }
    public static void test1(Student student) {
        student.setAge(33);
        System.out.println(student.getAge());
    }

}
