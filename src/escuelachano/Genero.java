package escuelachano;

public class Genero {
    private int idGenero;
    private String descripcion;
    
    //Comentario de prueba
    
    public Genero(int idGenero, String descripcion){
        this.idGenero = idGenero;
        this.descripcion = descripcion;
    }
    
    public int getIdGenero(){
        return this.idGenero;
    }
    
    public void setIdGenero(int nuevoIdGenero){
        this.idGenero = nuevoIdGenero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
