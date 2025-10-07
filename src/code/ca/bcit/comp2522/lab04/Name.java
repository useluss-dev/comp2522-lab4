package ca.bcit.comp2522.lab04;

public class Name implements Printable
{
    private static final int MAX_NAME_LENGTH = 50;

    private String first;
    private String last;

    public Name(String first,
                String last)
    {
        validateName(first);
        validateName(last);

        this.first = first;
        this.last  = last;
    }

    private static void validateName(String name)
    {
        if (name == null || name.isBlank())
        {
            throw new IllegalArgumentException();
        }

        if (name.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException("A name cannot be more than " + MAX_NAME_LENGTH + " characters");
        }
    }

    @Override
    public void display()
    {
        System.out.print(first + " " + last);
    }

    public String getFirst()
    {
        return first;
    }

    public String getLast()
    {
        return last;
    }
}
