import java.util.*;

public class HashSet1 {
    public static int findLongestSequence(int[] arr) {
        Arrays.sort(arr);
        int longestSequence = 0;
        int currentSequence = 1;

        for(int i = 1; i< arr.length; i++){
            if(arr[i] == arr[i-1]+1){
                currentSequence++;
            } else if(arr[i] == arr[i-1]){
                continue;
            } else{
                longestSequence = Math.max(currentSequence, longestSequence);
                currentSequence = 1;
            }
        }

        return Math.max(longestSequence, currentSequence);
    }

    public static void main(String[] args) {
        int[] arr = {49, 1, 3, 200, 2, 4, 70, 5};
        System.out.println(findLongestSequence(arr));
    }
}
