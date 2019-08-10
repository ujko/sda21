package day5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class IOTest {
    private final static String PLIK = "plik.txt";
    private final static String PLIK_KONFIGURACYJNY = "app.properties";
    private final static String PLIK_OBIEKT = "app.obj";

    public static void main(String[] args) throws NoSuchFileException {
//        zapiszDoPliku("c:/temp/plik1.txt", "ąćźżółśń");
//        odczytZPliku();
//        zapisDoPliku2(" ąćźńśół e");
//        odczytZPliku2();
        Ustawienia ustawienia = new Ustawienia();
        ustawienia.setName("Pawel");
        ustawienia.setLastName("NOwak");
        zapiszObiektGeneric(ustawienia);
        Ustawienia u = odczytajObjectGeneric();
//        zapiszKonfiguracje(ustawienia);
//        Ustawienia u = odczytajKonfiguracje();
//
//        System.out.println(u);

//        zapiszObiekt("Jakis string");
//        String o = (String)odczytajObject();
//        System.out.println(o);

//        zapiszObiekt(ustawienia);
//        Ustawienia u = (Ustawienia) odczytajObject();
//        System.out.println(u);
    }

    public static void zapiszDoPliku(String text) {
        try (PrintWriter writer = new PrintWriter(PLIK, "utf-8")) {
            writer.print(text);
            writer.flush();
        } catch (FileNotFoundException e) {
            System.out.println("Nie mozna zapisac");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void odczytZPliku() {
        File file = new File(PLIK);
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static void zapisDoPliku2(String text) {
        try {
            Files.write(Paths.get(PLIK), text.getBytes("utf-8"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void odczytZPliku2() {
        try {
            List<String> s = Files.readAllLines(Paths.get(PLIK));
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void zapiszKonfiguracje(Ustawienia ustawienia) {
        Properties properties = new Properties();
        properties.setProperty("imie", ustawienia.getName());
        properties.setProperty("nazwisko", ustawienia.getLastName());
        try (OutputStream os = new FileOutputStream(PLIK_KONFIGURACYJNY)){
            properties.store(os, "Nasz komentarz");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Ustawienia odczytajKonfiguracje() {
        Ustawienia ustawienia = new Ustawienia();
        try (InputStream is = new FileInputStream(PLIK_KONFIGURACYJNY)){
            Properties p = new Properties();
            p.load(is);
            ustawienia.setName(p.getProperty("imie"));
            ustawienia.setLastName(p.getProperty("nazwisko"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ustawienia;
    }

    public static void zapiszObiekt(Object object) {
        try (OutputStream os = new FileOutputStream(PLIK_OBIEKT)){
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Object odczytajObject() throws NoSuchFileException {
        Object object = null;
        try (InputStream is = new FileInputStream(PLIK_OBIEKT)){
            ObjectInputStream ois = new ObjectInputStream(is);
            object = ois.readObject();
        } catch (Exception e) {
            throw new NoSuchFileException("Brak pliku");
        }
        return object;
    }


    public static <T> void zapiszObiektGeneric(T t) {
        try (OutputStream os = new FileOutputStream(PLIK_OBIEKT)){
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static <T> T odczytajObjectGeneric() throws NoSuchFileException {
        T object = null;
        try (InputStream is = new FileInputStream(PLIK_OBIEKT)){
            ObjectInputStream ois = new ObjectInputStream(is);
            object = (T)ois.readObject();
        } catch (Exception e) {
            throw new NoSuchFileException("Brak pliku");
        }
        return object;
    }
}
