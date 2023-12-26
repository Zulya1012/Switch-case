import java.util.Scanner;
 
public class operasiyi {
 
    public static void main(String[] args) {
        int x=56;
        int y=12;
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite nomer operasiyi:");
        System.out.println("1.Slojeniye");
        System.out.println("2.Vichitaniye");
        System.out.println("3.Umnojeniye");
        int a = in.nextInt();
        
        
              
        switch (a)
        {
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            default:
                System.out.println("Neizvestnoye chislo");
                break;
        }
        }
}