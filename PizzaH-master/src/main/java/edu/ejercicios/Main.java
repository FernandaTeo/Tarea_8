package edu.ejercicios;

import edu.ejercicios.pkgPizza.Interfaces.PizzaBase;
import edu.ejercicios.pkgPizza.pkgBase.Pizza;
import edu.ejercicios.pkgPizza.pkgBase.Topping;
import edu.ejercicios.pkgPizza.pkgEspecialidades.*;

public class Main {
    public static void main(String[] args) {
        /*Pizza pizza = new Pizza("Pepperoni", 12.5);
        pizza.addTopping(new Topping("Tomato"));
        pizza.addTopping(new Topping("Mozerella"));
        pizza.addTopping(new Topping("Basil"));
        pizza.prepare();*/

        /*pizza.removeTopping(1);
        pizza.prepare();

        pizza.addTopping(new Topping("Mozarella"));
        pizza.prepare();*/

        /*PizzaItaliana pizzaItaliana = new PizzaItaliana("Italiana", 15.5, "Ranch");
        pizzaItaliana.addTopping(new Topping("Tomato"));
        pizzaItaliana.addTopping(new Topping("Mozarella"));
        pizzaItaliana.addTopping(new Topping("Basil"));
        pizzaItaliana.prepare();
        System.out.println("Salsa: " + pizzaItaliana.getSalsa());*/

        //Pizza pizza = new Pizza("Pepperoni");
        //pizza.addTopping(new Topping("Tomato", 1.5));
      //  pizza.addTopping(new Topping("Mozarella", 2.5));
        //pizza.addTopping(new Topping("Basil", 1.0));
      //  System.out.println("El precio de la pizza: " + pizza.getName() + " es: " + pizza.getPizzaPrice());

        PizzaHawaiana pizzaHawaiana = new PizzaHawaiana("Hawaiana", "piña");
        pizzaHawaiana.addTopping(new Topping("queso", 1.50));
        pizzaHawaiana.pizzasize();
        pizzaHawaiana.prepare();
        pizzaHawaiana.getPizzaPrice();


        PizzaLoroco pizzaLoroco = new PizzaLoroco("Loroco", "albahaca");
        pizzaLoroco.addTopping(new Topping("albahaca", 4.40));
        pizzaLoroco.pizzasize();
        pizzaLoroco.prepare();
        pizzaLoroco.getPizzaPrice();



        PizzaMexicana pizzaMexicana = new PizzaMexicana("Mexicana", "chile");
        pizzaMexicana.addTopping(new Topping("salsa", 3.50));
        pizzaMexicana.pizzasize();
        pizzaMexicana.prepare();
        pizzaMexicana.getPizzaPrice();



        PizzaChapina pizzaChapina = new PizzaChapina("Chapina", "hongos");
        pizzaChapina.addTopping(new Topping("tomate", 4.30));
        pizzaChapina.pizzasize();
        pizzaChapina.prepare();
        pizzaChapina.getPizzaPrice();

        System.out.println("El precio de la pizza: " + pizzaHawaiana.getName() + " es: " + pizzaHawaiana.getPizzaPrice());
        System.out.println("El precio de la pizza: " + pizzaLoroco.getName() + " es: " + pizzaLoroco.getPizzaPrice());
        System.out.println("El precio de la pizza: " + pizzaMexicana.getName() + " es: " + pizzaMexicana.getPizzaPrice());
        System.out.println("El precio de la pizza: " + pizzaChapina.getName() + " es: " + pizzaChapina.getPizzaPrice());



    }
}