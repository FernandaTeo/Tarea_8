package edu.ejercicios.pkgPizza.pkgEspecialidades;

import edu.ejercicios.pkgPizza.pkgBase.Pizza;
import edu.ejercicios.pkgPizza.pkgBase.Topping;

public class PizzaMexicana extends Pizza {
    private String chile;
    public PizzaMexicana(String name, String chile, Topping... toppings){
        super(name, toppings);
        this.chile= chile;
    }

    public String getChile() {
        return chile;
    }

    public void setChile(String chile) {
        this.chile = chile;
    }
}
