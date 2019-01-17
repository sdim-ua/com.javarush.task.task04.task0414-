import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   int numb = Integer.parseInt(reader.readLine());


    if ( (numb  % 4 == 0 ) && (numb  % 100 != 0 || numb  % 400 == 0)){
        int x = 366;
         System.out.println("количество дней в году: " + x);
     }
    
     else   {
         int x = 365;
        System.out.println("количество дней в году: " + x);
   }  
   

}  


}
