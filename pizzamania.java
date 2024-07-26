import java.util.Scanner;
abstract class Pizza {
    protected String name;
    protected double basePrice;
    protected boolean extraCheese;
    protected boolean extraToppings;

    public Pizza(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.extraCheese = false;
        this.extraToppings = false;
    }

    public void addExtraCheese() {
        this.extraCheese = true;
    }

    public void addExtraToppings() {
        this.extraToppings = true;
    }

    public abstract double calculatePrice();

    public String getDescription() {
        return name + " Pizza";
    }
}
class VegPizza extends Pizza {
    public VegPizza() {
        super("Veg", 200);
    }

    @Override
    public double calculatePrice() {
        double totalPrice = basePrice;
        if (extraCheese) totalPrice += 50;
        if (extraToppings) totalPrice += 70;
        return totalPrice;
    }
}


class NonVegPizza extends Pizza {
    public NonVegPizza() {
        super("Non-Veg", 250);
    }

    @Override
    public double calculatePrice() {
        double totalPrice = basePrice;
        if (extraCheese) totalPrice += 50;
        if (extraToppings) totalPrice += 70;
        return totalPrice;
    }
}


class DeluxVegPizza extends Pizza {
    public DeluxVegPizza() {
        super("Delux Veg", 300);
        this.extraCheese = true;
        this.extraToppings = true;
    }

    @Override
    public double calculatePrice() {
        return basePrice;
    }

    @Override
    public String getDescription() {
        return name + " (with extra cheese & extra toppings)";
    }
}

class DeluxNonVegPizza extends Pizza {
    public DeluxNonVegPizza() {
        super("Delux Non-Veg", 350);
        this.extraCheese = true;
        this.extraToppings = true;
    }

    @Override
    public double calculatePrice() {
        return basePrice;
    }

    @Override
    public String getDescription() {
        return name + " (with extra cheese & extra toppings)";
    }
}

public class PizzaBillGeneratorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Pizzamania!");
        System.out.println("Please select the type of pizza:");
        System.out.println("1. Veg Pizza");
        System.out.println("2. Non-Veg Pizza");
        System.out.println("3. Delux Veg Pizza");
        System.out.println("4. Delux Non-Veg Pizza");

        int choice = scanner.nextInt();
        Pizza selectedPizza = null;

        switch (choice) {
            case 1:
                selectedPizza = new VegPizza();
                break;
            case 2:
                selectedPizza = new NonVegPizza();
                break;
            case 3:
                selectedPizza = new DeluxVegPizza();
                break;
            case 4:
                selectedPizza = new DeluxNonVegPizza();
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        if (!(selectedPizza instanceof DeluxVegPizza || selectedPizza instanceof DeluxNonVegPizza)) {
            System.out.println("Do you want extra cheese? (yes/no)");
            String cheeseChoice = scanner.next();
            if (cheeseChoice.equalsIgnoreCase("yes")) {
                selectedPizza.addExtraCheese();
            }

            System.out.println("Do you want extra toppings? (yes/no)");
            String toppingsChoice = scanner.next();
            if (toppingsChoice.equalsIgnoreCase("yes")) {
                selectedPizza.addExtraToppings();
            }
        }

        System.out.println("You have ordered: " + selectedPizza.getDescription());
        System.out.println("Total price: $" + selectedPizza.calculatePrice());
    }
}
