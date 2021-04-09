package visitor.exercise3;

import java.util.ArrayList;
import java.util.List;

public class ElementArrayList implements Element{

    List<Entry> entryList = new ArrayList<>();

    public void add(Entry entry) {
        entryList.add(entry);
    }

    @Override
    public void accept(Visitor visitor) {
        for (Entry entry : entryList) {
            if (entry instanceof Directory) {
                visitor.visit((Directory) entry);
            } else if (entry instanceof File){
                visitor.visit((File) entry);
            }
        }
    }
}
