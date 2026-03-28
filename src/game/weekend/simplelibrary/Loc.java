package game.weekend.simplelibrary;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Localization.
 */
public class Loc {

	/**
	 * The class contains only static methods and there is no need to create object.
	 */
	private Loc() {
	}

	/**
	 * Set the current UI language.
	 * 
	 * @param language current UI language.
	 */
	public static void setLanguage(String language) {
		try {
			Loc.language = language;
			bundle = ResourceBundle.getBundle("messages", new Locale(language));
		} catch (MissingResourceException ignored) {
		}
	}

	/**
	 * Get the current UI language.
	 * 
	 * @return current UI language.
	 */
	public static String getLanguage() {
		return language;
	}

	/**
	 * Get the localized string.
	 * 
	 * @param name string name.
	 * @return localized string.
	 */
	public static String get(String name) {
		if (bundle != null)
			try {
				return bundle.getString(name);
			} catch (MissingResourceException e) {
			}

		return getDefString(name);
	}

	private static String getDefString(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1).replace('_', ' ');
	}

	private static ResourceBundle bundle;
	private static String language;
}
