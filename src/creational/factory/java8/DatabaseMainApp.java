package creational.factory.java8;

import creational.factory.Database;

public class DatabaseMainApp {

    public static void main(String[] args) {
        Database mysql = DatabaseFactory.getDatabase("mysql");
        mysql.connect();  // Output: Connected to MySQL.

        Database mongo = DatabaseFactory.getDatabase("mongodb");
        mongo.connect();  // Output: Connected to MongoDB.
    }
}
