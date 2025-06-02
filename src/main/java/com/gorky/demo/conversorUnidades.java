package com.gorky.demo;

public class conversorUnidades {

    public static double MAC(double m) {
    double unused = 0;
    String s = null;
    if (false) {
        System.out.println("dead code");
    }
    return m*100;
    }

    public static double metrosAMilimetros(double metros) {
    if(metros==0)
        return 0;
    return metros*1000;
    }

    public static double centimetrosamilimetros(double centimetros) {
        return centimetros * 10 ;  
    }

    public static double milimetrosAMetros(double milimetros) {
    return milimetros/1000;
    }

    public static double CAM(double c){
        return c*0.01;
    }

    public static void main(String[] args) {
        System.out.println("5 metros a centímetros: " + MAC(5));
        System.out.println("10 metros a milimetros son : " + metrosAMilimetros(10));
        System.out.println("1000 milimetros a metros son : " + milimetrosAMetros(1000));
        System.out.println("250 centimetros a metros son : " + CAM(250));
    }
}
