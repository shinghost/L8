package People;

public class Student extends People{
    public Student(String name, String lastname, int age) {
        super(name, lastname, age);
    }
    public void learn(){
        System.out.println(name + " " + lastname + " is learning");
    }

    public static void main(String[] args) {
        Student student = new Student("Alex", "Shin", 21);
        System.out.println("Student's name: " + student.name + " lastname: " + student.lastname + " age: " + student.age);
        student.run();
        student.learn();
        student.walk();
    }
}
