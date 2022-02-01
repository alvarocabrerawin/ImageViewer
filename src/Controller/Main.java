package Controller;

import imageviewer.controller.MainFrame;
import imageviewer.model.Image;
import imageviewer.persistence.FileImageLoader;
import java.io.File;



public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Imagen");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame(imageLoader);
        mainFrame.getImageDisplay().show(image);
        
    }
    
}
    

