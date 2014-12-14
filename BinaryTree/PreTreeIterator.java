import java.util.*;

public class PreTreeIterator implements Iterator {
    private BinaryTree tree;
    private Stack<BinaryTree> stack;
    private BinaryTree current;

    public PreTreeIterator (BinaryTree tree) {
        this.tree = tree;
        this.stack = new Stack<BinaryTree>();
        this.current = null;
    }

    public boolean hasNext () {
        if (this.current == null) {
            return this.tree != null;
        } else if (this.current.hasLeft()) {
            return true;
        } else if (!this.stack.empty()) {
            return true;
        }
        return false;
    }

    public Object next () {
        try {
            if (current == null) {
                this.current = this.tree;
            } else if (this.current.hasLeft()) {
                this.current = this.current.left();
            } else if (!this.stack.empty()){
                this.current = this.stack.pop();
            } else {
                return null;
            }
            if (this.current.hasRight()) {
                this.stack.push(this.current.right());
            }
            return this.current.root();
        } catch (Exception e) {
            return null;
        }
    }

    public void remove () {
        throw new UnsupportedOperationException();
    }
}