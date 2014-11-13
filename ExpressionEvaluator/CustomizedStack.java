public class CustomizedStack {
    private CustomizedNode top;
    private int length;

    public CustomizedStack () {
        this.top = null;
        this.length = 0;
    }

    public CustomizedStack (String start) {
        this.top = new CustomizedNode(start);
        this.length = 1;
    }

    public CustomizedStack (String[] starters) {
        if (starters.length > 0) {
            this.top = new CustomizedNode(starters[0]);
            this.length = 1;
            for (int i = 1; i < starters.length; i++) {
                this.push(starters[i]);
            }
        }
    }

    public boolean empty () {
        return this.top == null;
    }

    public String peek () {
        return this.top.toString();
    }

    public String pop () {
        String result = this.top.toString();
        this.top = this.top.getNext();
        this.length--;
        return result;
    }

    public void push (String input) {
        this.top = new CustomizedNode(top, input);
        this.length++;
    }

    public int length () {
        return this.length;
    }

    public int search (String searchable) {
        CustomizedNode current = top;
        int result = 0;
        while(current.hasNext() && !current.equals(searchable)) {
            current = current.getNext();
            result++;
        }
        if (!current.equals(searchable)) {
            result = -1;
        }
        return result;
    }

    public boolean contains (String searchable) {
        return this.search(searchable) != -1;
    }
}