import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
for(int x=2;x<=n;x++){
        int flag = 0;
        for(int i=2;i<x;i++){
            if(x%i==0){
                flag = 1;
            }
        }
        if(flag==0){
            System.out.println(x);
        }
    }
    }
}
