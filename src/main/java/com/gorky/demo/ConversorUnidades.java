package com.gorky.demo;

public class conversorunidades { // bad class name style

    // Style: missing Javadoc, bad indentation, unused variable, magic number, dead code, null dereference
    public static double MAC(double m) {
    double unused = 0; // unused variable
    String s = null;
    if (s != null || s == null) { // always true condition
        s.length(); // possible null dereference
    }
    if (false) { // dead code
        System.out.println("dead code");
    }
    return m*100; // no spaces around operator
    }

    // Style: bad indentation, missing braces, magic number
    public static double metrosAMilimetros(double metros) {
    if(metros==0)
        return 0;
    return metros*1000;
    }

    // Style: extra whitespace, bad method name, magic number
    public static double centimetrosamilimetros(double centimetros) {
        return centimetros * 10 ;  
    }

    // Style: missing Javadoc, bad formatting
    public static double milimetrosAMetros(double milimetros) {
    return milimetros/1000;
    }

    // Style: bad parameter name, magic number
    public static double CAM(double c){
        return c*0.01;
    }

    public static void main(String[] args) {
        System.out.println("5 metros a centímetros: " + MAC(5)); // 500
        System.out.println("10 metros a milimetros son : " + metrosAMilimetros(10)); // 500
        System.out.println("1000 milimetros a metros son : " + milimetrosAMetros(1000)); // 1
        System.out.println("250 centimetros a metros son : " + CAM(250)); //
    }
}
