package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("123", "Adam", "J", 35);
        } catch (IncorrectAgeException | NameUndefinedException e) {
            System.err.println(e.getMessage());
            System.err.println("Koniec programu");
        }
    }
}
