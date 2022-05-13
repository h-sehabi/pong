import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App extends frame implements KeyListener{
  private frame frame;

  public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();

    switch(key) {
        case KeyEvent.VK_W:
            panel.movePlayer('U', 1);
            break;
        case KeyEvent.VK_S:
            panel.movePlayer('D', 1);
            break;
        case KeyEvent.VK_UP:
            panel.movePlayer('U', 2);
            break;
        case KeyEvent.VK_DOWN:
            panel.movePlayer('D', 2);
            break;
    }
}

public void keyReleased(KeyEvent e) {

}

public void keyTyped(KeyEvent e) {

}


public App() {
  this.frame = new frame();
  addKeyListener(this);
  setFocusable(true);
}
  public static void main(String[] args) {
    App f = new App();
    f.startGame();
  }
}