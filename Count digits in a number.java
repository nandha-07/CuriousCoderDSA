import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    int n =325345, count =0;
    while(n>0){
        
        count= count +1;
        n=n/10;
    }
    System.out.println(count);
    }
