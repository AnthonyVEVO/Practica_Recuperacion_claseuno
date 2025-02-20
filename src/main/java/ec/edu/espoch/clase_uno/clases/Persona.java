
package ec.edu.espoch.clase_uno.clases;

public class Persona {
    //aqui van los atributos
    private int id;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int fechaNacimiento;
    
    
    //constructores 

    public Persona(int id, String nombre, String apellido, String nacionalidad, int fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
    //Aqui van los metodos
    public void imprimir(){
        System.out.println("id"+this.id);
        System.out.println("Nombre"+ this.nombre);
        System.out.println("Apellido"+ this.apellido);
        System.out.println("Nacionalidad"+ this.nacionalidad);
        System.out.println("Fecha de Nacimiento"+ this.fechaNacimiento);
        
        
    }
    public String imprimirDatos (){
        return "Nombre"+this.nombre+"/n apellido"+this.apellido+"/n Nacionalidad:"+this.nacionalidad+"/n fecha de nacimiento:"+this.fechaNacimiento+"/n id:"+this.id;
        
    }
      
    public String calcularEdad(int edad){
        String msm = "";
        if (edad>0) {
            
             if (edad>18){
            msm= "Eres mayor de edad..";
        }else{
            msm="Eres menor de edad..";
             }
        }else{
                msm= "No exite edades negativas";
                }
        return msm;
    }


    public String situacionTrabajo(Horario objHorario){
        String msm;

        if (objHorario.getNumeroHorasTrabajo()>8) {
            msm= " Estas trabajando mucho";
        }else if (objHorario.getNumeroHorasTrabajo()==8) 
        msm= "Estas trabajando mas de lo normal";
        
        else{
            msm="Aun no has trabajado";

        }
        return msm;
    
    }  
    
    public String laborTrabajo(Horario objHorario){
        String msm;
        switch (objHorario.getDiaTrabajo()) {
            case "lunes":
                msm= "es laborable";
            case  "martes":
                msm= "es laborable";
            case  "miercoles":
                msm= "es laborable";
            case  "jueves":
                msm= "es laborable";
            case "viernes":
                msm= "es laborable";
                
                break;
            default:
                msm="Es un fin de semana";
        }
           return msm; 
        }
    }
            
            
