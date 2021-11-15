package com.company;

public class Factorials {
    public static long calcFactorial(int n){
        int counter=1;
        long sum=1;
        while (n>=counter){
            sum*=counter;
            counter++;

        }
        return sum;
    }
    public static double calcE(){
        double e =1.0;
        double olde = 0.0;
        int fraction = 1;
        while (e-olde>0.001){
            olde=e;
            e+=1.0/calcFactorial(fraction);
            fraction ++;
        }
        return e;
    }
    public static double calcEX(int n){
        double e =1.0;
        double olde = 0.0;
        int fraction = 1;
        int power= 1;
        while (e-olde>0.001){
            olde=e;
            e+=Math.pow(n,power)/calcFactorial(fraction);
            fraction ++;
            power++;
        }
        return e;
    }


    public static void main(String[]args){
        for(int i = 1; i<=20; i++){
            System.out.println(calcFactorial(i));
        }
        System.out.println(calcE());
        for(int i=0; i<=5; i++){
            double e=calcEX(i);
            System.out.println("e is %2.3f \n",e);
        }



    }
}
