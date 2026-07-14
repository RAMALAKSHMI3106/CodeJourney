import java.util.Scanner;
import java.util.Stack;
public class PostfixExp {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the postfix expression: ");
        String expression=in.nextLine();
        int resylt=solve_postfix(expression);
        System.out.println("Result: "+resylt);
        in.close();

    }
    private static int solve_postfix(String expr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<expr.length();i++){
            char ch=expr.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }else{
                int b=st.pop();
                int a=st.pop();
                switch(ch){
                    case '+':
                        st.push(a+b);
                        break;
                    case '-':
                        st.push(a-b);
                        break;
                    case '*':
                        st.push(a*b);
                        break;
                    case '/':
                        st.push(a/b);
                        break;
                } 

        }
    }
    return st.pop();
}
}

/*

Time Complexity: O(n)
Space Complexity: O(n)

Output: 
Enter the postfix expression: 123+* 
Result: 9

*/
