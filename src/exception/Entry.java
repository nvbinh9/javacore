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
        Student student = new Student();
        test(student);
        System.out.println("last for test:" + student.getAge());
        test1(student);
        System.out.println("last for test:" + student.getAge());
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
