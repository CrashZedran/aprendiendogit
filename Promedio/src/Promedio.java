/**
 *
 * @author CrashZedran
 */
import javax.swing.*;
public class Promedio {

    public static void main(String[] args) {
        //declaramos variables
        int i,j,k,l,m,n,jor,ngra,ncur,nest,nmat,nnota;
        String curso,grado,seguir;
        float pronot,nota,promat,procur,progra,proest,projor,procol,summat = 0,sumgra = 0,sumnot = 0,sumcur = 0,sumest,sumjor = 0, sumnest = 0;
        
        do{
           //mensajes de bienvenida
           JOptionPane.showMessageDialog(null,"Bienvenidos a el programa para hallar el promedio de notas"); 
           JOptionPane.showMessageDialog(null,"Acontinuacion dijite 1 para la jornadade la mañana,2 jornada tarde y 3 jornada noche");
           
           jor = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero correspondiente a la jornada"));

           //condiciones para entrar a preguntar las notas de cada jornada
           if(jor == 1){
             //pedimos el numero de grados de la jornada 
             ngra=Integer.parseInt(JOptionPane.showInputDialog("digite le numero de grados de la jornada "+jor));
             sumgra = sumgra + ngra;
             for(j=1; j<=ngra; j++){
                //pedimos nombre de cada uno de los cursos para la jornada matinal
                grado=JOptionPane.showInputDialog("Digite el nombre del grado");
    	        ncur=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de cursos en el grado "+grado));
                nmat=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de materias para el grado "+grado));
                sumcur = sumcur + ncur;
                //creamos otro ciclo pero para guardar nombres e informacion de los cursos por cada grado
                for(k = 1;k<=ncur;k++){
                    summat = summat + k;
                    //pedimos los nombres de los cursos por cada grado
                    curso=JOptionPane.showInputDialog("Digita el nombre del curso");
                    
                    //ciclo para las materias
                    for(l = 1;l <= nmat;l++){
                       nnota = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Notas"));
                       sumnot = sumnot + nnota;
                       nest = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de estudiantes del "+grado+" "+curso));
                       for(m = 1;m <= nest;m++){
                          for(n = 1; n<= nnota; n++){
                             nota = Float.parseFloat(JOptionPane.showInputDialog("Digite la Nota"+n+" del Estudiante  "+m));
                             sumnest = sumnest + nota;
                          }//fin ciclo n
                          pronot=sumnot/nnota;
                          //pronot=pronot+nest;
                          JOptionPane.showMessageDialog(null,"El promedio de notas es "+pronot);
                       }//fin ciclo m
                       proest=sumnot/nest;
                       JOptionPane.showMessageDialog(null,"El promedio de notas del estudiante"+m+" es "+proest);
                    }//fin ciclo l
                    promat=summat/nmat;
                    JOptionPane.showMessageDialog(null,"El promedio de las materias es "+promat);
                }//fin ciclo k
                progra=sumgra/ngra;
                JOptionPane.showMessageDialog(null,"El promedio del grado"+grado+" "+progra);
             }//fin primer ciclo
             
           }else if(jor == 2){
             //pedimos el numero de grados de la jornada 
             ngra=Integer.parseInt(JOptionPane.showInputDialog("digite le numero de grados de la jornada "+jor));
             sumgra = sumgra + ngra;
             for(j=1; j<=ngra; j++){
                //pedimos nombre de cada uno de los cursos para la jornada matinal
                grado=JOptionPane.showInputDialog("Digite el nombre del grado");
    	        ncur=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de cursos en el grado "+grado));
                nmat=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de materias para el grado "+grado));
                sumcur = sumcur + ncur;
                //creamos otro ciclo pero para guardar nombres e informacion de los cursos por cada grado
                for(k = 1;k<=ncur;k++){
                    summat = summat + k;
                    //pedimos los nombres de los cursos por cada grado
                    curso=JOptionPane.showInputDialog("Digita el nombre del curso");
                    
                    //ciclo para las materias
                    for(l = 1;l <= nmat;l++){
                       nnota = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Notas"));
                       sumnot = sumnot + nnota;
                       nest = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de estudiantes del "+grado+" "+curso));
                       for(m = 1;m <= nest;m++){
                          for(n = 1; n<= nnota; n++){
                             nota = Float.parseFloat(JOptionPane.showInputDialog("Digite la Nota"+n+" del Estudiante  "+m));
                             sumnest = sumnest + nota;
                          }//fin ciclo n
                          pronot=sumnot/nnota;
                          //pronot=pronot+nest;
                          JOptionPane.showMessageDialog(null,"El promedio de notas es "+pronot);
                       }//fin ciclo m
                       proest=sumnot/nest;
                       JOptionPane.showMessageDialog(null,"El promedio de notas del estudiante"+m+" es "+proest);
                    }//fin ciclo l
                    promat=summat/nmat;
                    JOptionPane.showMessageDialog(null,"El promedio de las materias es "+promat);
                }//fin ciclo k
                progra=sumgra/ngra;
                JOptionPane.showMessageDialog(null,"El promedio del grado"+grado+" "+progra);
             }//fin primer ciclo
           }else if(jor == 3){
              //pedimos el numero de grados de la jornada 
             ngra=Integer.parseInt(JOptionPane.showInputDialog("digite le numero de grados de la jornada "+jor));
             sumgra = sumgra + ngra;
             for(j=1; j<=ngra; j++){
                //pedimos nombre de cada uno de los cursos para la jornada matinal
                grado=JOptionPane.showInputDialog("Digite el nombre del grado");
    	        ncur=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de cursos en el grado "+grado));
                nmat=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de materias para el grado "+grado));
                sumcur = sumcur + ncur;
                //creamos otro ciclo pero para guardar nombres e informacion de los cursos por cada grado
                for(k = 1;k<=ncur;k++){
                    summat = summat + k;
                    //pedimos los nombres de los cursos por cada grado
                    curso=JOptionPane.showInputDialog("Digita el nombre del curso");
                    
                    //ciclo para las materias
                    for(l = 1;l <= nmat;l++){
                       nnota = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Notas"));
                       sumnot = sumnot + nnota;
                       nest = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de estudiantes del "+grado+" "+curso));
                       for(m = 1;m <= nest;m++){
                          for(n = 1; n<= nnota; n++){
                             nota = Float.parseFloat(JOptionPane.showInputDialog("Digite la Nota"+n+" del Estudiante  "+m));
                             sumnest = sumnest + nota;
                          }//fin ciclo n
                          pronot=sumnot/nnota;
                          //pronot=pronot+nest;
                          JOptionPane.showMessageDialog(null,"El promedio de notas es "+pronot);
                       }//fin ciclo m
                       proest=sumnot/nest;
                       JOptionPane.showMessageDialog(null,"El promedio de notas del estudiante"+m+" es "+proest);
                    }//fin ciclo l
                    promat=summat/nmat;
                    JOptionPane.showMessageDialog(null,"El promedio de las materias es "+promat);
                }//fin ciclo k
                progra=sumgra/ngra;
                JOptionPane.showMessageDialog(null,"El promedio del grado"+grado+" "+progra);
             }//fin primer ciclo
           }
           
           seguir = JOptionPane.showInputDialog("¿Desea seguir? presione enter, si no desea seguir dijite *");
        }while(!"*".equals(seguir));
        
    }
    
}
