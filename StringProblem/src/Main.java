
import java.util.Scanner;

//3. Create a function that takes a string and returns a new string with its first and last characters swapped,
//      except under two conditions:If the length of the string is less than two, return "Incompatible.".
//        If the first and last characters are the same, return "Two's a pair.".
//        Examples flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"
//
//        flipEndChars("ada") ➞ "Two's a pair."
//
//        flipEndChars("Ada") ➞ "adA"
//
//        flipEndChars("z") ➞ "Incompatible."
public class Main {
    public static String flipEndChars(String str) {
      char [] charArr = str.toCharArray();
      if (charArr.length < 2) {
          return "Incompatible";
      } else if (charArr[0] == charArr[charArr.length-1]) {
          return "Two's pair : " + charArr[0];
      } else {
          char temp = charArr [0];
          charArr[0] = charArr[charArr.length-1];
          charArr[charArr.length-1] = temp;
          return new String(charArr);
      }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scan.next();
        String output = flipEndChars(str);
        System.out.println(output);

        /*
            Outputs :
                Enter String : Adja
                adjA

                Enter String : sds
                Two's pair : s

                Enter String : a
                Incompatible
         */
    }
}