package files;

import java.util.ArrayList;

public abstract class customFile {
    ArrayList<customFile> child = null;
    String name;
    abstract void add(customFile f) throws Exception;
    abstract String ls();
}
