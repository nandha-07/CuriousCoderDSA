import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        
        if(a>=90){
            System.out.println("Grade A");
        }
            
        else if(a>=80 && a<90){
           System.out.println("Grade B");
        }
        else if(a>=60 && a<80){
           System.out.println("Grade C");
        }
        else if(a>=35 && a<60){
           System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}