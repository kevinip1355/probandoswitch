package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);

        //DECLARANDO VARIABLES

        double temperaturaAmbiente;

        System.out.println("Digite la temperatura");
        temperaturaAmbiente=teclado.nextDouble();

        if(temperaturaAmbiente==20.0){
            temperaturaAmbiente=25.0;
            System.out.println("apreciado usuario le toco calentarse solo a "+temperaturaAmbiente);

    }else if (temperaturaAmbiente == 30.0) {
            temperaturaAmbiente = 20.0;
            System.out.println("apreciado usuario su temperatura cambioio a "+temperaturaAmbiente);

        } else if (temperaturaAmbiente ==40.0) {
            temperaturaAmbiente= 20.0;
            System.out.println("Apreciado usuario su temperatura cambio a"+temperaturaAmbiente);
        }else{
         System.out.println("señor usuario ingrese temperatura que desea:");
         temperaturaAmbiente=teclado.nextDouble();
        }

        System.out.println("apreciado usuario su temperatura cambio a"+temperaturaAmbiente);



    }
}
