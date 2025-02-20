
package ec.edu.espoch.clase_uno;

import ec.edu.espoch.clase_uno.clases.Horario;
import ec.edu.espoch.clase_uno.clases.Persona;


public class Clase_Uno {

    public static void main(String[] args) {
        //Instanciar una clase
      
       /* Persona objPersona = new Persona();
        objPersona.setNombre("Anthony");
        objPersona.setApellido("Moreira");
        objPersona.setFechaNacimiento(06);
        objPersona.setId(1010);
        objPersona.setNacionalidad("Ecuatoriana");
 
        
        objPersona.imprimir();
        
        
         objPersona.calcularEdad(0);

         
        String result =  objPersona.calcularEdad(0);
        
        System.out.println("Resultado:"+result);
        
        System.out.println("Resultado"+ objPersona.calcularEdad(0));

        System.out.println(""+objPersona.imprimirDatos());
           
     
        Horario objHorario = new Horario();
        objHorario.setNumeroHorasTrabajo(9);
        Persona objPersona = new Persona();
        System.out.println("Result"+objPersona.situacionTrabajo(objHorario));*/
        
        
        Horario objHorario = new Horario();
        objHorario.setDiaTrabajo("domingo");
        Persona objPersona = new Persona();
        System.out.println("Result"+objPersona.laborTrabajo(objHorario));
     
    }
   
    
}

