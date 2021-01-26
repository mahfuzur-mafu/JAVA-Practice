package javawebbrowser;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javaX.Swing.JFrame;
import javaX.Swing.WindowConstants;
 
 
public class Web {
 
    
    public static void main(String[] args) {
        
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        final JFXPanel fxpanel = new JFXPanel();
        frame.add(fxpanel);
       Platform.runLater(new Runnable()  {
            WebEngine engine;
            WebView wv = new WebView();
            engine = wv.getEngine();
            fxpanel.setScene(new Scene (wv));
            engine.load("https://www.facebook.com/mahade.forhad");
        });
        frame.setVisible(true);
    }
    
}