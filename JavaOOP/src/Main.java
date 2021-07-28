import model.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Paraluman",22, "female",14300);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getIdno());

        student.setName("Mark");
        student.setAge(24);
        student.setGender("male");
        student.setIdno(10046);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getIdno());

    }
}