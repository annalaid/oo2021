import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class MySmile {
    
    public static void main(String[] args) throws IOException {
        int width = 100;
        int height = 100;

        BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = picture.createGraphics();

        g.setColor(Color.PINK);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.BLACK);
        g.fillArc(0, 0, width, height, 0, 360);

        g.setColor(Color.YELLOW);
        //silmad ja nina
        g.fillOval(20, 20, 20, 20);
        g.fillOval(55, 20, 20, 20);
        g.fillOval(40, 50, 10, 10);
        //suu
        g.drawArc(20, 50, 60, 30, 0, -180);
        //kulmud
        g.drawArc(15, 13, 30, 10, 0, 180);
        g.drawArc(55, 13, 30, 10, 0, 180);

        ImageIO.write(picture, "png", new File("smile.png"));
    }
}
