package files;

public class dataFile extends customFile {

    public dataFile(String n) {
        name = n;
    }

    @Override
    public void add(customFile f) throws Exception {
        throw new Exception("foglia");
    }

    @Override
    public String ls() {
        return name;
    }
}
