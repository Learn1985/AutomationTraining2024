package September14thSession;

import java.util.Scanner;

public class SwitchCaseConcepts {

    public void main(String args[]){
        //Switch is more of advanced version of if else statement

        //It is used in a situation where we have more than four conditions to validate

        //Syntax of Switch:
        //switch(expression){
        //    case value1:
        //        /
        //        /Statements to be executed
        //        break;

        //    case value2:
        //        //Statements to be executed
        //        break;

        //    case value3:
        //        //Statements to be executed
        //        break;

        //    case value4:
        //        //Statements to be executed
        //        break;

        //    default:
        //        //Statements to be executed
        //}

        //expression -- The value that is going to be validated in the switch statement
        //case -- The value that is going to be validated with the expression

        //For the self assignment operation to happen, we need to declare the variables first

        int a=30;

        switch(a) {

            case 10: {

                a = a + 10;
                System.out.println(STR."Value of a is \{a}");
                break;
            }

            case 20:{

                a=a+20;
                System.out.println(STR."Value of a is \{a}");
                break;
            }
            default:System.out.println("The value do not match either cases");
        }


        //default block is not mandatory in the switch expression --> Good to have it

        int b = 0;

        b *= a * 10;

        System.out.println(b);
        //from the JDK 12, we can use the switch statement as an expression as below
        switch(b){ //We need not use any break statement in the switch expression
            case 0 -> {b=b+10; System.out.println("Value of b is:" +b);} // -> is called as the lambda operator/fat operator
            case 10 -> {b=b+20; System.out.println("Value of b is:"+ b);}
            default -> System.out.println("No case matching");
        }

        //a=39
        //b=0 --> Throws Arithmetic Exception
        //    System.out.println(calculator(a,b,'/'));

        //Scanner class is used to get the input from the user

        //System.in --> Standard input device ---> Reads the data from the console
        Scanner s1=new Scanner(System.in);

        System.out.println("Enter the first number");

        a=s1.nextInt(); //nextInt() is used to get the integer value from the user

        System.out.println("Enter the second number");

        b=s1.nextInt();

        System.out.println("Enter the operator");

        char op=s1.next().charAt(0); //next() is used to get the string value from the user

        this.Calculate(10,b,op);
    }

    public int Calculate(int a, int b, char op)
    {
        return switch(op){

            //yield keyword is used to return the value
            case '+' -> {
                System.out.println("The sum is:" + (a + b));
                yield a+b;
            }
            case '-' -> {System.out.println("The difference is:" + (a - b)); yield a-b;}
            case '*' -> {System.out.println("The product is:" +(a * b)); yield a*b;}
            case '/' -> {System.out.println("The division is:"+ (a / b)); yield a/b;}
            default -> {System.out.println("Operator do not match"); yield -1;}
        };
    }
}

