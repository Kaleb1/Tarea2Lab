package Ingresar;

public class Salida extends Comparar{
	
	int salida;
	
	Salida(int cantidaddenodos, int otracantidad, int salida){
		
		super(cantidaddenodos,otracantidad);
		this.salida=salida;
		
	}
	
	public void imprimir(){
		
		super.Nodo();
		for(int j=0;j<Cantidaddenodos;j++){
		System.out.println("Salida ["+j+"]");
		}
	}

}
