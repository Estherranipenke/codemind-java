import java.util.Scanner;

public class add{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==3 ||a==2){
            System.out.println("Spring");
        }
        else if (a>=4 && a<=6){
            System.out.println("Summer");
        }
        else if (a>=7 && a<=10){
            System.out.println("Rainy");
        }
        else if (a==1 || a==11||a==12){
        System.out.println("Winter");
        }
        else{
            System.out.println("-1");
        }
    }
}
    