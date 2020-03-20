public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.nextIndex;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.nextIndex = item;
        return this.nextIndex;
    }

    @Override
    ListItem previous() {
        return this.previousIndex;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.previousIndex = item;
        return this.previousIndex;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
