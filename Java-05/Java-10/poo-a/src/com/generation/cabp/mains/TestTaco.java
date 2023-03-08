package com.generation.cabp.mains;

import com.generation.cabp.clases.Taco;

public class TestTaco {
    public static void main(String[] args) {
        Taco taco1 = new Taco("carne asada", 3, true, 2.50);
        Taco taco2 = new Taco("pollo", 2, false, 1.75);
        Taco taco3 = new Taco("chorizo", 3, true, 2.00);

        System.out.println(taco1.toString());
        System.out.println(taco2.toString());

        taco1.setTipo("al pastor");
        taco2.setPrecio(2.00);
        taco3.setCantidad(2);

        System.out.println(taco1.toString());
        System.out.println(taco2.toString());
        System.out.println(taco3.toString());
    }
}