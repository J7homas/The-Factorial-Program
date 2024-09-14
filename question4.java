package JavaPractice;

import java.util.Scanner;

class question4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a number: ");
        int input = scanner.nextInt();

        int result = 1;

        for(int i = 1; i <= input; ++i){
            result *= i;
        }
        System.out.println(" Factorial of " + input + " is " + result);

        scanner.close();
    }
}