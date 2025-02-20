import java.util.Stack;

public class StackGuidance {
    public void  stackLearning (int[] integer){
        //Create a stack to store each integer
        Stack<Integer> myStack = new Stack<>();
        //Loop through the given integer  to push each integer to myStack
        for(int i = 0 ; i < integer.length ; i++){
            myStack.push(integer[i]);
        }
        System.out.println(myStack);

        //Create a stack to store the reverse of myStack
        Stack<Integer> helperMyStack = new Stack<>();
        //Looping through myStack to check is empty
        while(!myStack.empty()){
            //Remove each element to populate helperMyStack
            int item = myStack.pop();
            helperMyStack.push(item);
        }
        System.out.println(helperMyStack);



    }
}
