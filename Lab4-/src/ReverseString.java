import java.util.HashSet;
import java.util.Stack;

public class ReverseString {
    public void reverseVowels (String s){
        //Create a Stack to store all characters in a given String
        Stack<Character> myStack = new Stack<>();
        //Looping though a given String to populate myStack
        for( int i = 0 ; i < s.length(); i++){
            myStack.push(s.charAt(i));
        }
        //Printing myStack
        System.out.println(myStack);

        String vowels = "aeiou";

        //Create a HashSet to store each vowels in myVowels
        HashSet<Character> myVowels = new HashSet<>();
        for(int i = 0 ; i < vowels.length() ; i++){
            //Populate the HashSet
            myVowels.add(vowels.charAt(i));
        }
        System.out.println(myVowels);
        //Loop through the String to check if any characters is in myVowels
        for (int i = 0 ; i < s.length(); i++){
            //Initialise c by targeting a pointer to any character in a given string (s)
            char c = s.charAt(i);

            if(myVowels.contains(c)){
                //Return that vowel character at the top and store it in c1
                char c1 = myStack.peek();
                // Update the char at the index of the string
                c = c1;

            }


        }

        System.out.println(myStack);


            //return myStack.toString();
    }
}
