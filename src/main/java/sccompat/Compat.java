package sccompat;

import java.awt.*;
import javax.swing.*;

/** allows compilation on both java6 and java7 in spite of java7's newly generified swing classes */
@SuppressWarnings("unchecked") 
public final class Compat {
	public static void setComboBoxModel(JComboBox combo, ComboBoxModel model) {
		combo.setModel(model);
	} 
	
	public static JComboBox downcast(JComponent component) {
		return (JComboBox)component;
	} 
	
	public static void setListModel(JList list, ListModel model) {
		list.setModel(model);
	} 
	
	public static void setListCellRenderer(JList list, ListCellRenderer renderer) {
		list.setCellRenderer(renderer);
	}
	
	public static Color getSelectionForeground(JComponent list) {
		return ((JList)list).getSelectionForeground();
	}

	public static Color getSelectionBackground(JComponent list) {
		return ((JList)list).getSelectionBackground();
	}
}
