/**
 * Example DoublePair: a class that holds a pair of double values.
 *
 * @author Jim Teresco, The College of Saint Rose, CSC 523, Summer 2014
 * Updated for CSIS 210, Siena College, Fall 2016
 * @version Fall 2019
 */

public class DoublePair {

    // we'll need, of course, two double values as instance variables
    private double first, second;

    /**
     * Construct a new DoublePair.
     * 
     * @param first the first item in the pair
     * @param second the second item in the pair
     */
    public DoublePair(double first, double second) {

        this.first = first;
        this.second = second;
    }

    /**
     * Get the first item in the pair
     *
     * @return the first item in the pair
     */
    public double getFirst() {

        return first;
    }

    /**
     * Get the second item in the pair
     *
     * @return the second item in the pair
     */
    public double getSecond() {

        return second;
    }

    /**
     * Modify the first item in the pair
     *
     * @param newFirst the new first item in the pair
     */
    public void setFirst(double newFirst) {

        first = newFirst;
    }

    /**
     * Modify the second item in the pair
     *
     * @param newSecond the new first item in the pair
     */
    public void setSecond(double newSecond) {

        second = newSecond;
    }

    /**
     * Modify both items in the pair
     *
     * @param newFirst the new first item in the pair
     * @param newSecond the new first item in the pair
     */
    public void setValues(double newFirst, double newSecond) {

        first = newFirst;
        second = newSecond;
    }

    /**
     * Return a String to make this look like a coordinate pair (seems as
     * good as anything and likely to be useful in many contexts).
     *
     * @return the numbers in the pair, in parentheses separated by a comma
     */
    @Override
    public String toString() {

        return "(" + first + ", " + second + ")";
    }

    /**
     * Check for equality of this DoublePair with another, defined by both
     * items in the pair being equal to those in the other pair.
     *
     * @param o the other DoublePair
     * @return whether this DoublePair is equal to o
     */
    @Override
    public boolean equals(Object o) {

        DoublePair other = (DoublePair)o;
        return (other.first == first) && (other.second == second);
    }

    /**
     * main method to run some test cases.
     *
     * @param args not used.
     */
    public static void main(String args[]) {

        // we'll create a few DoublePair objects and print them out
        DoublePair a = new DoublePair(4.3, 9.1);
        DoublePair b = new DoublePair(0, 0);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        // try out the accessors
        System.out.println("a.getFirst(): " + a.getFirst());
        System.out.println("a.getSecond(): " + a.getSecond());
        System.out.println("b.getFirst(): " + b.getFirst());
        System.out.println("b.getSecond(): " + b.getSecond());
        
        // are they equal?
        System.out.println("a.equals(b): " + a.equals(b));
        
        // mutators!
        a.setFirst(17.0);
        a.setSecond(-23.5);
        b.setValues(17.0, -23.5);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        // are they equal now?  Hope so!
        System.out.println("a.equals(b): " + a.equals(b));
        
        // uncomment the following to see what happens if we send
        // the wrong type of object to the equals method
        //System.out.println("a.equals(\"hi there\"): " + a.equals("high there"));
        
    }
}
