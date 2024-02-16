import java.util.Scanner;
import java.util.Stack;

public class WeeklyQuiz4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 : ");
        String string = scanner.next();
        boolean answer = answer(string);
        System.out.println(answer);
    }

    public static boolean answer(String str){
        Stack<String> strstack = new Stack<>();

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '('){
                strstack.push("(");
            }else if (str.charAt(i) == ')'){
                if (strstack.isEmpty()){
                    return false;
                }else strstack.pop();
            }

        }
        if(strstack.isEmpty()){
            return true;
        }else return false;
    }
}
