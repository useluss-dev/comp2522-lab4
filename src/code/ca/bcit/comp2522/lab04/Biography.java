package ca.bcit.comp2522.lab04;


/**
 * The Biography class represents a biography, a literary work that tells the life story of a person.
 * It extends the Book class and implements the Printable interface.
 * The class includes a method to validate the subject, display biography details, and check equality between biographies.
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
public class Biography extends Book implements Printable {

    private final Person subject;

    /**
     * Constructs a Biography instance.
     *
     * @param title the title of the biography
     * @param yearPublished the year the biography was published
     * @param author the author of the biography
     * @param subject the person whose life is the subject of the biography
     */
    public Biography(final String title,
                     final int yearPublished,
                     final Author author,
                     final Person subject) {
        super(title, yearPublished, author);
        validateBiography(subject);
        this.subject = subject;
    }

    /**
     * Validates the subject of the biography.
     *
     * @param subject the person whose biography is being written
     * @throws IllegalArgumentException if the subject is invalid
     */
    private void validateBiography(final Person subject) {
        if (subject == null) {
            throw new IllegalArgumentException("Subject cannot be null");
        }
    }

    /**
     * Returns the subject of the biography.
     *
     * @return the person whose life is the subject of the biography
     */
    public Person getSubject() {
        return subject;
    }

    /**
     * Displays information about the biography.
     */
    @Override
    public void display() {
        System.out.println("Biography: " + getTitle() + ", Published: " + getYearPublished() +
                           ", Author: " + getAuthor().getName().getFullName() +
                           ", Subject: " + subject.getName().getFullName());
    }

    /**
     * Checks if two Biography objects are equal.
     *
     * @param obj the object to compare with
     * @return true if both biographies are equal, false otherwise
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Biography biography = (Biography) obj;
        return subject.equals(biography.subject);
    }

    /**
     * Returns the hash code of the biography.
     *
     * @return the hash code of the biography
     */
    @Override
    public int hashCode() {
        return subject.hashCode();
    }
}