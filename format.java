    import java.util.*;
    public class format
{
    public String Positive(int num)
    {
        if(num>0)
        {
        return "positive";
        }
        else
        return "Negative";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in) ;

        System.out.println("Enter a number : ");
        int n = in.nextInt(); 

        format obj = new format();
        String a = obj.Positive(n);
        System.out.println(a);
        in.close();
    }
    
}