package components;

import components.base.Button;

public class ToolbarButton extends Button
{
    public ToolbarButton(String text)
    {
        super(text);
    }

    public ToolbarButton(String iconName, String tooltipText)
    {
        super(iconName, tooltipText);
    }
}
