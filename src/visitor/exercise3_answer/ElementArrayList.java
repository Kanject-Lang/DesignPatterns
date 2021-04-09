package visitor.exercise3_answer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElementArrayList extends ArrayList implements Element {

    @Override
    public void accept(Visitor visitor) {
        Iterator it = iterator();
        while (it.hasNext()) {
            Element e = (Element) it.next();
            e.accept(visitor);
        }
    }
}
