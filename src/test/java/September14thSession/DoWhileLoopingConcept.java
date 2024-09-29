package September14thSession;

public class DoWhileLoopingConcept {

    public void main(String args[]) {

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
            break;
        }
        while (c=="Selenium Testing");

        c="New Day";

        do {
            System.out.println(c);
            c="New day";
        }
        while (c.contains("day")== equals("New Day"));
    }
}
