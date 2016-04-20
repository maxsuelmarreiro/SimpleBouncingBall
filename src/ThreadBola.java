/**
 * Created by '-Maxsuel on 16/04/2016.
 */
public class ThreadBola extends Thread {

    private Bola bola;

    public ThreadBola(Bola bola) {
        this.bola = bola;
    }

    @Override
    public void run() {
        while (true) {
            bola.update();
            try {
                Thread.sleep(15);
            } catch (InterruptedException ex) {
            }
        }
    }

}
