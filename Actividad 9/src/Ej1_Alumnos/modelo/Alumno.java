
package Ej1_Alumnos.modelo;

public class Alumno implements Comparable<Alumno> {
    
    private String nombre;
    private String apellido;
    private String padron;
    private char sexo;
    private String condicion;
    private Integer nota_final;

    public Alumno(String nombre, String apellido, String padron, char sexo, String condicion, Integer nota_final) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.padron = padron;
        this.sexo = sexo;
        this.condicion = condicion;
        this.nota_final = nota_final;
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

    public String getPadron() {
        return padron;
    }

    public void setPadron(String padron) {
        this.padron = padron;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Integer getNota_final() {
        return nota_final;
    }

    public void setNota_final(Integer nota_final) {
        this.nota_final = nota_final;
    }

   

    
    public String toString(){
        return "Nombre: "+getNombre()+"\n"
               +"Apellido: "+getApellido()+"\n"
               +"Padrón: "+getPadron()+"\n"
               +"Sexo: "+getSexo()+"\n"
               +"Condicion: "+getCondicion()+"\n"
               +"Nota final: "+getNota_final()+"\n" ;
    }

    @Override
    public int compareTo(Alumno a) {       
        return nota_final.compareTo(a.getNota_final());
    }
    
}
