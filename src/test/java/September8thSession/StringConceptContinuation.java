package September8thSession;

import java.lang.constant.Constable;

public class StringConceptContinuation {
    public static void main(String[] args) {
        String s1= "New World";

        System.out.println(s1.indent(4));// Adds white spaces at the start of the string

        String stringtobeindented = "----";

        System.out.println(stringtobeindented.concat(s1));

        System.out.println(s1.stripIndent());

        String s2="This is my first set of data containing string functions from my practise";

        System.out.println(s2.replaceFirst("my","your"));

        //Strings are immutable
        //.intern() function creates an exact copy of the string in the heap memory or the string pool

        String s3="hello";
        String s4=s3.intern();

        System.out.println(s3==s4);

        String s5=s4.toUpperCase();

        System.out.println(s3+" "+s4+" "+s5);

        //For a Constant string the values cannot be changed or even concatenated. Introduced from Java 12

        Constable c1="Hi There";

        System.out.println(c1);

    }
}
