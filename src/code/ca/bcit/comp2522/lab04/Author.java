package ca.bcit.comp2522.lab04;

/**
 * The Author class represents an author of a literary work, extending the Person class and implementing the
 * Printable interface.
 * It contains information about the author's name, birth and death dates, and genre, with methods to validate the
 * genre and display author details.
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
public class Author extends Person implements Printable
{
    // Constant for maximum genre length
    private static final int MAX_GENRE_LENGTH = 30;

    private final String genre;

    /**
     * Constructs an Author instance.
     *
     * @param dateOfBirth the date of birth of the author
     * @param dateOfDeath the date of death of the author
     * @param name        the full name of the author
     * @param genre       the genre of the author
     */
    public Author(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name,
                  final String genre)
    {
        super(dateOfBirth, dateOfDeath, name);
        validateGenre(genre);
        this.genre = genre;
    }

    /**
     * Validates the genre string.
     *
     * @param genre the genre to validate
     * @throws IllegalArgumentException if the genre is invalid
     */
    private void validateGenre(final String genre)
    {
        if (genre == null || genre.trim().isEmpty())
        {
            throw new IllegalArgumentException("Genre cannot be null or blank");
        }
        if (genre.length() > MAX_GENRE_LENGTH)
        {
            throw new IllegalArgumentException("Genre must be less than " + MAX_GENRE_LENGTH + " characters");
        }
    }

    /**
     * Displays information about the author.
     */
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

    /**
     * Checks if two Author objects are equal.
     *
     * @param obj the object to compare with
     * @return true if both authors are equal, false otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        if (!super.equals(obj))
        {
            return false;
        }
        final Author author = (Author) obj;
        return genre.equals(author.genre);
    }

    /**
     * Returns the hash code of the author.
     *
     * @return the hash code of the author
     */
    @Override
    public int hashCode()
    {
        return super.hashCode();
    }
}
