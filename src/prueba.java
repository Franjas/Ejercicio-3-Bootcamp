public class prueba {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setNombre("Francisco");
        persona.setEdad(10);
        persona.setTelefono(123456789);        
        
        
        String Nombre = persona.getNombre();
        System.out.println(Nombre);
        Integer Edad = persona.getEdad();
        System.out.println(Edad);
        Integer Telefono = persona.getTelefono();
        System.out.println(Telefono);
    }
}

class Persona {
    private String Nombre;
    private int Edad;
    private int Telefono;
    
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;

    }

    public int getEdad(){
        return this.Edad;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public int getTelefono() {
        return this.Telefono;
    }
    
}