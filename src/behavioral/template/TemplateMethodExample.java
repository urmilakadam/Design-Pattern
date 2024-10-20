package behavioral.template;

public class TemplateMethodExample {

    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        csvParser.parseData();

        DataParser xmlParser = new XMLParser();
        xmlParser.parseData();
    }
}
