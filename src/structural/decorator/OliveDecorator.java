package structural.decorator;

public class OliveDecorator extends PizzaDecorator{
    Pizza decoratedPizza;

    public OliveDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", olive";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 0.5;
    }
}