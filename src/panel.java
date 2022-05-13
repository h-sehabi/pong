import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class panel extends JPanel{

    private int WIDTH, HEIGHT, posX, posY, inc = 10, modX = rand(), modY = rand(), p1 = 50, p2 = 50, playerHeight = 120;


    panel(int width, int height) {
        WIDTH = width;
        HEIGHT = height;
        posX = WIDTH/2 - 10;
        posY = HEIGHT/2;
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        this.setBackground(Color.BLACK);

        g2d.setColor(Color.RED);
        g2d.drawString("COCK", posX, posY);

        g2d.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
        g2d.fillRect(5, p1, 10, playerHeight);
        g2d.fillRect(WIDTH - 15, p2, 10, playerHeight);
    }

    public void moveBall() {
        posX += modX;
        posY += modY;
        checkCollision();
    }

    public void movePlayer(char key, int player) {
        if(player == 2) {
            if(key == 'U') p2 -= 8;
            else if(key == 'D') p2 += 8;
        }
        else if(player == 1) {
            if(key == 'U') p1 -= 8;
            else if(key == 'D') p1 += 8;
        }
    }


    private void checkCollision() {
        if(posY < 15 || posY > HEIGHT) modY = -modY;
        if(posX <= 17 && posY - p1 < playerHeight) modX = -modX;
        else if(posX <= 15) addPoint1();
        if(posX >= WIDTH - 17 && posY - p2 < playerHeight) modX = -modX;
        else if(posX >= WIDTH - 15) addPoint2();
    }

    private void addPoint1() {
        posX = WIDTH/2;
        posY = HEIGHT/2;
        modX = rand();
        modY = rand();
    }

    private void addPoint2() {
        posX = WIDTH/2;
        posY = HEIGHT/2;
        modX = rand();
        modY = rand();
    }

    private int rand() {
        if(Math.random() - 0.5 < 0) return -1;
        else return 1;
    }
    
}
