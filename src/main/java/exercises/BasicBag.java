package exercises;

import edu.touro.mcon264.apps.collections.ArrayCollection;
import edu.touro.mcon264.apps.collections.BagInterface;

public class BasicBag<T> extends ArrayCollection<T> implements BagInterface<T> {
    @Override
    public T grab() {
        if (isEmpty()) {
            return null;
        }
        T element =  elements[(int) (Math.random() * numElements)];
        remove(element);
        return element;
    }

    @Override
    public int count(T target) {
       int count = 0;
         for (int i = 0; i < numElements; i++) {
            if (elements[i].equals(target)) {
                count++;
            }
         }
            return count;
    }

    @Override
    public int removeAll(T target) {
        int removed = 0;
        while (remove(target)) {
            removed++;
        }
        return removed;
    }

    @Override
    public void clear() {
        for (int i = 0; i < numElements; i++) {
            elements[i] = null;
        }
        numElements = 0;
    }


    // TODO: implement the methods in the BagInterface using an array as the underlying data structure
    // consider extending ArrayCollection<T>
    // put in the JavaDoc comments as specified in the BagInterface.
    // Which SOLID principles is being applied here?


}
