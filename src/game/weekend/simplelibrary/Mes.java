package game.weekend.simplelibrary;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Messages.
 */
public class Mes {

	/**
	 * The class contains only static methods and there is no need to create object.
	 */
	private Mes() {
	}

	/**
	 * Set frame.
	 * 
	 * @param frame frame.
	 */
	public static void setJFrame(JFrame frame) {
		Mes.frame = frame;
	}

	/**
	 * Set the application name.
	 * 
	 * @param appName application name.
	 */
	public static void setAppName(String appName) {
		Mes.appName = appName;
	}

	/**
	 * Display an informational message.
	 * 
	 * @param message message text.
	 */
	public static void err(String message) {
		JOptionPane.showMessageDialog(frame, message, appName, JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Display an informational message.
	 * 
	 * @param message message text.
	 */
	public static void inf(String message) {
		JOptionPane.showMessageDialog(frame, message, appName, JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Display an informational message.
	 * 
	 * @param message message text.
	 * @param title   frame title.
	 */
	public static void inf(String message, String title) {
		JOptionPane.showMessageDialog(frame, message, title, JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Request confirmation.
	 * 
	 * @param message message text.
	 * 
	 * @return YES_OPTION, NO_OPTION, CANCEL_OPTION, OK_OPTION, CLOSED_OPTION.
	 */
	public static int conf(String message) {
		return JOptionPane.showConfirmDialog(frame, message, appName, JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.WARNING_MESSAGE);
	}

	private static JFrame frame;
	private static String appName;
}
