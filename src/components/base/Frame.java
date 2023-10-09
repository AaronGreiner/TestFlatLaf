package components.base;

import com.formdev.flatlaf.extras.FlatInspector;
import com.formdev.flatlaf.util.SystemInfo;
import components.ToolbarButton;
import helper.ThemeManager;
import org.jdesktop.swingx.JXFrame;

import javax.swing.*;
import java.awt.*;

public class Frame extends JXFrame
{
    private Toolbar toolbar = new Toolbar();

    public Frame()
    {
        Init();
        TestUi();
    }

    public void TestUi()
    {
        ToggleButton dark = new ToggleButton("dark_mode", "Dark");
        dark.addActionListener(e -> ThemeManager.SetDarkMode());
        ToggleButton light = new ToggleButton("light_mode", "Light");
        light.addActionListener(e -> ThemeManager.SetLightMode());

        dark.setSelected(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(dark);
        bg.add(light);

        toolbar.add(new ToolbarButton("home", "Home"));

        toolbar.addSeparator();

        toolbar.add(new ToolbarButton("arrow_back", "Back"));
        toolbar.add(new ToolbarButton("arrow_forward", "Forward"));

        toolbar.addSeparator();

        toolbar.add(new ToolbarButton("new_window", "New"));
        toolbar.add(new ToolbarButton("create_new_folder", "New Folder"));

        toolbar.addSeparator();

        toolbar.add(new ToolbarButton("search", "Search"));

        toolbar.add( Box.createHorizontalGlue() );

        toolbar.add(dark);
        toolbar.add(light);

        toolbar.addSeparator();

        toolbar.add(new ToolbarButton("settings", "Settings"));

        getContentPane().add(toolbar, BorderLayout.NORTH);
    }

    private void Init()
    {
        ThemeManager.InitFrameProperties(this);

        setSize(500, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
