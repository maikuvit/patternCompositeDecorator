import files.FileDecorator;
import files.Folder;
import files.dataFile;

public class mainFile {
    public static void main(String[] args) throws Exception {

        Folder root = new Folder("root");

        Folder f1 = new Folder("f1");
        dataFile file1 = new dataFile("file1.txt");
        dataFile file2 = new dataFile("file2.txt");
        f1.add(file1);
        root.add(file2);
        root.add(f1);
        System.out.println(root.ls());

    }
}
