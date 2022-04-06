package _05_access_modifier.exercise.student;

public class Student {
    private String name;
    private String classes;


    public Student(){
       this("John","C02");
    }

    public Student(String name,String classes){
        this.name=name;
        this.classes=classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
