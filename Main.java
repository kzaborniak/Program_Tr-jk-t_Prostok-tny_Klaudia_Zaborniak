import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź trzy boki:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>0 && b>0 && c>0){
            int a1 = a*a;
            int b1 = b*b;
            int c1 = c*c;
            if(c1== a1+b1 || b1==a1+c1 || a1==b1+c1){
                System.out.println("Trójkąt jest prostokątny");
            }
            else {
                System.out.println("Trójkąt nie jest prostokątny");
            }
        }
      
    }
}