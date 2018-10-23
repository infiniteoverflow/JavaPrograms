package com.programs;

public class Variables_literals_constants
{
    public static void main(String[] args)
    {
        /* The value stored in the variables are called Literals*/

        int FirstNumber = 11;
        int SecondNumber = 20;

        float average = (float)(FirstNumber+SecondNumber)/2; /* We are explicitly converting the result
                                                                into float so that it can be stored in variable average.*/
        System.out.println("Average is:"+average);

        String FirstName = "Aswin";
        String SecondName = "Gopinathan";

        System.out.println("My full name is:"+FirstName+" "+SecondName);

        boolean a = true;
        System.out.println("Value of Boolean variable a is "+a);

        a = false;
        System.out.println("Value of Boolean variable a is now "+a);


        /* Constant variables are declared by using the keyword final.
        It defines a variable with a constant value which cannot be changed later.
         */
        final int num = 10;

    }
}
