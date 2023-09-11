package edu.ejercicios.pkgPizza.pkgEspecialidades;

import edu.ejercicios.pkgPizza.pkgBase.Pizza;
import edu.ejercicios.pkgPizza.pkgBase.Topping;

public class PizzaChapina extends Pizza {
    private String hongos;
    public PizzaChapina(String name, String hongos, Topping... toppings){
        super(name, toppings);
        this.hongos= hongos;
    }

    public String getHongos() {
        return hongos;
    }

    public void setHongos(String hongos) {
        this.hongos = hongos;
    }
}
