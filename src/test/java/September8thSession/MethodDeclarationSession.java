package September8thSession;

public class MethodDeclarationSession {

    //Inside a static block we can call other static or non-static methods, variables etc..
    public static void main(String[] args) {
        method1();
        System.out.println(sumofTwoNumber(2,5));
    }
        //Collection of statements grouped together to perform a specific task

        //Declaring a method
        //accessSpecifier (or) accessModifier returnType methodName (parameters)

        //Different types of accessSpecifiers:

        //public - can be accessed from anywhere
        //private - can be accessed within the class
        //protected - can be accessed within the package, outside the package with inheritance
        //default - can be accessed only within the package

        //Different types of ReturnTypes: Meaning the type of result the method is going to return
        // If the method is not going to return anything then the returnType is void
        //If the method should return an integer then the returnType should be integer
        //If the method should return an integer then the returnType should be char
        //If the method should return an integer then the returnType should be boolean
        //If the method should return an integer then the returnType should be float
        //If the method should return an integer then the returnType should be double
        //If the method should return an integer then the returnType should be so on..

        //MethodName -- Name of the method
        //While declaring the method follow the rules to declare a variable

        //parameters - The values which are passed to the method which is completely optional



    private static void method1(){
        System.out.println("This is a method 1" );

    }

    //Method with no argument and no return type
    public static void method2(){
        System.out.println("This is a method 2" );
    }

    //Method with arguments and return type
    static int sumofTwoNumber(int a, int b){ //given there is no access modifier the method is default and can be added anywhere within the package
        return a+b; //return key value is used to return the value
    }


    //In Java, we cannot declare the same method twice within the same class
    //Method Overloading can be in number of arguments, data type of the arguments, sequence of the arguments
    //Hence we use Method Overloading
    //Method Overloading is also called compile time polymorphism
    //Method Overloading promotes the reusability of the code
    //Method overloading will not work if we change the return type
    //Method overloading will not work if we change the access specifier also

    static int sumofTwoNumber(int a, int b, int c){
    return a+b+c;

    }
}
