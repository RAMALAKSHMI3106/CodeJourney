public class LowerCase {
    public static void main(String args[]){
        String input = "Hello World!";
        String result=getlowerCase(input);
        System.out.println("Lowercase: " + result);
    }
    private static String getlowerCase(String input){
        char ch[]=input.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]=(char) (ch[i]+32);
            }
        }
        return new String(ch);
    }
}

