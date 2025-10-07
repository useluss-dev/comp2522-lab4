package ca.bcit.comp2522.lab04;

public class Person implements Printable, Reversible
{
    private Date dateOfBirth;
    private Date dateOfDeath;
    private Name name;

    public Person(Date dateOfBirth,
                  Date dateOfDeath,
                  Name name)
    {
        validatePerson(dateOfBirth, name);

        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.name        = name;
    }

    private static void validatePerson(Date dateOfBirth,
                                       Name name)
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
}
