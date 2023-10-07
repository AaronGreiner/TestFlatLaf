package components.base;

import com.formdev.flatlaf.util.SystemInfo;
import org.jdesktop.swingx.JXFrame;

public class Frame extends JXFrame
{
    public Frame()
    {
        init();
    }

    private void init()
    {
        if (SystemInfo.isMacFullWindowContentSupported)
        {
            getRootPane().putClientProperty("apple.awt.fullWindowContent", true);
            getRootPane().putClientProperty("apple.awt.transparentTitleBar", true);

            if (SystemInfo.isJava_17_orLater)
            {
                getRootPane().putClientProperty("apple.awt.windowTitleVisible", false);
            }
        }

        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
