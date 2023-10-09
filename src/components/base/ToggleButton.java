package components.base;

import com.formdev.flatlaf.extras.FlatSVGIcon;

import javax.swing.*;

public class ToggleButton extends JToggleButton
{
    public ToggleButton()
    {

    }

    public ToggleButton(String text)
    {
        setText(text);
    }

    public ToggleButton(String iconName, String tooltipText)
    {
        setToolTipText(tooltipText);
        FlatSVGIcon icon = new FlatSVGIcon("ressources/icons/" + iconName + ".svg");
        setIcon(icon);
    }
}
