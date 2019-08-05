package day4.addressBook.DAO;

import day4.addressBook.model.Person;

public interface PersonDAO {
    void addPerson(Person person);
    Person[] getAllPersons();
    Person[] getPersonByName(String name);
    Person[] getPersonByLastName(String lastName);
    Person getPersonById(int personId);
    void updatePerson(int id, Person newPerson);
    void deletePerson(int id);
}
