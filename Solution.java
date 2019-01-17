import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     
   int numb = Integer.parseInt(reader.readLine());
   
   if (numb / 4 == 0  ){
       System.out.println("Високосный год");
        if (numb % 100 == 0 & numb % 400 !=0){
       System.out.println("НЕ Високосный год");      
        }
    else {
         System.out.println("НЕ Високосный год");      
    }
   }
  
}  
   

}
