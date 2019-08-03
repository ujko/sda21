package day3.kompozycje;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private Address address;
    private Phone[] phones = new Phone[0];

    public void addPhone(Phone phone) {
        phones = Arrays.copyOf(phones, phones.length + 1);
        phones[phones.length - 1] = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    @Override
    public String toString() {
        String s = "\n";
        for(Phone p : phones) {
            s += p.toString() + "; \n";
        }
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", phones=" + s +
                '}';
    }
}
