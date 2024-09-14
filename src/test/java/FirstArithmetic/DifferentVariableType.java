package FirstArithmetic;

// Total 9 types of variables in JAVA.
//For usage we mostly use 3 types of variables - local , instance, Global
//Based on the location where the variable is declared and whatever access modifier preceding a variable, the variable nature switches between Local, Global & Instance

public class DifferentVariableType {

    public int a = 100; //Global variable, defined at class level and can be used within & outside the class.
    private int b = 2000; //Instance Variable - this variable is strictly accessible within the class.

    public static int add(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args) {
        int b = 200; //This is local variable and can be used only within this method and not outside.
    }
}
