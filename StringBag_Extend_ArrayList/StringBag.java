@SuppressWarnings("unchecked")

public class StringBag extends java.util.ArrayList implements SimpleCollection {

    // Empty constuct
    public StringBag () {
        super();
    }

    // Single String construct
    public StringBag (String start) {
        super();
        super.add(start);
    }

    // String Array construct
    public StringBag (String[] start) {
        super();
        for (int i = 0; i < start.length; i++) {
            super.add(start[i]);
        }
    }

    /** Ensures that this collection contains the specified element (optional operation). */
    public boolean add ( Object o ){
        if (!(o instanceof String)) return false;
        return super.add( (String) o );
    }
    
    /** Removes all of the elements from this collection (optional operation). */
    public void clear(){
        super.clear();
    }
    
    /** Returns true if this collection contains the specified element. */
    public boolean contains ( Object o ){
        return super.contains( o );
    }
    
    /** Returns true if this collection contains no elements. */
    public boolean isEmpty(){
        return super.isEmpty();
    }
    
    /** Removes a single instance of the specified element from this collection, if it is present. */
    public boolean remove ( Object o ){
        if (!(o instanceof String)) return false;
        return super.remove( (String) o );
    }
}