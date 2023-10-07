import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.util.SystemInfo;
import components.base.Frame;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        if (SystemInfo.isMacOS)
        {
            System.setProperty("apple.laf.useScreenMenuBar", "true");
            System.setProperty("apple.awt.application.name", "TestFlatLaf");
            System.setProperty("apple.awt.application.appearance", "system");
        }

        SwingUtilities.invokeLater(() ->
        {
            FlatLightLaf.setup();

            Frame f = new Frame();
            f.setVisible(true);
        });
    }
}