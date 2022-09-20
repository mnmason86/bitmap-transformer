package bitmap.transformer;

import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) {
        if (args.length != 3){
            System.err.println("Argument missing");
            System.err.println("Usage: <input-file> <output-file> <transform-name>");
            System.exit(1);
        }
        try {
            String rootPath = System.getProperty("user.dir");
            String resourcePath = "";
            if (rootPath.endsWith("bitmap-transformer")) {
                resourcePath = "app\\src\\main\\resources\\";
            } else {
                resourcePath = "src\\main\\resources\\";
            }
            String inputFilePath = resourcePath + args[0],
                    outputFilePath = resourcePath + args[1],
                    transformName = args[2];
            BitMap alteredImage = new BitMap(inputFilePath, outputFilePath,
                    transformName);
            if (transformName.equals("grey-scale")) {
                alteredImage.readFile();
                alteredImage.greyScale();
            }
            if (transformName.equals("vertical-reverse")) {
                alteredImage.readFile();
                alteredImage.verticalReverse();
            }
            if (transformName.equals("green-scale")) {
                alteredImage.readFile();
                alteredImage.greenScale();
            }
            alteredImage.writeFile();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("File not found. Args provided: args[0]:" + args[0] + ", args[1]:" + args[1] + ", args[2]:" + args[2]);
        }
    }
}
