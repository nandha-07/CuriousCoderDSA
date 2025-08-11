import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = a+b+c;
        
        if(d==180){
            System.out.println("Triangle can be formed");
        }
            
        else{
            System.out.println("Triangle can not be formed");
        }
    }
}