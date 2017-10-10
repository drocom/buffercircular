public class CBuffer {
    private final int TAMANIO = 5;
    private int [] datos; // El array es compartido
    private int numeroLlenos, numeroVacios;
    private int indiceC, indiceP;
    public CBuffer(){
        datos = new int[TAMANIO]; // Array compartido
        numeroLlenos=0;
        numeroVacios=TAMANIO;
        indiceP=0;
        indiceC=0;
    }
    public synchronized void almacenar(int n){
        if (numeroLlenos<TAMANIO)
        datos[indiceP]=n;
        indiceP++;
        if (indiceP==TAMANIO) indiceP=0;
        numeroLlenos++;
        numeroVacios--;
    }

    public synchronized int obtener() {
        int dato = -1;
        if (numeroLlenos > 0) {
            dato = datos[indiceC];
            indiceC++;
            if (indiceC == TAMANIO) indiceC = 0;
            numeroLlenos--;
            numeroVacios++;
        }
        return dato;
    }

    public synchronized boolean isVacio(){
        //boolean vacio;
        //if (numeroVacios==0) vacio=true;
        // else vacio = false;
        return numeroVacios==TAMANIO; // CUANDO ES EL NUMERO DE TAMANO ES EL TAMANO DEL ARRAY
    }

    public synchronized boolean isLleno(){
        return numeroLlenos==TAMANIO;
    }
}
