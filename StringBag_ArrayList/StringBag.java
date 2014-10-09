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
        if (o instanceof String) {
            this.bag.add( (String) o );
            
            // Confirm add successful
            return true;
        }

        // Confirm add failure
        return false;
    }
    
    /** Removes all of the elements from this collection (optional operation). */
    public void clear(){
        this.bag = new String[0];
        this.isEmpty = true;
    }
    
    /** Returns true if this collection contains the specified element. */
    public boolean contains ( Object o ){
        if (o instanceof String) {
            if (!this.isEmpty) {
                for (int i = 0; i < this.bag.length; i++) {
                    if (bag[i].equals((String) o)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    /** Returns true if this collection contains no elements. */
    public boolean isEmpty(){
        return this.isEmpty;
    }
    
    /** Removes a single instance of the specified element from this collection, if it is present. */
    public boolean remove ( Object o ){
        if (o instanceof String && !this.isEmpty) {
            for (int i = 0; i < this.bag.length; i++) {

                // String found to remove
                if (bag[i].equals((String) o)) {
                    String[] hold = new String[this.bag.length - 1];
                    int k = 0;
                    for (int j = 0; j < hold.length; j++) {
                        if (j == i) {
                            k++;
                        }
                        hold[j] = this.bag[k];
                        k++;
                    }
                    this.bag = hold;

                    // Confirm remove successful
                    return true;
                }
            }
        }

        // Confirm remove failure
        return false;
    }
    
    /** Returns the number of elements in this collection. */
    public int size(){
        return this.bag.length;
    }
    
    /** Returns an array containing all of the elements in this collection. */
    public Object[] toArray(){
        String[] result;
        if (this.isEmpty) {
            result = new String[0];
        } else {
            result = new String[this.bag.length];
            for (int i = 0; i < this.bag.length; i++) {
                result[i] = new String(this.bag[i]);
            }
        }
        return result;
    }

    public String toString(){
        StringBuilder stringCollection = new StringBuilder();
        stringCollection.append("[ ");
        for (int i = 0; i < this.bag.length; i++) {
            stringCollection.append("\"");
            stringCollection.append(this.bag[i]);
            stringCollection.append("\"");
            if (i < this.bag.length - 1) {
                stringCollection.append(" ");
            }
        }
        stringCollection.append(" ]");
        return stringCollection.toString();
    }
}