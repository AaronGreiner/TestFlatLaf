package components.base;

import com.formdev.flatlaf.util.SystemInfo;

import javax.swing.*;
import java.awt.*;

public class Toolbar extends JToolBar
{
    public Toolbar()
    {
        if (SystemInfo.isMacOS)
        {
            setMargin(new Insets(3, 3, 3, 3));
            add( Box.createHorizontalStrut( 60 ), 0 );
        }
    }
}
