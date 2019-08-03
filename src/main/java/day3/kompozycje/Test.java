package day3.kompozycje;

public class Test {
    public static void main(String[] args) {

        Person p = new Person();
        p.setAge(23);
        p.setName("Kasia");
        Address a = new Address();
        a.setCity("Lodz");
        a.setPostCode("99-300");
        a.setStreetName("Piotrkowska");
        p.setAddress(a);
        System.out.println(p);
        Address address = p.getAddress();
        String street = address.getStreetName();
        System.out.println(street);
        p.addPhone(new Phone("888-888-888", "mobile"));
        p.addPhone(new Phone("777-777-777", "home"));
        p.addPhone(new Phone("333-333-333", "work"));
        System.out.println(p);
    }
}
