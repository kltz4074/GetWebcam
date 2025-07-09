package org.GetWebcam;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;

import javax.swing.JFrame;
import java.awt.Dimension;

public class Main {
    public static void main(String[] args) {
        Webcam webcam = Webcam.getDefault();

        // Set webcam resolution (optional)
        webcam.setViewSize(new Dimension(320, 240));

        // Create a webcam panel for real-time display
        WebcamPanel panel = new WebcamPanel(webcam);
        panel.setFPSDisplayed(true); // Show FPS on the panel
        panel.setDisplayDebugInfo(true); // Show debug info
        panel.setImageSizeDisplayed(true); // Show image size
        panel.setMirrored(true); // Mirror the image (optional)

        // Create a JFrame to display the webcam feed
        JFrame frame = new JFrame("Webcam Viewer");
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}