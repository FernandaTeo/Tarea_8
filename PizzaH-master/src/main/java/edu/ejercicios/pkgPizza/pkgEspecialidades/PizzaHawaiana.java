package edu.ejercicios.pkgPizza.pkgEspecialidades;

import edu.ejercicios.pkgPizza.pkgBase.Pizza;
import edu.ejercicios.pkgPizza.pkgBase.Topping;

public class PizzaHawaiana extends Pizza {
    private String piña;
    public PizzaHawaiana(String name, String piña, Topping... toppings){
        super(name, toppings);
        this.piña= piña;
    }

    public String getPiña() {
        return piña;
    }

    public void setPiña(String piña) {
        this.piña = piña;
    }
}
