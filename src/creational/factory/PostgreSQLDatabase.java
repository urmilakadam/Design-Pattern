package creational.factory;

public class PostgreSQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL");
    }
}
