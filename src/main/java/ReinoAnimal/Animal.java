package ReinoAnimal;

public class Animal {
    // Atributos de la clase Animal

    public Animal(){

    }


    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }
    private String nombre;
    private int edad;
    private String especie;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    //static

    public String correr(){
        return "Estoy corriendo";
    }
    public String cazar(){
        return "Estoy cazando";
    }
    public  String nadar(){
        return "Estoy nadando";
    }
    public void escalar(){

    }
}