import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Waiter {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        Stack<Integer> plates=new Stack<Integer>();
        for(int i=0;i<n;i++){
            plates.push(sc.nextInt());
        }
        
        int[] prime=primeNumber(q);
        
        
        for(int counter : prime){
            if(counter==0){
                //System.out.println("here in");        
            }else{
            
            Stack<Integer> st=new Stack<Integer>();
            Stack<Integer> notUsed=new Stack<Integer>();
            while(!plates.isEmpty()){
                if(plates.peek()%counter==0){
                    //System.out.println(plates[i]);
                    st.push(plates.peek());
                    plates.pop();
                }else{
                    //System.out.println("here out"+plates.peek());
                    notUsed.push(plates.peek());
                    plates.pop();  
                }
            }
            while(!st.isEmpty()){
                System.out.println(st.peek());
                st.pop();
            }
            Stack<Integer> temp=new Stack<Integer>();
            while(!notUsed.isEmpty()){
                temp.push(notUsed.peek());
                notUsed.pop();
            }
            while(!temp.isEmpty()){
                plates.push(temp.peek());
                temp.pop();
            }
            }
        }
        
            while(!plates.isEmpty()){
                System.out.println(plates.peek());
                plates.pop();
        }
        
    }



public static int[] primeNumber(int n){
   
      
      int status = 1;
      int num = 3;
      //For capturing the value of n
      int[] finalArr=new int[n+1];
      if (n >= 1)
      {
         finalArr[1]=2;
      }

      for ( int i = 2 ; i <=n ;  )
      {
         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
         {
            if ( num%j == 0 )
            {
               status = 0;
               break;
            }
         }
         if ( status != 0 )
         {
            System.out.println(num);
            finalArr[i]=num;

            i++;
         }
         status = 1;
         num++;
      }         
   return finalArr;
   }

}
