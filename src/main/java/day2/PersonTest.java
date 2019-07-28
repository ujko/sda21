package day2;

public class PersonTest {

    public static void main(String[] args) {
        Person.family = "roza";
        Person p1 = new Person();
        p1.title = "mgr";
        p1.setAge(23);
        p1.setName("Karolina");

        Person p2 = new Person();
        p2.title = "inz";
        p2.setAge(43);
        p2.setName("Ania");

/*        p1.test();
        p2.test();
        new Person().test();*/

        System.out.println(p1);
        System.out.println(p2);

        p1.setAge(100);
        System.out.println(p1);
    }
}
