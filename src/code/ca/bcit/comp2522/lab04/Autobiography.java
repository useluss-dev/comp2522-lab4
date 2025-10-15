package ca.bcit.comp2522.lab04;

/**
 * The Autobiography class represents an autobiography, which is a type of biography written by the subject themselves.
 * It extends the Biography class and implements the Printable interface.
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
public class Autobiography extends Biography implements Printable {

    /**
     * Constructs an Autobiography instance.
     *
     * @param title the title of the autobiography
     * @param yearPublished the year the autobiography was published
     * @param author the author of the autobiography, who is also the subject
     */
    public Autobiography(final String title,
                         final int yearPublished,
                         final Author author) {
        super(title, yearPublished, author, author);
    }

    /**
     * Displays information about the autobiography.
     */
    @Override
    public void display() {
        System.out.println("Autobiography: " + getTitle() + ", Published: " + getYearPublished() +
                           ", Author: " + getAuthor().getName().getFullName() +
                           ", Subject: " + getSubject().getName().getFullName());
    }
}

