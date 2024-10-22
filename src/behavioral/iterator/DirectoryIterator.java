package behavioral.iterator;

import java.io.File;
import java.util.Stack;

public class DirectoryIterator implements FileIterator{

    private final Stack<File> stack = new Stack<>();

    public DirectoryIterator(File root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public File getNext() {
        File current = stack.pop();

        if (current.isDirectory()) {
            for (File file : current.listFiles()) {
                stack.push(file);
            }
        }
        return current;
    }
}
