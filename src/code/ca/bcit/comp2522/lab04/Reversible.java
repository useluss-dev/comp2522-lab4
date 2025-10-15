package ca.bcit.comp2522.lab04;

/**
 * The Reversible interface defines a contract for classes that can reverse their content.
 * Any class implementing this interface must provide an implementation for the backward method,
 * which reverses and displays the class's content in some manner.
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
public interface Reversible
{
    /**
     * Reverses the content of the implementing class and displays it.
     * This method should be overridden in implementing classes to provide
     * a meaningful way to reverse the class's data and show the result.
     */
    void backward();
}