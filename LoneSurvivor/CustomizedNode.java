public class CustomizedNode {
    CustomizedNode next;
    int value;

    public CustomizedNode () {
        this.next = null;
    }

    public CustomizedNode (int value) {
        this.next = null;
        this.value = value;
    }

    public CustomizedNode (CustomizedNode next) {
        this.next = next;
    }

    public CustomizedNode (CustomizedNode next, int value) {
        this.next = next;
        this.value = value;
    }

    public void setNext (CustomizedNode next) {
        this.next = next;
    }

    public void setValue (int value) {
        this.value = value;
    }

    public int getValue () {
        return this.value;
    }

    public CustomizedNode getNext () {
        return this.next;
    }

    public boolean hasNext () {
        return this.next != null;
    }

    public boolean equals (CustomizedNode other) {
        return this.value == other.value;
    }

    public boolean equals (int other) {
        return this.value == other;
    }

    public String toString () {
        return Integer.toString(this.value);
    }

    public static String toString (CustomizedNode node) {
        return node.toString();
    }
}