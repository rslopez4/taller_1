
package Test;

import Dominio.Curso;


public class TestCurso {
   public static void main (String [] args){
     Curso cursoA = new Curso();
    
      double [] notas = new double [12];
             for (int i=0;i<12;i++){
             notas[i] = Math.random()*6;
             }
        //LlenaNotas(notas);     
    cursoA.setNotas(notas);
     cursoA.mostrarNotas();
     cursoA.setPromedio();
      System.out.println("Promedio del curso "+cursoA.getPromedio());
      cursoA.setEstudianEncimaPromedio();
      System.out.println("Encima del promedio: "+cursoA.estudianEncimaPromedio());
   } 
 public static void llenaNotas(double[] notas){
 for (int i=0;i<12;i++){
         notas[i] = Math.random()*6;
}
 }           
   }
   



