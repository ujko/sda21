package day4.addressBook.DAO;

import day4.addressBook.model.Person;
import day5.IOTest;

import java.nio.file.NoSuchFileException;
import java.util.Arrays;

public class PersonDAOFile implements PersonDAO {
    private Person[] persons;

    public PersonDAOFile() {
        try {
            persons = (Person[])IOTest.odczytajObject();
        }catch (NoSuchFileException e) {
            persons = new Person[0];
            IOTest.zapiszObiekt(persons);
        }
    }

    @Override
    public void addPerson(Person person) {
        person.setId(generateId());
        persons = increasePerson(persons, person);
        IOTest.zapiszObiekt(persons);
    }

    private int generateId() {
        int a = 0;
        for (Person p : persons) {
            if (p != null && p.getId() > a) {
                a = p.getId();
            }
        }
        return a + 1;
    }

    @Override
    public Person[] getAllPersons() {
        return persons;
    }

    @Override
    public Person[] getPersonByName(String name) {
        Person[] temp = new Person[0];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getFirstName().equalsIgnoreCase(name)) {
                temp = increasePerson(temp, persons[i]);
            }
        }
        return temp;
    }

    private Person[] increasePerson(Person[] p, Person newPerson) {
        Person[] t = Arrays.copyOf(p, p.length +1);
        t[t.length-1] = newPerson;
        return t;
    }

    @Override
    public Person[] getPersonByLastName(String lastName) {
        Person[] temp = new Person[0];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getLastName().equalsIgnoreCase(lastName)) {
                temp = increasePerson(temp, persons[i]);
            }
        }
        return temp;
    }

    @Override
    public Person getPersonById(int personId) {
        for (Person p : persons) {
            if (p.getId() == personId) {
                return p;
            }
        }
        throw new IllegalArgumentException("Nie znaleziono");
    }

    @Override
    public void updatePerson(int id, Person newPerson) {
        for (int i = 0; i < persons.length; i++) {
            if (id == persons[i].getId()) {
                newPerson.setId(id);
                persons[i] = newPerson;
            }
        }
        IOTest.zapiszObiekt(persons);
    }

    @Override
    public void deletePerson(int id) {
        Person[] temp = new Person[persons.length];
        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (persons[i].getId() != id) {
                temp[i - j] = persons[i];
            } else {
                j++;
            }
        }
        if (j > 0) {
            persons = Arrays.copyOf(temp, temp.length - j);
        }
        IOTest.zapiszObiekt(persons);
    }
}
