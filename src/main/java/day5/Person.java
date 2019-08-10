package day5;

public class Person {
    private String firstName;
    private String lastName;
    private String phone;
    private String postCode;
    private String city;

    public Person(String firstName, String lastName, String phone, String postCode, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.postCode = postCode;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
