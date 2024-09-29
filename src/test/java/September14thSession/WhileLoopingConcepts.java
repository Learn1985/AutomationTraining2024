package September14thSession;

public class WhileLoopingConcepts {

    public static
    void main() {
        //Loop: Repeating the same thing again and again till you get bored

        //Loop: Repeating the same thing again and again till the condition is satisfied

        //Different types of loops in Java:
        //1. For loop
        //2. While loop
        //3. Do while loop
        //4. For each loop / Enhanced for loop

        //While Loop:
        //Loop keeps on running until the condition is satisfied

        //Syntax of while loop:
        //while(condition){
        //    //Statements to be executed
        //}

        int a = 50;

        //Runs for infinite amount of times if we do not use the break keyword
        while (a == 50) {
            System.out.println(a);
            break; //Terminates from the loop immediately
        }

        a = 400 - 30 * 20 % 2 / 2;

        //400-30*20%2/2
        //400-30*20%2
        //400-30*0
        //400-0
        //400


        //It does not enter inside in the loop if the condition is not satisfied
        while (a % 4 == 2) {
            System.out.println(STR."\{a} whose remainder is 2");
        }

        a = 40;

        while (a < 50) {
            System.out.println(STR."\{a}");
            a += 1;
        }

        System.out.println("*********************************************************************************************************");

        //a=53
        while (a < 100) //Runs in an infinite loop
        {
            if (a % 2 == 0) //53
            {
                System.out.println(STR."\{a} is an even number");
            } else {
                a += 4;
//            System.out.println(STR."\{a} is an odd number");
                continue; //Skips the current iteration and moves to the next iteration
            }

            a += 3; //53
        }

        //Exit Code -- 0 --> Successful execution of the program
        //Exit Code -- 1 --> Unsuccessful execution of the program
        //Exit Code -- 130 --> Program is terminated by the user


    }

}
