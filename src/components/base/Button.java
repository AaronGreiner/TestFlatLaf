package components.base;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import org.jdesktop.swingx.JXButton;

public class Button extends JXButton
{
    public Button()
    {

    }

    public Button(String text)
    {
        setText(text);
    }

    public Button(String iconName, String tooltipText)
    {
        setToolTipText(tooltipText);
        FlatSVGIcon icon = new FlatSVGIcon("ressources/icons/" + iconName + ".svg");
        setIcon(icon);
    }
}
