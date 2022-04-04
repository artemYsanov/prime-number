package com.company;

public class Main {

    public static void main(String[] args) {
        for(int i = 2; i <= 100; i ++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false; //isPrime проверка на является ли переданный ему параметр простым числом или нет.
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
