package creational.factory;

public class PostgreSQLDatabaseFactory extends DatabaseFactory{

    @Override
    Database createDatabase() {
        return new PostgreSQLDatabase();
    }
}
