package creational.factory;

public class MongoDBDatabaseFactory extends DatabaseFactory{

    @Override
    Database createDatabase() {
        return new MongoDBDatabase();
    }
}
