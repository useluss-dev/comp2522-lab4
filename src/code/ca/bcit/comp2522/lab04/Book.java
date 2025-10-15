package ca.bcit.comp2522.lab04;

/**
 * The Book class represents a book with a title, year of publication, and author.
 * It implements the Comparable, Printable, and Reversible interfaces, allowing the book to be compared, displayed,
 * and reversed.
 * The class includes validation for the title length and publication year.
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
public class Book implements Comparable<Book>, Printable, Reversible
{
    private final String title;
    private final int    yearPublished;
    private final Author author;

    // Constants for title length and year validation
    private static final int MAX_TITLE_LENGTH   = 100;
    private static final int MIN_YEAR_PUBLISHED = 1;

    /**
     * Constructs a Book instance.
     *
     * @param title         the title of the book
     * @param yearPublished the year the book was published
     * @param author        the author of the book
     * @throws IllegalArgumentException if the title is null, blank, or exceeds the maximum length;
     *                                  if the year is outside the valid range; or if the author is null
     */
    public Book(final String title,
                final int yearPublished,
                final Author author)
    {
        validateBook(title, yearPublished, author);
        this.title         = title;
        this.yearPublished = yearPublished;
        this.author        = author;
    }

    /**
     * Validates the book's attributes (title, year, and author).
     *
     * @param title         the title of the book
     * @param yearPublished the year the book was published
     * @param author        the author of the book
     * @throws IllegalArgumentException if the title is null, blank, or exceeds the maximum length;
     *                                  if the year is outside the valid range; or if the author is null
     */
    private void validateBook(final String title,
                              final int yearPublished,
                              final Author author)
    {
        if (title == null || title.trim().isEmpty())
        {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        if (title.length() > MAX_TITLE_LENGTH)
        {
            throw new IllegalArgumentException("Title length must be less than " + MAX_TITLE_LENGTH);
        }
        if (yearPublished < MIN_YEAR_PUBLISHED || yearPublished > Date.getCurrentYear())
        {
            throw new IllegalArgumentException("Year must be between " + MIN_YEAR_PUBLISHED + " and the current year.");
        }
        if (author == null)
        {
            throw new IllegalArgumentException("Author cannot be null");
        }
    }

    /**
     * Returns the title of the book.
     *
     * @return the title of the book
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the year the book was published.
     *
     * @return the year the book was published
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * Returns the author of the book.
     *
     * @return the author of the book
     */
    public Author getAuthor()
    {
        return author;
    }

    /**
     * Compares this book with another book based on the year of publication.
     *
     * @param other the book to compare with
     * @return a negative integer, zero, or a positive integer as this book's year is less than, equal to, or greater
     * than the other book's year
     */
    @Override
    public int compareTo(final Book other)
    {
        return Integer.compare(other.yearPublished, this.yearPublished);
    }

    /**
     * Displays information about the book, including its title, year of publication, and author.
     */
    @Override
    public void display()
    {
        System.out.println("Book: " + title + ", Published: " + yearPublished + ", Author: " + author.getName()
                                                                                                     .getFullName());
    }

    /**
     * Reverses and displays the title of the book.
     */
    @Override
    public void backward()
    {
        System.out.println(new StringBuilder(title).reverse().toString());
    }

    /**
     * Checks if two Book objects are equal.
     *
     * @param obj the object to compare with
     * @return true if both books are equal, false otherwise
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
        final Book book = (Book) obj;
        return yearPublished == book.yearPublished &&
               title.equals(book.title) &&
               author.equals(book.author);
    }

    /**
     * Returns the hash code of the book based on the title.
     *
     * @return the hash code of the book
     */
    @Override
    public int hashCode()
    {
        return title.hashCode();
    }
}
