import java.util.Objects;
public class Author {
    private String firstName;
    private String LastName;

    public Author(String FirstName, String lastName) {
        this.firstName = firstName;
        this.LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    @Override
    public String toString() {
        return firstName + "" + LastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return Objects.equals(firstName, author.firstName) && Objects.equals(LastName, author.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, LastName);
    }
    }
