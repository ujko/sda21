package day4.addressBook;

import day4.addressBook.DAO.PersonDAO;
import day4.addressBook.DAO.PersonDAOFile;
import day4.addressBook.DAO.PersonDAOMem;
import day4.addressBook.model.Address;
import day4.addressBook.model.Person;
import day4.addressBook.model.Phone;
import day4.addressBook.model.PhoneType;
import day5.IOTest;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;

public class AdressBook {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person[] persons = (Person[])IOTest.odczytajObject();
        System.out.println(Arrays.toString(persons));
    }

    private static void test() {
        Address a = new Address();
        a.setCity("Lodz");
        a.setPostCode("60-219");
        a.setStreet("Piotrkowska");
        Address b = new Address();
        b.setCity("Poznan");
        b.setPostCode("30-100");
        b.setStreet("Gajowa 6");
        Person p1 = new Person();
        p1.setAddress(a);
//        p1.setId(1);
        p1.addPhone(new Phone("77777777", PhoneType.HOME));
        p1.setFirstName("Kasia");
        p1.setLastName("Nowak");
        Person p2 = new Person();
        p2.setAddress(b);
//        p2.setId(8);
        p2.addPhone(new Phone("3333333333", PhoneType.WORK));
        p2.setFirstName("Adam");
        p2.setLastName("Kowalski");

        Person p3 = new Person();
        p3.setAddress(b);
//        p2.setId(8);
        p3.addPhone(new Phone("3333333333", PhoneType.WORK));
        p3.setFirstName("Adam");
        p3.setLastName("Nowak");
        PersonDAO dao = new PersonDAOMem();
        dao.addPerson(p1);
        dao.addPerson(p2);
        dao.addPerson(new Person(p2));
        dao.addPerson(new Person(p3));

        System.out.println(Arrays.toString(dao.getAllPersons()));
        System.out.println("************************************");
        System.out.println(Arrays.toString(dao.getPersonByName("Adam")));
        System.out.println(Arrays.toString(dao.getPersonByName("Zosia")));
        System.out.println("************************************");
        System.out.println(Arrays.toString(dao.getPersonByLastName("Nowak")));
        System.out.println(Arrays.toString(dao.getPersonByLastName("Zosia")));
        System.out.println("************************************");
        dao.updatePerson(2,p3);
        System.out.println(Arrays.toString(dao.getAllPersons()));
        System.out.println("************************************");
        dao.deletePerson(1);
        System.out.println(Arrays.toString(dao.getAllPersons()));
    }
}
