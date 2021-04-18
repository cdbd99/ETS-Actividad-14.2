package actividad2proyectojava;

public class Cono extends Circulo{
    
private float altura;

private String color;

    
public Cono(){       
}
    
public Cono(float altura, String color, float radio, float centroX, float centroY){
super(radio, centroX, centroY);
this.altura = altura;
this.color = color;
} 
    
public Cono(float altura, float radio, float centroX, float centroY){
super(radio, centroX, centroY);
this.altura = altura;
this.color = "";
}  
    
//Creamos los setters y los getters
public float getConoHeight(){return altura;}
    
public void setConoHeight(float altura){this.altura = altura;}
    
public String getColor(){return color;}
    
public void setColor(String color){this.color = color;}     
    

//Metodo para sacar la información del cono creado por pantalla 
public void sacarporpantalla() {
System.out.println("Color del cono: " +color);
System.out.println("Altura del cono: " +altura);
}
}

