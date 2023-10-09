import components.base.Frame;
import helper.ThemeManager;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        ThemeManager.InitSystemProperties();
        ThemeManager.InitSvgIconColors();

        SwingUtilities.invokeLater(() ->
        {
            ThemeManager.SetDarkMode();

            Frame f = new Frame();
            f.setVisible(true);
        });
    }
}