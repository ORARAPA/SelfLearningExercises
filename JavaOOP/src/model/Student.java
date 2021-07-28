package model;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int idno;

    public Student(String name, int age, String gender, int id_no) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idno = idno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdno() {
        return idno;
    }

    public void setIdno(int idno) {
        this.idno = idno;
    }
}
