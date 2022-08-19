package bitmap.transformer;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BitMap {

    public String inputFilePath;
    public String outputFilePath;
    public String transformName;
    public int height;
    public int width;
    BufferedImage getImage = null;
    BufferedImage sendImage = null;

    public BitMap(String inputFilePath, String outputFilePath, String transformName) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
        this.transformName = transformName;
    }
    public void readFile() {
        try {
            File baldyImagePath = new File(inputFilePath);
            this.getImage = ImageIO.read(baldyImagePath);
            this.width = getImage.getWidth();
            this.height = getImage.getHeight();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("testing");
            System.exit(-1);
        }
    }

    public void writeFile(){
        try{
            ImageIO.write(sendImage, "bmp", new File(outputFilePath));
            } catch (IOException ioe){
            ioe.printStackTrace();
            System.exit(-1);
        }
    }
    public void greyScale(){
    int type = BufferedImage.TYPE_INT_RGB;
    sendImage = new BufferedImage(width, height, type);
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                Color setUpColor = new Color(getImage.getRGB(i,j));
                int r = setUpColor.getRed();
                int g = setUpColor.getGreen();
                int b = setUpColor.getBlue();
                int grey = (r + g + b)/3;
                Color newColor = new Color(grey, grey, grey);
                sendImage.setRGB(i,j,newColor.getRGB());
            }
        }
    }
    public void verticalReverse(){
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height/2; j++){
                int reverseVert = getImage.getRGB(i,j);
                this.getImage.setRGB(i,j,getImage.getRGB(i,this.getImage.getHeight()-j-1));
                this.getImage.setRGB(i,this.getImage.getHeight()-j-1, reverseVert);

            }
        }
    }
    public void greenScale(){
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                Color newColor = new Color(getImage.getRGB(i,j));
                int r = newColor.getRed();
                int g = newColor.getGreen();
                int b = newColor.getBlue();
                int a = newColor.getAlpha();
                Color green = new Color(0,g,0,a);
                this.getImage.setRGB(i,j,green.getRGB());
                sendImage.setRGB(i,j,newColor.getRGB());
            }
        }
    }

}

