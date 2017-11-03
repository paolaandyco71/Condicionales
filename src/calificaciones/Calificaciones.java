/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB03
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        float nota1 , nota2 , nota3;
        float suma,promedio;
        
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Nota1"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Nota2"));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Nota3"));
        suma = nota1+nota2+nota3;
        promedio=suma/3;
        
        if (promedio >= 4)
        {
            JOptionPane.showMessageDialog(null, "El alumno fue aprobado con un"+promedio);
          } 
        else
        {
             JOptionPane.showMessageDialog(null, "El alumno no aprobado con un"+promedio);
    
        }
    }
    
}
