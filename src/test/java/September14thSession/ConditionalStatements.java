package September14thSession;

//import static java.lang.StringTemplate.STR;

public class ConditionalStatements {

    public static void main() {
        //Simple if and else statement

        //Syntax of if statement:
        //if(condition){
        //    //Statements to be executed
        //}

        int a = 10;

        // == equal to
        // == Means we are checking whether the value present on the right hand side is same as the value present on the left hand side
        //If the above condition is satisfied then it will return true else it will return false

        if (a == 10) //If the condition is satisifed only, it will go inside the if method
        {
            System.out.println("The value of a is 10");
        }

        a = 20;

        if (a == 10) //If the condition is satisifed only, it will go inside the if method
        {
            System.out.println("The value of a is 10");
        }

        //When we divide a integer by an integer the answer will never be in decimal values
        a = 50 - 20 / 40 * 2;

        //50 -0*2
        //50
        //% means remainder of a number
        if (a % 2 == 0)
//        System.out.println(a+" is divisible by 2");
            System.out.println(STR."\{a} is divisible by 2");


        //Syntax of if else statement:
        //if(condition){
        //    //Statements to be executed
        //}else{
        //    //Statements to be executed
        //}

        int b = 30 - 20 * 10 / 5;

        //30-20*2
        //30-40
        //-10

        //!= means not equal to
        //!= Means we are checking whether the value present on the right hand side is not same as the value present on the left hand side
        if (b % 3 != 0) {
            System.out.println(STR."\{b} is not divisible by 3");
        } else {
            System.out.println(STR."\{b} is divisible by 3");
        }

        String c = "Jagan";

        //Syntax of if else if statement:

        //else if should be present between if and else
        //if(condition){
        //    //Statements to be executed
        //}else if(condition){
        //    //Statements to be executed
        //}else{
        //    //Statements to be executed
        //}
        if (c.length() == 2) {
            System.out.println(STR."The length of \{c} is 2");
        } else if (c.length() == 5) {
            System.out.println(STR."The length of \{c} is 5");
        } else if (c.equals("Jagan")) {
            System.out.println(STR."The value of c is Jagan");
        } else {
            System.out.println("The value of c is not Jagan");
        }

        //Nested if else statement

        //Syntax of nested if else statement:
        //if(condition){
        //    //Statements to be executed
        //}else{
        //    //Statements to be executed
        //    if(condition){
        //        //Statements to be executed
        //    }else{
        //        //Statements to be executed
        //    }
        //}

        int d = 20;

        if (d == 10) {
            System.out.println("The value of d is 10");
        } else {
            System.out.println("The value of d is not 10");
            if (d % 2 == 0) {
                System.out.println("The value of d is even");
            } else {
                System.out.println("The value of d is odd");
            }
        }

        //Nested if else if statement

        //Syntax of nested if else if statement:

        //if(condition){
        //    //Statements to be executed
        //}else if(condition){
        //    //Statements to be executed
        //    if(condition){
        //        //Statements to be executed
        //    }else{
        //        //Statements to be executed
        //    }

        int e = 30;

        if (e == 10) {
            System.out.println("The value of e is 10");
        } else if (e == 20) {
            System.out.println("The value of e is 20");
            if (e % 2 == 0) {
                System.out.println("The value of e is even");
            } else {
                System.out.println("The value of e is odd");
            }
        } else {
            System.out.println("The value of e is not 10 or 20");
        }


    }

}