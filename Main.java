package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=2,b=-3,c=-8;
        double delta=b*b-4*a*c;
        if(delta>0) {
            double x1 = -b + Math.sqrt(delta) / 2 * a;
            double x2 = -b - Math.sqrt(delta) / 2 * a;
            System.out.println(x1);
            System.out.println(x2);
        }
        else if(delta<0) {
            System.out.println("nie istnieje");
        }
        else if(delta==0){
            double x0=-b/2*a;
            System.out.println(x0);
        }



    }
}
