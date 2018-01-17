
import java.util.Scanner;

public class MarkahKeseluruhan {
    public static void main (String[] args )
    {
      Scanner input=new Scanner(System.in);        
        int FOP = 87;
         int CONA=90;
          int WP=68;
           int SI=50;
          int jumlah = FOP+CONA+WP+SI;
         int purata= jumlah/4;
        int peratus=(jumlah*100)/jumlah;
        
        System.out.println("Fundamental of Programming = "+FOP); 
         System.out.println("Computer Organization and Architecture = "+CONA); 
          System.out.println("Web Programming = "+WP); 
           System.out.println("System Interface = "+SI+"\t"); 
           
           
          
           System.out.println("");           
          System.out.println("Jumlah Keseluruhan adalah --> "+jumlah);
         System.out.println("Jumlah purata adalah --> "+purata);        
        System.out.println("Jumlah peratus adalah  --> "+peratus);
        
         
    }
    
}
