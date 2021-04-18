package actividad2proyectojava;


public class Circulo extends Punto {

protected float radio;
    
public Circulo(){       
}
    
public Circulo (float radio, float centroX, float centroY){
super(centroX, centroY);
this.radio = radio;
}    
    
//Creamos los setters y los getters
public float getCirculoRadio(){return radio;}
public void setCirculoRadio(float radio){this.radio = radio;

}  

public void Imprimir(){
System.out.println("Radio de la base del cono:" +radio);
}
}
