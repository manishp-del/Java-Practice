import java.util.*;
public class kedansalgomaxsubaray {
    public static void kadens(int numbers[]){
        int currsum  = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length;i++){
            prefix[i] = prefix[i-1] +numbers[i];

        }
        for(int i=0; i<numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum =" + maxsum);

    }
    public static void kedans(int numbers[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0; i<numbers.length; i++){
            currsum = currsum + numbers[i];
            if(currsum<0){
                currsum = 0;

            }
            maxsum = Math.max(currsum, maxsum);

        }
        System.out.println("our maxsubarray sum is : " +maxsum);

    }
    public static void main(String args[]){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadens(numbers);

    }
    
}
