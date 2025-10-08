package ca.bcit.comp2522.lab04;

public class Author extends Person implements Printable
{
    private final String genre;

    public Author(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name,
                  final String genre)
    {
        super(dateOfBirth, dateOfDeath, name);
        validateGenre(genre);
        this.genre = genre;
    }

    private void validateGenre(final String genre)
    {
        if (genre == null ||
            genre.trim().isEmpty())
        {
            throw new IllegalArgumentException("Genre cannot be null or blank");
        }
        if (genre.length() > 30)
        {
            throw new IllegalArgumentException("Genre must be less than 30 characters");
        }
    }

    @Override
    public void display()
    {
        System.out.print("Author: " + getName().getFullName() + ", born on " + getDateOfBirth());
        if (getDateOfDeath() != null)
        {
            System.out.print(", died on " + getDateOfDeath());
        }
        System.out.println(", Genre: " + genre);
    }

    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null ||
            getClass() != obj.getClass())
        {
            return false;
        }
        if (!super.equals(obj))
        {
            return false;
        }
        Author author;
        author = (Author) obj;
        return genre.equals(author.genre);
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }
}
