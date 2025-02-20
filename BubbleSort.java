import java.time.Instant;
import java.time.Duration;
import java.util.Arrays;
class BubbleSort{
    public static void main(String[]args){
        Instant start = Instant.now();
        int unSortedArr[]={1, 3, 4, 8, 15};
        int n=unSortedArr.length;
        boolean k=true;
        System.out.println(Arrays.toString(unSortedArr));
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(unSortedArr[j]>unSortedArr[j+1])
                {
                    unSortedArr[j] +=unSortedArr[j+1];
                    unSortedArr[j+1] =unSortedArr[j] - unSortedArr[j+1];
                    unSortedArr[j] =unSortedArr[j] - unSortedArr[j+1];
                    k=false;
                }
                

                
            }
            if(k) {
                System.out.print("Arr is already sorted.");
                break;
            }
        }

        System.out.println("Output Array:" +Arrays.toString(unSortedArr));
        Instant end = Instant.now();  // End time
        Duration timeElapsed = Duration.between(start, end); // Calculate time

        System.out.println("Execution Time: " + timeElapsed.toMillis() + " milliseconds");
    
    }
    }