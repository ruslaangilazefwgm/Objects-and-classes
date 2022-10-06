import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public  Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return this.name + " " + this.surname;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

        public int hashCode() {
            return Objects.hash(name, surname);
        }
    }




