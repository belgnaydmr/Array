
import java.util.Scanner;


public class Main {
    public static Double ortalamabul(double [] a){
        double b = 0;
        double sonuc;
        for (int i = 0; i < a.length; i++) 
        {
            b+=a[i];  
        }
         sonuc=b/a.length;
         return sonuc;
    }
    public static void DizininTersi(double [] a){
        int n=a.length;
        double [] b=new double [n];
        for (int i = 1; i <= n; i++) {
            
            b[n-i]=a[i-1];
            
        }
        System.out.println("Dizinin Tersi:");
        for (int i = 0; i < b.length; i++)
        {
             System.out.print(b[i]+",");
        }
       
    }
    public static void main(String []args){
       Scanner scanner=new Scanner(System.in);
       System.out.println("Eleman Sayısını Girin:");
       int n=scanner.nextInt();
       double [] a=new double [n];
       System.out.println("Dizinin Elemanlarını Girin...");
       for (int i = 0; i < a.length; i++)
       {
            System.out.println("Dizinin "+(i+1)+". Elemanı:");
            a[i]=scanner.nextDouble();
        }
        DizininTersi(a);
        System.out.println(" ");
        System.out.println("Ortalaması:"+ortalamabul(a));
   
    }
}
