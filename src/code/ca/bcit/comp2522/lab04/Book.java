package ca.bcit.comp2522.lab04;


public class Book implements Comparable<Book>, Printable, Reversible
{
    private final String title;
    private final int    yearPublished;
    private final Author author;

    private final int MAX_TITLE_LENGTH = 100;
    private final int MIN_YEAR_PUBLISHED = 1;

    public Book(final String title,
                final int yearPublished,
                final Author author)
    {
        this.title         = title;
        this.yearPublished = yearPublished;
        this.author        = author;
    }

    private void validateBook(final String title,
                              final int yearPublished,
                              final Author author)
    {
        if (title == null ||
            title.trim().isEmpty())
        {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        if (title.length() > MAX_TITLE_LENGTH)
        {
            throw new IllegalArgumentException("Title length must be less than " + MAX_TITLE_LENGTH);
        }
        if (yearPublished < MIN_YEAR_PUBLISHED ||
            yearPublished > Date.getCurrentYear())
        {
            throw new IllegalArgumentException("Year must be between year " + MIN_YEAR_PUBLISHED + " and the current year.");
        }
        if (author == null)
        {
            throw new IllegalArgumentException("Author cannot be null");
        }
    }

    public String getTitle()
    {
        return title;
    }

    public int getYearPublished()
    {
        return yearPublished;
    }

    public Author getAuthor()
    {
        return author;
    }

    @Override
    public int compareTo(final Book other)
    {
        return Integer.compare(other.yearPublished, this.yearPublished);
    }

    @Override
    public void display()
    {
        System.out.println("Book: " + title + ", Published: " + yearPublished + ", Author: " + author.getName().getFullName());
    }

    @Override
    public void backward()
    {
        System.out.println(new StringBuilder(title).reverse().toString());
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
        Book book;
        book = (Book) obj;
        return yearPublished == book.yearPublished &&
               title.equals(book.title) &&
               author.equals(book.author);
    }

    @Override
    public int hashCode()
    {
        return title.hashCode();
    }
}