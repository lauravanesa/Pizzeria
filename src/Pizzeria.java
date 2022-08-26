import javax.swing.*;

import java.util.Arrays;

import static javax.swing.JOptionPane.*;

public class Pizzeria {
    public class Pizza {
        public static void main(String[] args) {

            String cantidad;
            String valorPizza;
            String valorIngredientes = null;
            String ingredientes;
            String ingredientesExtras;
            int posicionGuardar = 0;
            int posicionConsultar = 0;
            int valorTotal;
            String[][] Pizza = new String[5][4];

            boolean continuar = true;
            while (continuar) ;
            String menu = showInputDialog("1. cantida  \n" + "2.valor pizza \n" + "3.valor ingredientes \n"
                    + "4.ingredientes");


            switch (menu) {
                case "1":

                    cantidad = showInputDialog("por favor ingrese cuantas pizzas quiere comprar (maximo 5)");
                    valorPizza = showInputDialog("el valor base es de $5000 ");
                    ingredientes = showInputDialog("ingrese el numero de ingredientes maximo (4)");
                    valorIngredientes = showInputDialog("ingrese el costo de un ingrediente");
                    ingredientesExtras = showInputDialog("jamon $500" + "peperoni $900" + "pollo $700" + "tomate $300" +
                            "atun $1200" + "albaca $400" + "champiñones $800 ");
                    posicionGuardar = Integer.parseInt(showInputDialog("ingrese la poscion a guardar "));


                    if (posicionGuardar < 0 || posicionGuardar > 4) {

                    } else {
                        if (Pizza[posicionGuardar][0] != null) {

                        }
                    }
                    Pizza[posicionGuardar][0] = cantidad;
                    Pizza[posicionGuardar][1] = valorPizza;
                    Pizza[posicionGuardar][2] = ingredientes;
                    Pizza[posicionGuardar][3] = valorIngredientes;
                    Pizza[posicionGuardar][4] = ingredientesExtras;

                    showMessageDialog(null, "se guardo la pizza correctamente en la " + "posicion " + posicionGuardar);

                    break;
                case "2":
                    valorPizza = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("el valor por pizza es de 5 mil")));

                    if (Pizza[posicionConsultar][1] == null) {
                        showMessageDialog(null, "valor de la pizza es de 5 mil ");


                    } else {
                        JOptionPane.showMessageDialog(null, "cantidad:" + Pizza[posicionConsultar][0]
                                + "\nvalorPizza: " + Pizza[posicionConsultar][1] + "\ningredientes:" + Pizza[posicionConsultar][2]
                                + "\nvalorIngredientes: " + Pizza[posicionConsultar][3] + "\ningrediestesExtras: " + Pizza[posicionConsultar][4]);

                    }
                    break;
                case "3":
                    valorIngredientes = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de ingredientes (maximo 4)")));

                    if (Pizza[posicionConsultar][2] == null) {

                    } else {
                        JOptionPane.showMessageDialog(null, "cantidad:" + Pizza[posicionConsultar][0]
                                + "\nvalorPizza: " + Pizza[posicionConsultar][1] + "\ningredientes: " + Pizza[posicionConsultar][2]
                                + "\nvalorIngredientes: " + Pizza[posicionConsultar][3] + "\ningredientesExtras:"
                                + Pizza[posicionConsultar][4]);


                    }


            }
        }
    }




}
