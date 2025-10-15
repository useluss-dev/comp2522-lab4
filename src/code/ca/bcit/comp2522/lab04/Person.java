package ca.bcit.comp2522.lab04;

/**
 * The Person class represents an individual with a name, date of birth, and an optional date of death.
 * It implements the Comparable, Printable, and Reversible interfaces, allowing comparison based on birthdate,
 * display of personal information, and reversal of the full name.
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
public class Person implements Comparable<Person>, Printable, Reversible
{
    private final Date dateOfBirth;
    private final Date dateOfDeath;
    private final Name name;

    /**
     * Constructs a Person instance with a date of birth, an optional date of death, and a name.
     *
     * @param dateOfBirth the date of birth of the person
     * @param dateOfDeath the date of death of the person (can be null for living people)
     * @param name        the name of the person
     */
    public Person(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name)
    {
        validatePerson(dateOfBirth, name);

        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.name        = name;
    }

    /**
     * Validates the person's attributes (date of birth and name).
     *
     * @param dateOfBirth the date of birth of the person
     * @param name        the name of the person
     * @throws IllegalArgumentException if the date of birth or name is invalid
     */
    private static void validatePerson(final Date dateOfBirth,
                                       final Name name)
    {
        if (dateOfBirth == null)
        {
            throw new IllegalArgumentException("Date of birth cannot be null");
        }

        if (name == null)
        {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }

    /**
     * Compares this person with another based on the date of birth.
     *
     * @param other the other person to compare with
     * @return a negative integer, zero, or a positive integer as this person's birthdate is before, the same as, or
     * after the other person's birthdate
     */
    @Override
    public int compareTo(final Person other)
    {
        return other.dateOfBirth.compareTo(this.dateOfBirth);
    }

    /**
     * Displays the person's name, date of birth, and date of death (if available).
     */
    @Override
    public void display()
    {
        System.out.print("Name: ");
        name.display();

        System.out.print(", Date of Birth: ");
        dateOfBirth.display();

        System.out.print(", Date of Death: ");
        if (dateOfDeath != null)
        {
            dateOfDeath.display();
        }
        else
        {
            System.out.println("Still alive.");
        }
    }

    /**
     * Reverses and displays the full name of the person.
     */
    @Override
    public void backward()
    {
        final StringBuilder builder = new StringBuilder();

        builder.append(name.getFirst());
        builder.append(' ');
        builder.append(name.getLast());
        builder.reverse();

        System.out.println(builder.toString());
    }

    /**
     * Returns the date of birth of the person.
     *
     * @return the date of birth
     */
    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    /**
     * Returns the date of death of the person.
     *
     * @return the date of death, or null if the person is still alive
     */
    public Date getDateOfDeath()
    {
        return dateOfDeath;
    }

    /**
     * Returns the name of the person.
     *
     * @return the name of the person
     */
    public Name getName()
    {
        return name;
    }
}
