package People;

public class People {
    protected String name;
    protected String lastname;
    protected int age;

    public People(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    public void walk(){
        System.out.println(name + " " + lastname + " is walking");
    }
    public void voice(){
        System.out.println(name + " " + lastname + " is talking");
    }
    public void run(){
        System.out.println(name + " " + lastname + " is running");
    }
}
