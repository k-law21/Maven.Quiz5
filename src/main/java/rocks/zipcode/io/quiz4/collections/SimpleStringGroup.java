package rocks.zipcode.io.quiz4.collections;
import java.util.*;
/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup {
    private ArrayList<String> strings = new ArrayList<>();

    public SimpleStringGroup() {
//        throw new UnsupportedOperationException("Method not yet implemented");
        this.strings = new ArrayList<String>();
    }

    public Integer count() {
        return this.strings.size();
    }

    public void insert(String string) {
        this.strings.add(string);
    }

    public Boolean has(String string) {
        return this.strings.contains(string);
    }

    public String fetch(int indexOfValue) {
        return this.strings.get(indexOfValue);
    }

    public void delete(String string) {
        this.strings.remove(string);
    }

    public void clear() {
        this.strings.clear();
    }
}
