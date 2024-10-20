package behavioral.template;

public abstract class DataParser {

    // Template method defining the algorithm's structure
    public final void parseData(){
        readData();
        processData();
        writeData();
    }

    private void readData() {
        System.out.println("Reading data from file...");
    }

    private void writeData() {
        System.out.println("Saving processed data to database.\n");
    }

    protected abstract void processData();
}
