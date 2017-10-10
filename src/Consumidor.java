public class Consumidor extends Thread {
    private CBuffer buffer;
    private final int NMAX=5000;
    public Consumidor(CBuffer buffer){ // Le pasaremos cual es el BUFFER
        this.buffer=buffer;
    }
    public void run(){
        int n;
        while (true) {
            n=generarNumero();
            while (buffer.isVacio()) { // Puedo guardarlo. No está lleno //
                buffer.almacenar(n); // guardado
            }
        }
    }

    public int generarNumero(){
        return ((int) Math.random()*NMAX);
    }
}