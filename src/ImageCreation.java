import javax.imageio.ImageIO;
import javax.naming.InsufficientResourcesException;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.awt.Color.*;

/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 11/03/13
 * Time: 22:13
 * To change this template use File | Settings | File Templates.
 */
public class ImageCreation {

    void Welcome(){
        Puts("Welcome To Matthew's Super Awesome Block Creator");
        Puts("Arguments required: X Coordinate | Y Coordinate | (red | green | blue) | Filename");
    }

    void Puts(String Text){
        //Writing System.out.println is tedious.
        //This isn't entirely clean code, but sod it.
        System.out.println(Text);
    }
    void CountArgs(String[] args){
        if (args.length == 0) {
           Puts("No arguments provided");
           Puts("Arguments required: X Coordinate | Y Coordinate | (red | green | blue)");
           System.exit(1);
        }
        if(args.length < 4){
            Puts("Insufficient arguments");
        }
    }
    void CreateRedImage(int xSize, int ySize, String FileName){
        BufferedImage bf = new BufferedImage(xSize, ySize, BufferedImage.TYPE_INT_RGB);
        Color color = new Color(255, 000, 000);
        Graphics g2d = bf.createGraphics();
        g2d.setColor(color);
        g2d.fillRect ( 0, 0, bf.getWidth(), bf.getHeight() );
        File f = new File(FileName + ".png");
        try {
            ImageIO.write(bf, "PNG", f);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
    void CreateBlueImage(int xSize, int ySize, String FileName){
        BufferedImage bf = new BufferedImage(xSize, ySize, BufferedImage.TYPE_INT_RGB);
        Color color = new Color(000, 000, 255);
        Graphics g2d = bf.createGraphics();
        g2d.setColor(color);
        g2d.fillRect ( 0, 0, bf.getWidth(), bf.getHeight() );
        File f = new File(FileName + ".png");
        try {
            ImageIO.write(bf, "PNG", f);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
    void CreateGreenImage(int xSize, int ySize, String FileName){
        BufferedImage bf = new BufferedImage(xSize, ySize, BufferedImage.TYPE_INT_RGB);
        Color color = new Color(000, 255, 000);
        Graphics g2d = bf.createGraphics();
        g2d.setColor(color);
        g2d.fillRect ( 0, 0, bf.getWidth(), bf.getHeight() );
        File f = new File(FileName + ".png");
        try {
            ImageIO.write(bf, "PNG", f);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

}
