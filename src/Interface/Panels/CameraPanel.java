package Interface.Panels;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;

import javax.swing.*;
import java.awt.*;

public class CameraPanel extends JPanel {

    public CameraPanel(Webcam w){
        WebcamPanel webcamPanel = new WebcamPanel(w);
        webcamPanel.setImageSizeDisplayed(true);
        this.add(webcamPanel);
    }

}
