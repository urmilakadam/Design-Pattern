package creational.factory.java8;

import creational.factory.Database;
import creational.factory.MongoDBDatabase;
import creational.factory.MySQLDatabase;
import creational.factory.PostgreSQLDatabase;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DatabaseFactory {

    private static final Map<String, Supplier<Database>> DATABASE_MAP = new HashMap<>();

    static {
        DATABASE_MAP.put("mysql", MySQLDatabase::new);
        DATABASE_MAP.put("postgresql", PostgreSQLDatabase::new);
        DATABASE_MAP.put("mongodb", MongoDBDatabase::new);
    }

    // Factory method to get the appropriate database
    public static Database getDatabase(String dbType) {
        Supplier<Database> databaseSupplier = DATABASE_MAP.get(dbType);
        if (databaseSupplier != null) {
            return databaseSupplier.get();
        }
        throw new IllegalArgumentException("Invalid database type: " + dbType);
    }

}
