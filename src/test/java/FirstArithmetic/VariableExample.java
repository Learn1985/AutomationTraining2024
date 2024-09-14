package FirstArithmetic;

import static java.lang.Boolean.TRUE;


public class VariableExample {

    static int a1;
    static char b2;
    static float c3 ;
    static double d4;
    static byte e5;
    static short f6;
    static long g7;
    static  boolean h8;

       public static void main(String[] args) {
           a1 = 294;
           b2 = ' ';
           c3 = 10.5F;
           d4 = -1.79769313486231570;
           e5 = -126;
           f6 = 32000;
           g7 = 294300796L;
           h8 = TRUE;

        System.out.println(a1);
        System.out.println(b2);
        System.out.println(c3);
        System.out.println(d4);
        System.out.println(e5);
        System.out.println(f6);
        System.out.println(g7);
        System.out.println(h8);

        System.out.println(a1 - g7 * b2);
    }

}
