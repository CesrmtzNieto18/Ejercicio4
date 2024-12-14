
import javax.swing.JOptionPane;

class Ejercicio_No4 {
    public static void main(String args[]) {
        int CatA = 0, CatB = 0;
        
         CatA=Short.parseShort(JOptionPane.showInputDialog("ingrese el valor de A"));
              CatB=Short.parseShort(JOptionPane.showInputDialog("ingrese el valor de B"));
        
        
        int sumaCuadrados = CatA * CatA + CatB * CatB;

        
        double hipotenusa = Math.sqrt(sumaCuadrados);
        
        JOptionPane.showMessageDialog(null, "El valor de la hipotenusa es: " + hipotenusa);
      

       
    }
}
