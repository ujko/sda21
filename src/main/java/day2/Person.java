package day2;

public class Person {
    private String name;
    private int age;
    public String title;
    public static String family;

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

    public void test() {
        System.out.println("Imie " + name + " wiek " + age + " tytul " + title + " Family " + family);
    }

    @Override
    public String toString() {
        return "Imie " + name +
                " wiek " + age +
                " tytul " + title +
                " Family " + family;
    }
}
