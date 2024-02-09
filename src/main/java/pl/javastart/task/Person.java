package pl.javastart.task;

public class Person {
    private String pesel;
    private String name;
    private String lastName;
    private int age;

    public Person(String pesel, String name, String lastName, int age) {
        checkNameOrLastName(name);
        checkNameOrLastName(lastName);
        checkAge(age);
        this.pesel = pesel;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkNameOrLastName(name);
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        checkNameOrLastName(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pesel='" + pesel + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    private void checkNameOrLastName(String source) {
        if (source == null) {
            throw new NameUndefinedException("Name and last name can not be null");
        } else if (source.length() < 2) {
            throw new NameUndefinedException("Name and last name can not be lees than 2 characters long");
        }
    }

    private void checkAge(int age) {
        if (age < 1) {
            throw new IncorrectAgeException("Age can not be less then 0");
        }
    }
}
