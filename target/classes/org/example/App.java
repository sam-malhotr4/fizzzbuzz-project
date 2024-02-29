package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        for (int i = 1; i <= 100; i++) {
            System.out.print(fizzBuzz(i) + ", ");
        }
    }

    public static String fizzBuzz(int number){
        if(number % 3 == 0){
            if(number % 5 == 0){
                return "FizzBuzz";
            }
            return "Fizz";
        } else if(number % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
