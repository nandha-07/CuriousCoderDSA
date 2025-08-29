import java.util.Scanner;
class Palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
       int rev= 0;
       int x = n;
       while(n>0){
           rev=rev*10+(n%10);
           n=n/10;
       }
       if(rev==x){
           System.out.println("Palindrome");
       } else{
           System.out.println("Not Palindrome");
       }
    }
}
