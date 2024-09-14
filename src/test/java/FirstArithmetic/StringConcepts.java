package FirstArithmetic;

import java.sql.SQLOutput;

public class StringConcepts {

    public static void main (String[] args) {

    /* String is a primitive datatype which stores only characters*/

    String s1= "This is my first coding lesson in Strings on Day2";

    System.out.println (s1.length());

    String p1="";

    System.out.println(s1.isEmpty());

    System.out.println(s1.isBlank());

    /* Potential interview question - what is the difference between isBlank and isEmpty*/

    System.out.println (s1.toUpperCase());

    System.out.println (s1.toLowerCase());

    System.out.println(s1.replace("first", "Second"));

    System.out.println (s1.startsWith("string")); //false

    System.out.println (s1.startsWith("This is my"));  //true

    System.out.println (s1.startsWith ("this")); //false

    System.out.println (s1.endsWith("Day2")); //true

    System.out.println (s1.contains("my"));
    /* In java we can reassign the values to the variables*/

    /*Index Position --- We need to start reading the string from 0,1,2...     */
    System.out.println(s1.charAt(2)); /* i */
    System.out.println(s1.charAt(10)); /* space after my */

    /*Below throws a String index out of bounds exception, if we are trying to access a character that is out of the length or when we search for a negative value */

    System.out.println(s1.charAt(300));/*above exception */

    System.out.println (s1.substring(6));
        //Prints from starting till 6th position

    System.out.println (s1.substring(29));

    System.out.println (s1.substring(300)); //exception

    System.out.println (s1.substring(40,45)); //Prints from 40th index position till 45th index position


        System.out.println (s1.substring(40,30)); //Gives string index out of bound exception

   System.out.println (s1.indexOf('i')); //prints the first i's index position number

        System.out.println (s1.indexOf('i', 10));

        System.out.println (s1.indexOf("that"));
        System.out.println (s1.lastIndexOf("my", 10));

        System.out.println (s1.lastIndexOf( "are"));

        String s2= "This is my first Strings coding lesson on Day2";

        System.out.println (s2.lastIndexOf('g'));

        System.out.println (s2.lastIndexOf( "no way"));

        /* Removes the white spaces present at the start & end of the string*/
        System.out.println (s2.trim());

        System.out.println (s2.strip());

        System.out.println (s2.stripLeading());

        String s3= "This is my first Strings coding lesson on Day2";

        System.out.println (s2.translateEscapes());

        String s4 = "New Lines";
        String s5 = "new lines";

        System.out.println (s4.equals(s5));
        System.out.println (s4.equalsIgnoreCase(s5));

        System.out.println (s4.compareToIgnoreCase(s5)); /* compares the values by the ASCII values*/


        String s6 = "Hello World";

        System.out.println (s6.codePointAt(3));

        System.out.println (s6.hashCode());

//Multi-line strings declaration --> JDK 14 or 15 and above

        String s7= """
                My first line of paragraph
                My second line of paragraph
                """;

        System.out.println (s7);
    }




}

