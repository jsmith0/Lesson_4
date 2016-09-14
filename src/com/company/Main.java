package com.company;

public class Main {

    public static void main(String[] args) {

        int i =3;
        //i am assinging int i to the value of 3
        //3 = i does not work
        //3 is finite and therefore cannot be assigned a value
        double p = 234.3;
        double j;

        //can i say j = p;
        j = p;
        //no, data flow is important
        System.out.println(p);

        /*
        PEMDAS reminder
        its like an order of operations

        P
        E
        MD
        AS

        P = parenthesis ()
        E = exponent ^
        M = multiply *
        D = divide /
        A = addition +
        S = subtraction -
        */

        //modulus %
        //caculates the remainder
        //ex. 7%3 = 1

        int count = 0;
        count = count + 3;
        //variables are allowed to change, they don't have to be constants

        //increment operator
        count++;
        //this means...
        count = count + 1;
        //equal
        count--;
        //decrease by 1
        ++count;
        //for now its the same, there is a difference but we will get there later

        count+=3;
        //this means...
        count = count +3;

        count-+3;
        //this means...
        count = count - 3;

        count/=4;
        //this means...
        count = count/4;

        count*=3;
        //this means...
        count = count*3;


        int drAux = 3;
        int paul = 2 + drAux++;
        //SOP(paul)
        //it would output 6

        int x = 5;
        int y = 2;
        System.out.println(x/y);
        //when working with integers the computer will truncate (cut away the decimal)
        // doesn't round... it just cuts off

    }
}
