package ca.bcit.comp2522.lab04;

/**
 * The Name class represents a person's name, consisting of a first and last name.
 * It implements the Printable interface to display the full name.
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
public class Name implements Printable
{

    // Constant for the maximum allowed length of a name
    private static final int MAX_NAME_LENGTH = 50;

    private final String first;
    private final String last;

    /**
     * Constructs a Name instance with a first and last name.
     *
     * @param first the first name of the person
     * @param last  the last name of the person
     * @throws IllegalArgumentException if either name is null, blank, or exceeds the maximum length
     */
    public Name(final String first,
                final String last)
    {
        validateName(first);
        validateName(last);

        this.first = first;
        this.last  = last;
    }

    /**
     * Validates a name to ensure it is not null, not blank, and does not exceed the maximum length.
     *
     * @param name the name to validate
     * @throws IllegalArgumentException if the name is null, blank, or exceeds the maximum length
     */
    private static void validateName(final String name)
    {
        if (name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }

        if (name.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException("A name cannot be more than " + MAX_NAME_LENGTH + " characters");
        }
    }

    /**
     * Displays the full name (first and last).
     */
    @Override
    public void display()
    {
        System.out.print(first + " " + last);
    }

    /**
     * Returns the first name.
     *
     * @return the first name
     */
    public String getFirst()
    {
        return first;
    }

    /**
     * Returns the last name.
     *
     * @return the last name
     */
    public String getLast()
    {
        return last;
    }

    /**
     * Returns the full name, combining the first and last names.
     *
     * @return the full name
     */
    public String getFullName()
    {
        return first + " " + last;
    }
}
