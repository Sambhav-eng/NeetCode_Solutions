//Sorting using bucket sort for float variable 
import java.util.*;
public class BucketSort {

    public static void BucketSort(float[] arr)
    {
        int n = arr.length;
        if(n<=0)
        return ;

        //Creating buckets
        List<Float>[] buckets =new ArrayList[n];
        for (int i = 0; i < n; i++) 
        {
            buckets[i]=new ArrayList<>();    
        }

        //Array->bucket
        for (float value : arr) {
            int index = (int)(value*n);
            buckets[index].add(value);           
        }

        //Sorting buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        //merge bucket and original array
        int idx=0;
        for (List<Float> bucket : buckets) {
            for (float value : bucket) {
                arr[idx++]=value;
            }
        }

    }

    public static void main(String[] args) {
        float[] arr = {0.78f, 0.17f, 0.39f, 0.26f, 0.72f, 0.94f, 0.21f, 0.12f, 0.23f, 0.68f};
        System.out.println("Original: " + Arrays.toString(arr));
        BucketSort(arr);
        System.out.println("Sorted:   " + Arrays.toString(arr));
    }
}