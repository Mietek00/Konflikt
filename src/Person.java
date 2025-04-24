public class Person {
    private String name;
    private String surname;
    private int wiek;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Person(String name, String surname, int wiek) {
        this.name = name;
        this.surname = surname;
        this.wiek = wiek;
    }
}
