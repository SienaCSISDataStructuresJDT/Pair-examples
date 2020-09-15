/**
 * Example ObjectPair: a general purpose class that contains two
 * items of any Object type.
 *
 * @author Jim Teresco, The College of Saint Rose, CSC 523, Summer 2014
 * Siena College, CSIS 210, Fall 2016, Fall 2017
 * @version Fall 2019
 *
 */

public class ObjectPair {
    
    // our instance variables will be Objects, capable of holding
    // anything other than an unboxed primitive type
    private Object first, second;

    /**
     * Construct a new ObjectPair
     * 
     * @param first the first item in the pair
     * @param second the second item in the pair
     */
    public ObjectPair(Object first, Object second) {

        this.first = first;
        this.second = second;
    }

    /**
     * Get the first item in the pair
     *
     * @return the first item in the pair
     */
    public Object getFirst() {

        return first;
    }

    /**
     * Get the second item in the pair
     *
     * @return the second item in the pair
     */
    public Object getSecond() {

        return second;
    }

    /**
     * Modify the first item in the pair
     *
     * @param newFirst the new first item in the pair
     */
    public void setFirst(Object newFirst) {

        first = newFirst;
    }

    /**
     * Modify the second item in the pair
     *
     * @param newSecond the new first item in the pair
     */
    public void setSecond(Object newSecond) {

        second = newSecond;
    }

    /**
     * Modify both items in the pair
     *
     * @param newFirst the new first item in the pair
     * @param newSecond the new first item in the pair
     */
    public void setValues(Object newFirst, Object newSecond) {

        first = newFirst;
        second = newSecond;
    }

    /**
     * Return a String to make this look like a coordinate pair (seems as
     * good as anything and likely to be useful in many contexts).
     * Note that we are implcitly using the toString methods of the
     * objects we encapsulate.
     *
     * @return the objects in the pair, in parentheses separated by a comma
     */
    @Override
    public String toString() {

        return "(" + first + ", " + second + ")";
    }

    /**
     * Check for equality of this ObjectPair with another, defined by both
     * items in the pair being equal to those in the other pair.
     *
     * @param o the other ObjectPair
     * @return whether this ObjectPair is equal to o
     */
    @Override
    public boolean equals(Object o) {

        ObjectPair other = (ObjectPair)o;
        return other.first.equals(first) && other.second.equals(second);
    }

    /**
     * main method to run some test cases.
     *
     * @param args not used.
     */
    public static void main(String args[]) {

        // we'll create a few ObjectPair objects and print them out
        ObjectPair a = new ObjectPair("Bob", 9.1);
        ObjectPair b = new ObjectPair("Alice", 0);
        
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
