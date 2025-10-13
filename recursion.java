import java.util.*;
class lec1{
    // Factorial =>  SC - O(n), TC-O(n)
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    //FIBONACCI => tc - O(2^n) 
    public static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
      
        return  fibo(n-1)+fibo(n-2);

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    // System.out.println(fact(num));
     for (int i = 0; i < num; i++) {
            System.out.print(fibo(i) + " ");
        }
        
   
    sc.close();

}
}
