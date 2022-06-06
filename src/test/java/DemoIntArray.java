import java.util.Arrays;
import java.util.stream.IntStream;

public class DemoIntArray {
    public static void main(String[] args){
        int[] numarray = {1,6,93,7,2,9,45,3,7};
        for(int element:numarray)
            System.out.println("Normal :"+element);

/*        Arrays.sort(numarray);
        for(int element:numarray)
            System.out.println("Sorted :"+element);*/

        int max = numarray[0];
        for(int i=0; i< numarray.length;i++){
            if(numarray[i]>max){
                max = numarray[i];
            }
        }
        System.out.println("Higher number in array is :"+max);
    }
}
