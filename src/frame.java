import java.awt.*;
import javax.swing.*;

public class frame extends JFrame{

    panel panel;

    frame() {

        panel = new panel(900, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

    }

    public void startGame() {
        for(;;) {
            panel.moveBall();
            panel.repaint();
            wait(5);
        }
    }

    public void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch(Exception e) {
        }
    }
}

