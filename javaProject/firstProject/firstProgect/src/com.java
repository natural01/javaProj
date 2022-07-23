import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;

import javax.swing.*;

public class com extends JFrame {
    static{System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    System.out.print("version: " + Core.VERSION);}

    public static void main(String[] args) {
        JFrame window = new JFrame();
        JLabel screen = new JLabel();
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setVisible(true);

        Mat img = Imgcodecs.imread("src/img.png");

        Mat emptyImg = new Mat(img.size(), img.type());

        Mat kernal = new Mat(20, 20, CvType.CV_8UC1, new Scalar(1.0));

        MatOfByte buf = new MatOfByte();
        Imgcodecs.imencode(".png", emptyImg, buf);

        ImageIcon ic = new ImageIcon(buf.toArray());

        screen.setIcon(ic);
        window.getContentPane().add(screen);
        window.pack();
    }
}