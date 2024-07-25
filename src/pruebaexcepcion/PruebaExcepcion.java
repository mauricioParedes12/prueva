
package pruebaexcepcion;
import java.util.*;
import javax.swing.*;
public class PruebaExcepcion {

    
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        num1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = scan.nextInt();
        
        Division2(num1,num2);
        
    }
    
    public static void Division1(int num1, int num2){
        
        int division = 0;
        try{
            
            division = num1/num2;
            
        }
        catch(ArithmeticException e){
            
            JOptionPane.showMessageDialog(null, "Estas dividiendo por cero!", "OYE TU", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            System.out.println("Respuesta: " + division);
        } 
    }
    
    public static void Division2(int num1, int num2){
        
        int division = 0;
        try{
            
            division = num1/num2;
            
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally{
            System.out.println("Respuesta: " + division);
        } 
    }
}
