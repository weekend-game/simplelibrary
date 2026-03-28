package game.weekend.simplelibrary;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * Working with Look and feels.
 */
public class LaF {

	/** Default L&amp;F */
	public static String DEFAULT_LAF = "javax.swing.plaf.metal.MetalLookAndFeel";

	/**
	 * The class contains only static methods and there is no need to create object.
	 */
	private LaF() {
	}

	/**
	 * Set the specified L&amp;F.
	 * 
	 * @param className L&amp;F.
	 */
	public static void setLookAndFeel(String className) {
		try {
			UIManager.setLookAndFeel(className);

			for (Component c : components)
				SwingUtilities.updateComponentTreeUI(c);

			Proper.setProperty("LaF", className);
		} catch (Exception e) {
			setLookAndFeel(DEFAULT_LAF);
		}
	}

	/**
	 * Get current L&amp;F.
	 * 
	 * @return current L&amp;F.
	 */
	public static String getLookAndFeel() {
		return Proper.getProperty("LaF", DEFAULT_LAF);
	}

	/**
	 * Specify the list of components to update.
	 * 
	 * @param components list of components
	 */
	public static void setUpdateComponents(Component... components) {
		for (Component c : components)
			LaF.components.add(c);
	}

	/**
	 * Add component for renewal L&amp;F.
	 * 
	 * @param component component
	 */
	public static void addUpdateComponent(Component component) {
		components.add(component);
	}

	/**
	 * Delete component from list of components for L&amp;F renewal.
	 * 
	 * @param component component
	 */
	public static void removeUpdateComponent(Component component) {
		components.remove(component);
	}

	private static ArrayList<Component> components = new ArrayList<Component>();
}
