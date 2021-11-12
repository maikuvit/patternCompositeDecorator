package files;

import java.util.ArrayList;

public class Folder extends customFile{

    ArrayList<customFile> child = new ArrayList<>();

    public Folder(String n) {
        name = n;
    }

    @Override
    public void add(customFile f) throws Exception {
        child.add(new FileDecorator(f));
    }

    @Override
    public String ls() {
        StringBuilder b = new StringBuilder();
        b.append(name + "\n");
        for (customFile f : child)
            b.append(f.ls() + "\n");
        return b.deleteCharAt(b.length() - 1).toString();
    }
}
