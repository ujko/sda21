package day4.addressBook.model;


import java.util.Arrays;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private Address address;
    private Phone[] phones = new Phone[0];

    public Person() {
    }

    public Person(Person person) {
        this.id = person.getId();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.address = new Address();
        this.address.setStreet(person.getAddress().getStreet());
        this.address.setCity(person.getAddress().getCity());
        this.address.setPostCode(person.getAddress().getPostCode());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone[] getPhones() {
        return phones;
    }

   public void addPhone(Phone phone) {
        this.phones = Arrays.copyOf(phones, phones.length + 1);
        phones[phones.length-1] = phone;
   }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", phones=" + Arrays.toString(phones) +
                '}' + '\n';
    }
}
