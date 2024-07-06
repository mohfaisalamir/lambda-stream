package com.enigma;

import com.enigma.lambda_tream.Calculator2;

//LAMBDA ==> jika di JS namanya anonymous functuion (arrow)
public class Main {
    public static void main(String[] args) {
        System.out.println("diancok");
        // ANYMOUS OBJECT
        Calculator2 calc = new Calculator2() {
            @Override
            public int multiple(int a, int b) {
                return a * b;
            }
        };

        //LAMBDA, singkatan dari ANYMOUS OBJECT
        Calculator2 calc2 = (a, b) -> (int) Math.pow(a,b);
        int multiple = calc.multiple(6, 12);
        int multiple1 = calc2.multiple(6, 12);

        // LAMBDA 2
        Calculator2 calc3 = (a, b) -> (a*11/b);
        int multiple2 = calc3.multiple(6, 12);
        System.out.println(multiple+"  "+multiple1+"  "+multiple2);
        SayHello sh = ()->"Hallo";
        String action = sh.action();
        System.out.println("\n"+action);

 /*       CalculatorService calculatorService = new CalculatorService() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }

            @Override
            public int sub(int a, int b) {
                return (int)Math.pow(a,b);
            }
        };
        int sub = calculatorService.sub(3, 3);
        int sum = calculatorService.sum(3, 3);
        System.out.println(sub + " " +sum);*/
        // sedikit penjelasan asbabul nuzul LAMBDA
        // kita bisa membuat object tanpa nama, Interface tidak bisa di instance, kita bisa memakai interface tanpa implementasi Methodnya
        //
        // berikut adalah kisah awal mulanya tercipta LAMBDA..

        //1. contoh penggunaan anonymous Object
        /*CalculatorService calculatorService = new CalculatorService() {
            @Override
            public int sum(int a, int b) {
                return a*b;
            }

        };CalculatorService calculatorService2 = new CalculatorService() {
            @Override
            public int sum(int a, int b) {
                return (a*b)+b;
            }
        };

        //2. contoh penggunaan LAMBDA
        //a. LAMBDA dnegan statement ==> yang memiliki kurung kurawal"{}"
        CalculatorService calculatorService3 = (m,n) -> {
            return (m+n)*21000;
        };
        //b. LAMBDA EXPRESSION ==> lambda akan melakukan return jika logic satu line
        CalculatorService calculatorService1 = (lambda, expression) ->(lambda+expression)/lambda;

        System.out.println("ANONYMOUS FUNCTION : ");
        System.out.println(calculatorService.sum(111, 99));
        System.out.println(calculatorService2.sum(111, 99));
        System.out.println("LAMBDA : ");
        System.out.println(calculatorService3.sum(3, 7));
        System.out.println(calculatorService3.sum(41, 11));
        System.out.println(calculatorService2.sum(10,12));
        System.out.println("LAMBDA EXPRESSION : ");
        System.out.println(calculatorService1.sum(10,120));
        System.out.println(calculatorService1.sum(10,110));*/

        // berikut adalah syarat syarat membuat LAMBDA
        // 1. Membuat Inteface
        // 2. Memiliki 1 methode abstract
        // 3. Menmbahkan anotasi (@FunctionalInterface, opsional)
        // 4. Minimal menggunakan Java 8
        //
        // salah satu kegunaan LAMBDA adalah bisa membuat validasi sesuai keinginan kita
        //
        // bahkan, kita bisa membuat method dimana parameternya adalah lambda
        // java sendi juga memiliki LAMBDA sendiri (default) ..

/*        SayHello sh = (string)->{
            System.out.println("Hello "+string);;
        };
        sh.action("Hello diancokolatos");*/

    }
}