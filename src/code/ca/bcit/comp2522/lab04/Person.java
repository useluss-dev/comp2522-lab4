package ca.bcit.comp2522.lab04;

public class Person implements Comparable<Person>, Printable, Reversible
{
    private final Date dateOfBirth;
    private final Date dateOfDeath;
    private final Name name;

    public Person(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name)
    {
        validatePerson(dateOfBirth, name);

        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.name        = name;
    }

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

    @Override
    public int compareTo(final Person other)
    {
        return other.dateOfBirth.compareTo(this.dateOfBirth);
    }

    @Override
    public void display()
    {
        System.out.print("Name: ");
        name.display();

        System.out.print("Date of brith: ");
        dateOfBirth.display();

        System.out.print("Date of death: ");
        if (dateOfDeath != null)
        {
            dateOfDeath.display();
        }
        else
        {
            System.out.println("still alive.");
        }
    }

    @Override
    public void backward()
    {
        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append(name.getFirst());
        builder.append(' ');
        builder.append(name.getLast());
        builder.reverse();

        System.out.println(builder.toString());
    }


    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public Date getDateOfDeath()
    {
        return dateOfDeath;
    }

    public Name getName()
    {
        return name;
    }
}
