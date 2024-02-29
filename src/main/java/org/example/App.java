package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static String fizzBuzz(int number){
        if(number % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
