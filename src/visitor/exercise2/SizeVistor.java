package visitor.exercise2;

import java.util.Iterator;

public class SizeVistor extends Visitor {
    private String currentdir = "";
    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        int directorySize = 0;
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
            directorySize += entry.getSize();
        }
        currentdir = savedir;
        System.out.println("===>" + currentdir + "/" + directory.getName() + "(" + directorySize + ")");
    }
}
