package files;

public class FileDecorator extends customFile{

    private customFile wrappedFile;

    @Override
    public void add(customFile f) throws Exception {
        wrappedFile.add(f);
    }

    @Override
    public String ls() {
        String rawOut = wrappedFile.ls();
        String[] s = rawOut.split("\n");
        StringBuilder b = new StringBuilder();
        for(String l:s)
            b.append("-" +l + "\n");
        return b.deleteCharAt(b.length() - 1).toString();
    }

    public FileDecorator(customFile f){
        wrappedFile = f;
    }
}
