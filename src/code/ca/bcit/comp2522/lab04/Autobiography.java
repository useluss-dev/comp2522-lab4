package ca.bcit.comp2522.lab04;

public class Autobiography extends Biography implements Printable
{
    public Autobiography(final String title,
                         final int yearPublished,
                         final Author author)
    {
        super(title, yearPublished, author, author);
    }

    @Override
    public void display()
    {
        System.out.println("Autobiography: " + getTitle() + ", Published: " + getYearPublished() +
                           ", Author: " + getAuthor().getName().getFullName() +
                           ", Subject: " + getSubject().getName().getFullName());
    }
}
