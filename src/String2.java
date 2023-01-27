public class String2 {
    public static void printPermutation(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char ch =  ques.charAt(i);
            String leftPart = ques.substring(0, i);
            String rightPart = ques.substring(i+1);
            String restOfString = leftPart + rightPart;
            // System.out.println("CURR =>" + ch +" ROS=> " + restOfString + "  ANS+CH => " + (ans+ch)); 
            printPermutation(restOfString, ans+ch);      
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "");
    }
    
}
