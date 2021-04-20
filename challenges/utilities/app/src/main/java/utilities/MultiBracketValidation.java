package utilities;
import java.util.HashMap;
import java.util.Stack;

public class MultiBracketValidation {
    private static HashMap<Character, Character> brackets = new HashMap<>();

    // Method to validate brackets
    public static boolean multiBracketValidation(String input){
        // check if valid input
        if(input == null){
            throw new IllegalArgumentException("Invalid input");
        }

        initializeBrackets();

        Stack<Character> curBrackets = new Stack<>();
        char[] splitWord = input.toCharArray();

        for(int index = 0; index < splitWord.length; index++){
            if(brackets.containsKey(splitWord[index])){
                if(curBrackets.empty() ||curBrackets.peek() != brackets.get(splitWord[index])){
                    return false;
                }
                curBrackets.pop();
            } else if(brackets.containsValue(splitWord[index])){
                curBrackets.push(splitWord[index]);
            }
        }
        if(curBrackets.empty()){
            return true;
        }

        return false;
    }
    private static void initializeBrackets(){
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
    }

}
