//import Interface.Panels.Graph.Serial.Interface.Panels.Graph.Serial;
//import com.fazecast.jSerialComm.SerialPort;

import Interface.Panels.Graph.Data;
import Interface.Panels.Graph.Serial;
import Interface.VisualInterface;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;

import javax.swing.*;

public class main {
    public static void main(String[] args) throws InterruptedException {
       //VisualInterface gui = new VisualInterface();

        SplashScreen splash = new SplashScreen();
        while (true){
            if(splash.getIsDone()==true) {
                GUIWindow gui1 = new GUIWindow();
                break;
            }
        }

//       Interface.Panels.Graph.Serial s = new Interface.Panels.Graph.Serial(1);
//       int t = 1;
//       while(t==1) {
//           System.out.println(s.getPitcb());
//       }
    }

}
