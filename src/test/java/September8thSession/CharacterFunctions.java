package September8thSession;

public class CharacterFunctions {

    public static void main(String[] args){

        char c1=4;

        System.out.println(Character.isDigit(c1));
        System.out.println(Character.isAlphabetic(c1));

        c1='r'; //Character should be defined between single quotes '' not double quotes

        System.out.println(Character.toUpperCase(c1));

        System.out.println(Character.isUpperCase(c1));

        System.out.println(Character.isLowerCase(c1));

        c1='K';

        System.out.println(Character.toLowerCase(c1));

        c1= ' ';

        System.out.println(Character.isWhitespace(c1));

        c1='p';

        System.out.println(Character.isLetterOrDigit(c1));

        System.out.println(Character.toString(c1));

        c1='4';

        //System.out.println(Character.getNumericValue(c1git ));
    }
}
