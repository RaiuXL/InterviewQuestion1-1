import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        String word = "Hey";
        System.out.println(isWordUnique(word));
    }
    public static boolean isWordUnique(String word){
        HashMap<Character, Integer> wordMap = new HashMap<>();

        for(char c: word.toCharArray()){
            if(wordMap.containsKey(c)){
                return false;
            } else{
                wordMap.put(c,1);
            }
        }

        return true;
    }
}