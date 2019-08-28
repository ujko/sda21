package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OsobaTest {

    public static void main(String[] args) {
        List<Osoba> osoby = new ArrayList<>();
        osoby.add(new Osoba("Pawel", "Laskowki", 33));
        osoby.add(new Osoba("Kazimierz", "Marecki", 21));
        osoby.add(new Osoba("Ala", "Kowalski", 45));
        osoby.add(new Osoba("Jurek", "Nowak", 18));

        Map<String, Integer> map = osoby
                .stream()
                .collect(Collectors
                        .toMap((x) -> (x.getName()+ x.getSurName()) , Osoba::getAge));

        System.out.println(map);
    }
}
