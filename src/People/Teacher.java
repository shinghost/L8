package People;

public class Teacher extends People{
    public Teacher(String name, String lastname, int age) {
        super(name, lastname, age);
    }
    public void teach(){
        System.out.println(name + " " + lastname + " is teaching");
    }

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Kate", "Fam", 43);
        System.out.println("Teacher's name: " + teacher.name + " lastname: " + teacher.lastname + " age: " + teacher.age);
        teacher.teach();
        teacher.voice();
    }
}
