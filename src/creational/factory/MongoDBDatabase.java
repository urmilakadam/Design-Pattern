package creational.factory;

public class MongoDBDatabase implements Database{

    @Override
    public void connect() {
        System.out.println("Connected to MangoDB");
    }
}
