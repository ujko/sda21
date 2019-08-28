package day7.lambdy;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonMain {
    private List<Person> personList = createPersons();


    public static void main(String[] args) {




//        persons.forEach(System.out::println);
//        Collections.sort(persons);
//        System.out.println("*********************************");
//        persons.forEach(System.out::println);
//
//        Collections.sort(persons, (a,b) -> b.getAge() - a.getAge());
//
//        System.out.println("*********************************");
//        persons.forEach(System.out::println);
        PersonMain pm = new PersonMain();
//        pm.getPersonByName("kasia")
//                .ifPresent((p) -> System.out.println(p));
//        pm.getAllOverAge(20).forEach(System.out::println);
//        pm.doSth();

        String[] names = new String[3];
        names[0] = "pawel";
        names[1] = "kasia";
        names[2] = "jarek";
        Arrays.stream(names)
                .peek(System.out::println)
                .filter((x) -> x.contains("e"))
                .map((x) -> x.substring(0,1).toUpperCase() + x.substring(1,x.length()).toLowerCase())
                .forEach(System.out::println);
    }

    private Optional<Person> getPersonByName(String name) {
        return personList
                .stream()
                .filter((p) -> p.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    private void doSth() {
        List<Person> persons = personList
                .stream()
                .map((p) -> new Person(p.getName().toUpperCase(), p.getAge()))
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
        persons.forEach(System.out::println);
    }

    private List<Person> getAllOverAge(int age) {
        Stream<Person> stream = personList.stream();
//        stream.forEach(System.out::println);
        return stream
                .filter((p) -> p.getAge() >= age)
                .collect(Collectors.toList());
    }


    private static List<Person> createPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("pawel", 24));
        persons.add(new Person("Kasia", 18));
        persons.add(new Person("Zdzisiek", 16));
        persons.add(new Person("Ania", 22));
        persons.add(new Person("Grazyna", 17));
        return persons;
    }
}
