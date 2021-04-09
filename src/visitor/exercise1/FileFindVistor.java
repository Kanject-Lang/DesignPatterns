package visitor.exercise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVistor extends Visitor {
    private String suffix;
    private String currentdir = "";
    private List<File> fileList = new ArrayList<>();

    public FileFindVistor(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(suffix)) {
            fileList.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }

    public Iterator getFoundFiles() {
        return fileList.iterator();
    }
}
