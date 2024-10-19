package creational.factory;

public class MySqlDBDatabaseFactory extends DatabaseFactory{

    @Override
    Database createDatabase() {
        return new MySQLDatabase();
    }
}
