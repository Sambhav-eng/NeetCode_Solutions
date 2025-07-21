import java.util.*;
class EncodeanDecodeStrings_05 {

        public String encode(List<String> strs) {
            StringBuilder ob = new StringBuilder();
            for (String str : strs) {
                ob.append(str.length()).append('#').append(str);
            }
            return ob.toString();
        }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i =0 ;

        while (i<str.length()) {
            int j = i ;
            while (str.charAt(j)!='#') {
                j++;                
            }          
              int len = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j + 1, j + 1 + len);
            result.add(word);
            i = j + 1 + len;  
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <String>list= new ArrayList<>();
        System.out.println("Entter the number of words you want to input : ");
        int n = in.nextInt();
        String arr[]= new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter word"+i+" : ");
            arr[i]=in.next();
        }
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }

        //object creation
        EncodeanDecodeStrings_05 obj = new EncodeanDecodeStrings_05();
        String f = obj.encode(list);
         System.out.println("Encoded string: " + f);
        List<String> decoded = obj.decode(f);
         System.out.println("Decoded string: " +decoded);
         in.close();
    }
}
