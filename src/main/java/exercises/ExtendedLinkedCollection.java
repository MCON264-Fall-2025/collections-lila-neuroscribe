package exercises;

import edu.touro.mcon264.apps.collections.LinkedCollection;
import edu.touro.mcon264.support.LLNode;
public class ExtendedLinkedCollection<T> extends LinkedCollection<T> {
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtendedLinkedCollection: [");
        LLNode current = head;
        while (current != null) {
            sb.append(current.getInfo());
            if (current.getLink() != null) {
                sb.append(", ");
            }
            current = current.getLink();
        }
        sb.append("]");
        return sb.toString();
    }


    public int count(T target) {
        LLNode<T> current = this.head;
        int count = 0;
        while (current != null) {
            if (current.getInfo().equals(target)) {
                count++;
            }
            current = current.getLink();
        }
        return count;
    }

    public void removeAll(T target) {
        LLNode<T> current = this.head;
        LLNode<T> previous = null;

        while (current != null) {
            if (current.getInfo().equals(target)) {
                if (previous == null) {
                    // Removing head
                    head = current.getLink();
                } else {
                    previous.setLink(current.getLink());
                }
                numElements--;
            } else {
                previous = current;
            }
            current = current.getLink();
        }
    }
}
