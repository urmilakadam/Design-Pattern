package creational.factory;

public class MainDatabaseApp {

    public static void main(String[] args) {
        DatabaseFactory factory = getFactory("mysql");
        Database db = factory.createDatabase();
        db.connect();
    }

    public static DatabaseFactory getFactory(String dbType) {
        return switch (dbType) {
            case "mysql" -> new MySqlDBDatabaseFactory();
            case "postgresql" -> new PostgreSQLDatabaseFactory();
            case "mongodb" -> new MongoDBDatabaseFactory();
            default -> throw new IllegalArgumentException("Invalid database type: " + dbType);
        };
    }
}
