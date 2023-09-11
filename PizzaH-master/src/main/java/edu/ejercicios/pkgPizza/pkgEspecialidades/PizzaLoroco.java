package edu.ejercicios.pkgPizza.pkgEspecialidades;

import edu.ejercicios.pkgPizza.pkgBase.Pizza;
import edu.ejercicios.pkgPizza.pkgBase.Topping;

public class PizzaLoroco extends Pizza {
    private String albahaca;
    public PizzaLoroco(String name, String albahaca, Topping... toppings){
        super(name, toppings);
        this.albahaca= albahaca;
    }

    public String getAlbahaca() {
        return albahaca;
    }

    public void setAlbahaca(String albahaca) {
        this.albahaca = albahaca;
    }
}
