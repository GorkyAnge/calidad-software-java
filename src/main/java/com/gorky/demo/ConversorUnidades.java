package com.gorky.demo;

public class ConversorUnidades {

    public static double MAC(double m) {
        return m * 100;
    }

    // Segundo ciclo
    public static double metrosAMilimetros(double metros) {
        return metros * 1000;
    }

    public static double centimetrosAMilimetros(double centimetros) {
        return centimetros * 10;
    }

    public static double milimetrosAMetros(double milimetros) {
        return milimetros / 1000;
    }

    //Quinto Ciclo

    public static double CAM(double cm){
        return cm*0.01;
    }

    public static void main(String[] args) {
        System.out.println("5 metros a centímetros: " + MAC(5)); // 500
        System.out.println("10 metros a milimetros son : " + metrosAMilimetros(10)); // 500
        System.out.println("1000 milimetros a metros son : " + milimetrosAMetros(1000)); // 1

        System.out.println("250 centimetros a metros son : " + CAM(250)); //
    }

}
