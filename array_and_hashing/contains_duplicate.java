import java.util.*;
public class ContainsDuplicate_01 {

        String check(int[] arr)
        {
        
            for (int i = 0; i < arr.length-1; i++) {
                for (int j =i+1 ; j < arr.length; j++) {
                    if (arr[i]==arr[j])
                    {
                        return "true" ;
                    } 
                }
        }
                return "false" ;        
        }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
       

        System.out.println("Enter the size of array : -");
        int n = in.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the value in the array : ");
        for ( int i = 0;  i < n ; i++)
        {
            arr[i]=in.nextInt();
        }

        ContainsDuplicate_01 obj = new ContainsDuplicate_01();
        String f= obj.check(arr);
        System.out.println(f);
    in.close();
    }
}
