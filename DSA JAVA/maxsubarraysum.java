import java.util.*;
public class maxsubarraysum {
    public static void maxSubarraySum(int numbers[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length;j++){
                int end = j;
                currentsum = 0;
                for(int k=start; k<=end; k++){
                    currentsum += numbers[k];

                }
                System.out.println(currentsum);
                if(maxsum<currentsum){
                    maxsum=currentsum;

                }
            }
        }
        System.out.println("max term is:" + maxsum);

    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubarraySum(numbers);
        
    }
}
