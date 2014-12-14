import java.util.*;

public class BinaryTree implements Collection {
    private Object root;
    private BinaryTree left;
    private BinaryTree right;
    private int size;

    public BinaryTree () {
        this.root = null;
        this.left = null;
        this.right = null;
        this.size = 0;
    }

    public BinaryTree (Object o) {
        this.root = o;
        this.left = null;
        this.right = null;
        if (this.root != null) {
            this.size = 1;
        } else {
            this.size = 0;
        }
    }

    public BinaryTree (Object o, BinaryTree left, BinaryTree right) {
        this.root = o;
        this.left = left;
        this.right = right;

        if (this.root != null) {
            this.size = 1;
        } else {
            this.size = 0;
        }

        if (this.left != null) {
            this.size += this.left.size();
        }

        if (this.right != null) {
            this.size += this.right.size();
        }
    }

    public boolean add (Object o) {
        if (o == null) {
            return false;
        }
        try {
            if (this.root == null) {
                this.root = o;
                this.size++;
                return true;
            } else if (this.left != null) {
                if (this.left.add(o)) {
                    this.size++;
                    return true;
                }
            } else {
                this.left = new BinaryTree(o);
                this.size++;
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean addAll (Collection c) {
        throw new UnsupportedOperationException();
    }

    public void clear () {
        this.root = null;
        this.left = null;
        this.right = null;
        this.size = 0;
    }

    public boolean contains (Object o) {
        if (this.root.equals(o)) {
            return true;
        }

        boolean leftExist = this.left != null;
        boolean rightExist = this.right != null;

        if (leftExist && rightExist) {
            return this.left.contains(o) || this.right.contains(o);
        } else if (leftExist) {
            return this.left.contains(o);
        } else if (rightExist) {
            return this.right.contains(o);
        }

        return false;
    }

    public boolean containsAll (Collection c) {
        throw new UnsupportedOperationException();
    }

    public boolean equals (Object o) {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty () {
        return this.size == 0;
    }

    public Iterator iterator () {
        return new PreTreeIterator(this);
    }

    public boolean remove (Object o) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll (Collection c) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll (Collection c) {
        throw new UnsupportedOperationException();
    }

    public int size () {
        return this.size;
    }

    public Object[] toArray () {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray (Object[] a) {
        throw new UnsupportedOperationException();
    }

    public Object root () {
        return this.root;
    }

    public boolean hasLeft () {
        return this.left != null;
    }

    public boolean hasRight () {
        return this.right != null;
    }

    public BinaryTree left () {
        return this.left;
    }

    public BinaryTree right () {
        return this.right;
    }

    public static BinaryTree createFromData (Object rootData, BinaryTree leftSubtree, BinaryTree rightSubtree) {
        return new BinaryTree(rootData, leftSubtree, rightSubtree);
    }
}