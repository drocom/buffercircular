public class Productor extends Thread {
    private CBuffer buffer;
    private final int NMAX=5000;
    public Productor(CBuffer buffer){ // Le pasaremos cual es el BUFFER
        this.buffer=buffer;
    }
    public void run(){
        int n;
        while (true) {
            n=generarNumero();
            while (buffer.isLleno()) { // Puedo guardarlo. No está lleno //
                buffer.almacenar(n); // guardado
            }
        }
    }

    public int generarNumero(){
        return ((int) Math.random()*NMAX);
    }
}
