package structural.decorator;

public class CheeseDecorator extends PizzaDecorator{
    Pizza decoratedPizza;

    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", cheese";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.5;
    }
}

