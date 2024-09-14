package September8thSession;

public class StringBuilderSession {

   public static void main(String[] args) {

            //StringBuilder is a mutable class
            //We can modify the string as per our own needs
            //This is non-thread safe and non-synchronized
            //Prefer to use in the scenario where the string needs to be modified multiple time
            //All the string functions are applicable in stringBuilder

            //Create a stringBuilder object

            StringBuilder s1 = new StringBuilder("Hello World");

            System.out.println(s1);

            s1.append(" Today is a good evening");

            System.out.println(s1);

            s1.delete(7,10);//Inclusive of starting index position and exclusive of n index position.

       System.out.println(s1);

         s1.insert(7, "orld. Goo");

       System.out.println(s1);

       s1.deleteCharAt(10);

       System.out.println(s1);

       System.out.println(s1.capacity());//Default capacity is 16 but increases based on length

       s1.ensureCapacity(100);

       System.out.println(s1.capacity());

       System.out.println(s1.reverse());

       String s2= "My Data";

       //Converting string to string builder

       StringBuilder s3= new StringBuilder(s2);

       System.out.println(s3);

       System.out.println(s2.contentEquals(s3));//useful when content of the string and stringBuilder are compared

       System.out.println(s3.toString());

       System.out.println(s3.replace(3,8,"very own data"));

       System.out.println(s3.repeat(20,4));//Passing ASCII value to be repeated for n number of times

       System.out.println(s3.repeat("Hello",5));
        }

    }