package com.company;

public class Main {
    public static int addOdds(int n){
        int counter = 1;
        int sum = 0;
        while (counter<=n){
            sum += counter;
            counter += 2;

        }
        return sum;
    }
    public static int sumDigits(int n){
        int sum = 0;

        while (n>=1){
            int val= n%10;
            sum += val;
            n /= 10;
        }
        return sum;
    }
    public static int howManyYears(double startpop, double endpop){
        int yrCount=0;
        while (startpop <= endpop){

            startpop *=1.0113;
            yrCount++;
        }
        return yrCount;
    }
    public static void printSum(int n){
        int counter=0;
        int sum=0;

        while (n>=counter){
            sum+=counter;
            counter++;
            System.out.print(counter);
            if (n>=counter){
                System.out.print("+");
            }
        }
        System.out.println("="+sum);
    }

    public static boolean isPerfectSquare(int n){
        int count=1;
        int sum=0;
        while(addOdds(count)<=n){
            count+=2;
            sum++;
        }
        return sum*sum==n;

    }

    public static void main(String[] args) {
        System.out.println(addOdds(10));
        System.out.println(addOdds(17));
        System.out.println(addOdds(23));

        System.out.println();

        System.out.println(sumDigits(234));
        System.out.println(sumDigits(567));
        System.out.println(sumDigits(892));

        System.out.println();

        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2,150));

        System.out.println();

        printSum(6);
        printSum(8);
        printSum(10);

        System.out.println();

        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(24));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(24));
        System.out.println(isPerfectSquare(67));


    }
}
