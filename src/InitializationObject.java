import exception.Student;

public class InitializationObject {
    public static void main(String [] args) {
        Student student = Student.AgeAttribute(5);
        System.out.println(student.getAge());
        // do not library Lombok.
        //close
    }
}
