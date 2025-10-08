package ca.bcit.comp2522.lab04;


public class Biography extends Book implements Printable
{
    private final Person subject;

    public Biography(final String title,
                     final int yearPublished,
                     final Author author,
                     final Person subject)
    {
        super(title, yearPublished, author);
        validateBiography(subject);
        this.subject = subject;
    }

    private void validateBiography(final Person subject)
    {
        if (subject == null)
        {
            throw new IllegalArgumentException("Subject cannot be null");
        }
    }

    public Person getSubject()
    {
        return subject;
    }

    @Override
    public void display()
    {
        System.out.println("Biography: " + getTitle() + ", Published: " + getYearPublished() +
                           ", Author: " + getAuthor().getName().getFullName() +
                           ", Subject: " + subject.getName().getFullName());
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
        Biography biography;
        biography = (Biography) obj;
        return subject.equals(biography.subject);
    }

    @Override
    public int hashCode()
    {
        return subject.hashCode();
    }
}