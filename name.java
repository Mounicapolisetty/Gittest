import java.util.Scanner;

public class name {
    
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

          if (num==1){

            System.out.println(" fibonacci is 1");
            
        }

        int a=0;
        int b=1;
        
        System.out.println(a);
        System.out.println(b);
      
        int i=2;
        int c;
        while(i<=num){
             

            c=a+b;
            a=b;
            b=c;

           if(c>=10)
            break;
            
        
            System.out.println(c);
            
            
            

        }
        i++;

        
     
    }
}
