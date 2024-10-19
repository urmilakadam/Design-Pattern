package creational.singleton;

public class SingleTon {

    public static void main(String[] args) {
        Database instance1 = Database.getInstance();
        Database instance2 = Database.getInstance();

        if(instance1 == instance2)
            System.out.println("Objects are same");
        else
            System.out.println("Created 2 objects");
    }

}
