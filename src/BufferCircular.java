// REVISAR

public class BufferCircular {
    public static void main(String[] args) {
        CBuffer buffer = new CBuffer();
        Consumidor c = new Consumidor(buffer);
        Productor p = new Productor(buffer);
        c.start();
        p.start();


    }
}
