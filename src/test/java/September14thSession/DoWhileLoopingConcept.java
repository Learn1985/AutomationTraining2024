package September14thSession;

public class DoWhileLoopingConcept {

    public void main(String args[]) {

        //Do-While Loop:
        //Loop runs atleast once irrespective of the condition is satisfied or not

        //Syntax of do-while loop:
        //do{
        //    //Statements to be executed
        //}while(condition);

        int a = 10;

        do {
            System.out.println(STR."Hello \{a}");
            a = a + 1;
        }
        while (a <= 11);

        System.out.println("*****************");

        a = 49;

        do {
            System.out.println(a);
            a += 1;
        }
        while (a < 50);

        System.out.println("*****************");

        String c="Automation Testing";

        do {
            System.out.println(c);
            c="Selenium Testing";
            System.out.println(c);
            break;  //Terminates from the loop immediately which does not check the condition again
        }
        while (c=="Selenium Testing");

        // == in Strings is used to compare the memory location of the strings
        // .equals() in Strings is used to compare the values of the strings

        c="New Day";

        do {
            System.out.println(c);
            c="New day";
        }
        while (c.contains("day")== equals("New Day"));
    }
}
