package ca.bcit.comp2522.lab04;

/**
 * The Printable interface defines a contract for classes that can display their content.
 * Any class implementing this interface must provide an implementation for the display method
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
public interface Printable
{
    /**
     * Displays the content of the implementing class.
     * This method should be overridden in implementing classes to provide
     * a meaningful representation of the class's data when called.
     */
    void display();
}