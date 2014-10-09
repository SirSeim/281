import java.util.ArrayList;

public class StringBag implements SimpleCollection {

    private ArrayList <String> bag;

    // Empty constuct
    public StringBag () {
        this.bag = new ArrayList<String>();
    }

    // Single String construct
    public StringBag (String start) {
        this.bag = new ArrayList<String>();
        this.bag.add(start);
    }

    // String Array construct
    public StringBag (String[] start) {
        this.bag = new ArrayList<String>();
        for (int i = 0; i < start.length; i++) {
            this.bag.add(start[i]);
        }
    }

    /** Ensures that this collection contains the specified element (optional operation). */
    public boolean add ( Object o ){
        if (!(o instanceof String)) return false;
        return this.bag.add( (String) o );
    }
    
    /** Removes all of the elements from this collection (optional operation). */
    public void clear(){
        this.bag.clear();
    }
    
    /** Returns true if this collection contains the specified element. */
    public boolean contains ( Object o ){
        return this.bag.contains( o );
    }
    
    /** Returns true if this collection contains no elements. */
    public boolean isEmpty(){
        return this.bag.isEmpty();
    }
    
    /** Removes a single instance of the specified element from this collection, if it is present. */
    public boolean remove ( Object o ){
        if (!(o instanceof String)) return false;
        return this.bag.remove( (String) o );
    }
    
    /** Returns the number of elements in this collection. */
    public int size(){
        return this.bag.size();
    }
    
    /** Returns an array containing all of the elements in this collection. */
    public Object[] toArray(){
        return this.bag.toArray();
    }

    public String toString(){
        return this.bag.toString();
    }
}