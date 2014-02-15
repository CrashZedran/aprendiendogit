
/**
 *
 * @author --- @CrashZedran -- "Andres F Robles"
 * https://www.github.com/CrashZedran
 */
import javax.swing.*;
public class Promedios {
    
    public static void main(String[] args) {
        
    int i,j,k,l,m,n,ngra,ncur,nest,nmat,nnot;
    String jor,curso,grado;
    float nota,promat,procur,proest,projor,procol,summat = 0,sumgra = 0,sumnot = 0,sumcur = 0,sumest,sumjor = 0, sumnest = 0;
    
    for (i=1; i<=3; i++) {
    
    if(i==1)	{
       jor="Matinal";
    }else if(i==2){
    	jor="Vespertina";
    }else{ 
        jor="Nocturna";
    }
    
    sumjor = sumjor + i;
    
    //pedimos el numero de grados de la jornada 
    ngra=Integer.parseInt(JOptionPane.showInputDialog("digite le numero de grados de la jornada "+jor));
    sumgra = sumgra + ngra;
    for (j=1; j<=ngra; j++) {
    	grado=JOptionPane.showInputDialog("Digite el nombre del grado");
    	ncur=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de cursos en el grado "+grado));
        nmat=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de materias para el grado "+grado));
        sumcur = sumcur + ncur;
        //creamos un ciclo para guardar nombres e informacion de los cursos
        for(k = 1;k<=ncur;k++){
           summat = summat + k;
           curso=JOptionPane.showInputDialog("Digita el nombre del curso");

           for(l = 1;l <= nmat;l++){
              nnot = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Notas"));
              //sumnot = sumnot + nnot;
              nest = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de estudiantes del "+grado+" "+curso));
             
              for(m = 1;m <= nest;m++){
                for(n = 1; n<= nnot; n++){
                   nota = Float.parseFloat(JOptionPane.showInputDialog("Digite la Nota"+n+" del Estudiante  "+m));
                   sumnest = sumnest + nota;
                }//fin ciclo n 
                
              }//fin ciclo m
           }
           
        }//fin ciclo k
    }//fin ciclo contadora j 
    
    }//fin ciclo contadora i
    
    
    
    }//fin de metodo principal
    
}//fin de la clase principal 
