package behavioral.iterator;

import java.io.File;

public class FileExplorer {

    public static void main(String[] args) {
        File rootDirectory = new File("/users/urmilakadam/desktop/books");
        FileIterator iterator = new DirectoryIterator(rootDirectory);

        System.out.println("Files in directory:");
        while (iterator.hasNext()) {
            File file = iterator.getNext();
            System.out.println(file.getPath());
        }
    }
}
