package structural.decorator;

public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double cost() {
        return 5.5;
    }
}
