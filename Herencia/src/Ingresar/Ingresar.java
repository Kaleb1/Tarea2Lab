package Ingresar;

public class Ingresar {
	
	int Cantidaddenodos;
	
    Ingresar(int Cantidaddenodos){
		
		this.Cantidaddenodos=Cantidaddenodos;
		
	}
    
    public void Nodo(){
    	
    	int n=Cantidaddenodos;
    	
    	for(int i=0;i<=n;i++){
    		
    		System.out.println("El nodo ["+i+"] se a movido");
    
    	}
    }

}
