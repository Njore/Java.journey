/*
ln9: "\\s" is used to represent a whitespace(sequence of spaces,tabs or line breaks)
Delimiter is used to a character or sequence of characters used to separate and tokenize data
*/
import java.util.*;
public class Delimiter{
    public static void main(String[] args){
        String input = "10 tea 20 coffee 40 tea biscuits";
        Scanner s= new Scanner(input).useDelimiter("\\s");
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        s.close();
    }
}