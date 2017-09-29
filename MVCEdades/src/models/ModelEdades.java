package models;

public class ModelEdades {

    private int edad;
    private String mensaje;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public void calcular(){
        int res=2017-edad;
        if(res>=18){
            this.setMensaje("Tu eres mayor de edad");
        }else{
            this.setMensaje("Tu eres menor de edad");
        }
    }

}
