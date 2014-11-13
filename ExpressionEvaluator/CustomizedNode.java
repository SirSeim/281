public class CustomizedNode {
    CustomizedNode next;
    String value;

    public CustomizedNode () {
        this.next = null;
        this.value = null;
    }

    public CustomizedNode (String value) {
        this.next = null;
        this.value = value;
    }

    public CustomizedNode (CustomizedNode next) {
        this.next = next;
        this.value = null;
    }

    public CustomizedNode (CustomizedNode next, String value) {
        this.next = next;
        this.value = value;
    }

    public void setNext (CustomizedNode next) {
        this.next = next;
    }

    public void setValue (String value) {
        this.value = value;
    }

    public String getValue () {
        return this.value;
    }

    public CustomizedNode getNext () {
        return this.next;
    }

    public boolean hasNext () {
        return this.next != null;
    }

    public boolean equals (CustomizedNode other) {
        return this.value.equals(other.value);
    }

    public boolean equals (String other) {
        return this.value.equals(other);
    }

    public String toString () {
        return this.value;
    }

    public static String toString (CustomizedNode node) {
        return node.toString();
    }
}