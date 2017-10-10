// REVISAR

import javax.swing.*;

public class BufferCircular {
    public static void main(String[] args) {
        CBuffer buffer = new CBuffer();
        Consumidor c = new Consumidor(buffer);
        Productor p = new Productor(buffer);
        c.start();
        p.start();
        JOptionPane.showMessageDialog(null,"Welcome","welcome",JOptionPane.INFORMATION_MESSAGE);


    }
}
