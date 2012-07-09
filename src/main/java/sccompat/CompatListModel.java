package sccompat;

import java.awt.*;
import javax.swing.*;

/** allows compilation on both java6 and java7 in spite of java7's newly generified swing classes */
public abstract class CompatListModel extends AbstractListModel {
	public final Object getElementAt(int index) {
		return erasedGetElementAt(index);
	}
	
	public abstract Object erasedGetElementAt(int index);
	public abstract int getSize();
}
