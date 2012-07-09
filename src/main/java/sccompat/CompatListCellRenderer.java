package sccompat;

import java.awt.*;
import javax.swing.*;

/** allows compilation on both java6 and java7 in spite of java7's newly generified swing classes */
public abstract class CompatListCellRenderer extends DefaultListCellRenderer {
	@Override
	public final Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		return erased(list, value, index, isSelected, cellHasFocus);
	}

	protected abstract Component erased(JComponent list, Object value, int index, boolean isSelected, boolean hasFocus);
	
	protected Component superErased(JComponent list, Object value, int index, boolean isSelected, boolean hasFocus) {
		return super.getListCellRendererComponent((JList)list, value, index, isSelected, hasFocus);
	}
	
	// public abstract void patch(JLabel target, JComponent list, Object value, int index, boolean isSelected, boolean cellHasFocus);
}
