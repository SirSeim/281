public class CircularList {
    private CustomizedNode current;
    private CustomizedNode previous;
    private int size;

    public CircularList () {
        this.current = null;
        this.previous = null;
        this.size = 0;
    }

    public CircularList (int value) {
        this.current = new CustomizedNode(value);
        this.current.setNext(this.current);
        this.previous = this.current;
        this.size = 1;
    }

    public CircularList (int[] starters) {
        if (starters.length > 0) {
            this.current = new CustomizedNode(starters[0]);
            this.previous = this.current;
            this.size = 1;
            for (int i = 1; i < starters.length; i++) {
                this.add(starters[i]);
            }
        }
    }

    public boolean isEmpty () {
        return this.size == 0;
    }

    public void add (int value) {
        if (this.current == null || this.previous == null) {
            this.current = new CustomizedNode(value);
            this.current.setNext(this.current);
            this.previous = this.current;
        } else {
            this.previous = this.current;
            CustomizedNode newCurrent = new CustomizedNode(value);
            newCurrent.setNext(this.current.getNext());
            this.previous.setNext(newCurrent);
            this.current = newCurrent;
            this.size++;
        }
    }

    public void remove () {
        this.previous.setNext(this.current.getNext());
        this.current = this.current.getNext();
        this.size--;
    }

    public void goNext () {
        this.previous = this.current;
        this.current = this.current.getNext();
    }

    public int getCurrent () {
        return this.current.getValue();
    }

    public int size () {
        return this.size;
    }
}