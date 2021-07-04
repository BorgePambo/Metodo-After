package javaapp15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaApp15 {

   
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Digite uma Data (dd/MM/yyyy): ");
        Date ida = sdf.parse(sc.next());
        System.out.print("Digite uma Data (dd/MM/yyyy): ");
        Date retorno = sdf.parse(sc.next());
        
        
        if(!ida.after(retorno)){            
              System.out.println("Viagem Marcada");
        }
        else{
             System.out.println("Data inválida: Ida não pode ser depois de retorno!!");
        }
        
        sc.close();
    }
    
}
