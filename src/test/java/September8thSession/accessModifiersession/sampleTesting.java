package September8thSession.accessModifiersession;

import September8thSession.MethodDeclarationSession;

public class sampleTesting {

    public static void main(String[] args) {

        MethodDeclarationSession.method2(); //This method can be called as this is under public accessModifier

        //System.out.println(MethodDeclarationSession.sumofTwoNumber(7,4));//Cannot call this default method as this is not in the same package
    }
}
