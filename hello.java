import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i = 0; i<N; i++){
            for(int j=i+1; j<=N; j++){
                System.out.print(N-j+1);
            }
            System.out.println(" ");
        }
       
     }
}