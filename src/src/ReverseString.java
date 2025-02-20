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

//        //Create a helper Stack to reverse myStack
//        Stack<Character> helpermyStack = new Stack<>();
//        //Looping through myStack to populating helpermyStack
//        while(!myStack.empty()){
//            char item = myStack.pop();
//            helpermyStack.push(item);
//        }
//        System.out.println(helpermyStack);
        String vowels = "aeiou";

        //Create a HashSet to store each vowels in helpermyStack
        HashSet<Character> myVowels = new HashSet<>();
        for (int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(vowels.contains(c){
                char c1 = myStack.peek();
                s[i] = c1;
            }
        }

        }
    }
}
