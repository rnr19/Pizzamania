*PizzaMania*

**Introduction**

PizzaMania is a simple Java console application designed to help users select and customize their pizza order. With PizzaMania, users can choose from various types of pizzas, add extra cheese and toppings, and view the final price of their order.

---

**Features**

- **Pizza Selection**: Users can choose between Veg, Non-Veg, Delux Veg, and Delux Non-Veg pizzas.
- **Customization**: Options to add extra cheese and extra toppings for Veg and Non-Veg pizzas.
- **Price Calculation**: The total price is calculated based on the selected options.

---

**Usage**

1. **Pizza Selection**: After running the program, you will be prompted to select the type of pizza:
   - 1. Veg Pizza
   - 2. Non-Veg Pizza
   - 3. Delux Veg Pizza
   - 4. Delux Non-Veg Pizza

2. **Customization**: If you select Veg or Non-Veg pizza, you will be asked whether you want to add extra cheese and/or extra toppings.

3. **View Order**: The program will display your pizza selection along with the total price.

---

**Example**

```
Welcome to Pizzamania!
Please select the type of pizza:
1. Veg Pizza
2. Non-Veg Pizza
3. Delux Veg Pizza
4. Delux Non-Veg Pizza
> 1

Do you want extra cheese? (yes/no)
> yes

Do you want extra toppings? (yes/no)
> no

You have ordered: Veg Pizza
Total price: $250.0
```

---

**Code Structure**

- **Pizza**: An abstract class that serves as the base for different types of pizzas. It includes methods for adding extra cheese and toppings, and for calculating the price.
- **VegPizza & NonVegPizza**: Concrete classes that extend `Pizza` and provide specific pricing.
- **DeluxVegPizza & DeluxNonVegPizza**: Concrete classes that represent deluxe versions with pre-added extra cheese and toppings.
- **PizzaBillGeneratorApp**: The main class that handles user input, creates the appropriate pizza object, and displays the order summary.

---

