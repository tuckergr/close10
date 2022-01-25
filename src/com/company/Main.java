package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));


    }

    static int close10(int a, int b) {
        int absA = Math.abs(10 - a);
        int absB = Math.abs(10 - b);

        if (absA < absB) {

            return a;

        }else if(absA> absB)
            
            return b;

        else

            return 0;




    }
}






