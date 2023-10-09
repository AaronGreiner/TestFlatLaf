package helper;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.extras.FlatInspector;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.util.SystemInfo;
import components.base.Frame;

import javax.swing.*;
import java.awt.*;

public class ThemeManager
{
    private static final FlatDarkLaf darkLaf = new FlatDarkLaf();
    private static final FlatLightLaf lightLaf = new FlatLightLaf();

    public static void InitSystemProperties()
    {
        FlatInspector.install( "ctrl shift alt X" );

        if (SystemInfo.isMacOS)
        {
            System.setProperty("apple.laf.useScreenMenuBar", "true");
            System.setProperty("apple.awt.application.name", "TestFlatLaf");
            System.setProperty("apple.awt.application.appearance", "system");
        }
    }

    public static void InitFrameProperties(Frame frame)
    {
        if (SystemInfo.isMacFullWindowContentSupported)
        {
            frame.getRootPane().putClientProperty("apple.awt.fullWindowContent", true);
            frame.getRootPane().putClientProperty("apple.awt.transparentTitleBar", true);

            if (SystemInfo.isJava_17_orLater)
            {
                frame.getRootPane().putClientProperty("apple.awt.windowTitleVisible", false);
            }
        }
    }

    public static void InitSvgIconColors()
    {
        FlatSVGIcon.ColorFilter.getInstance()
                .add( Color.black, Color.darkGray, Color.lightGray );
    }

    public static void SetDarkMode()
    {
        SetMode(true);
    }

    public static void SetLightMode()
    {
        SetMode(false);
    }

    private static void SetMode(Boolean dark)
    {
        FlatAnimatedLafChange.showSnapshot();

        try {
            UIManager.setLookAndFeel(dark ? darkLaf : lightLaf);
        } catch( Exception ex ) {
            System.err.println(ex.getMessage());
        }

        FlatLaf.updateUI();
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
}
