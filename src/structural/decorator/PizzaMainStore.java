package structural.decorator;

public class PizzaMainStore {

    public static void main(String[] args) {

        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        //plain pizza with additional cheese
        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        //plain pizza with additional cheese and mushroom
        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        //plain pizza with additional cheese, mushroom and olive
        pizza = new OliveDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

    }
}
