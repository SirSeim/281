import java.util.*;

public class BinaryTree<E> implements Collection<E> {
    private E root;
    private BinaryTree left;
    private BinaryTree right;
    private int size;

    public BinaryTree () {
        this.root = null;
        this.left = null;
        this.right = null;
        this.size = 0;
    }

    public BinaryTree (E o) {
        this.root = o;
        this.left = null;
        this.right = null;
        this.size = 1;
    }

    public BinaryTree (E o, BinaryTree left, BinaryTree right) {
        this.root = o;
        this.left = left;
        this.right = right;
        this.size = left.size() + right.size() + 1;
    }

    public boolean add (E o) {
        try {
            if (this.left != null) {
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
        return false;
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
        return false;
    }

    public boolean equals (Object o) {
        return false;
    }

    public boolean isEmpty () {
        return this.size == 0;
    }

    public Iterator iterator () {
        return null;
    }

    public boolean remove (Object o) {
        return false;
    }

    public boolean removeAll (Collection c) {
        return false;
    }

    public boolean retainAll (Collection c) {
        return false;
    }

    public int size () {
        return 0;
    }

    public Object[] toArray () {
        return null;
    }

    public <T> T[] toArray (T[] a) {
        return null;
    }

    public static BinaryTree createFromData (Object rootData, BinaryTree leftSubtree, BinaryTree rightSubtree) {
        return new BinaryTree(rootData, leftSubtree, rightSubtree);
    }
}