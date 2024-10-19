package structural.decorator;

public class MushroomDecorator extends PizzaDecorator{
    Pizza decoratedPizza;

    public MushroomDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", mushroom";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.0;
    }
}
