package game.weekend.simplelibrary;

import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import game.weekend.simplelibrary.images.Icons;
import game.weekend.simplelibrary.images.Img;

/**
 * Typical AbstractAction for creating UI.
 */
public class TypicalActs {

	/**
	 * The class contains only a set of classes and there is no need to create an
	 * object.
	 */
	private TypicalActs() {
	}

	/**
	 * "New"
	 */
	@SuppressWarnings("serial")
	public static abstract class New extends AbstractAction {
		/**
		 * Создать Action "New".
		 */
		public New() {
			putValue(Action.NAME, Loc.get("new"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("create_new_file"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.New));
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		}
	}

	/**
	 * "Open..."
	 */
	@SuppressWarnings("serial")
	public static abstract class Open extends AbstractAction {
		/**
		 * Create Action "Open...".
		 */
		public Open() {
			putValue(Action.NAME, Loc.get("open") + "...");
			putValue(Action.SHORT_DESCRIPTION, Loc.get("open_file"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Open));
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		}
	}

	/**
	 * "Save"
	 */
	@SuppressWarnings("serial")
	public static abstract class Save extends AbstractAction {
		/**
		 * Create Action "Save".
		 */
		public Save() {
			putValue(Action.NAME, Loc.get("save"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("save_file"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Save));
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		}
	}

	/**
	 * "Save as..."
	 */
	@SuppressWarnings("serial")
	public static abstract class SaveAs extends AbstractAction {
		/**
		 * Create Action "Save as...".
		 */
		public SaveAs() {
			putValue(Action.NAME, Loc.get("save_as") + "...");
			putValue(Action.SHORT_DESCRIPTION, Loc.get("save_file_with_a_different_name"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Empty));
			putValue(Action.ACCELERATOR_KEY,
					KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK + InputEvent.SHIFT_DOWN_MASK));
		}
	}

	/**
	 * AbstractAction to open one of the previously opened files.
	 */
	@SuppressWarnings("serial")
	public static abstract class OpenFile extends AbstractAction {
		/**
		 * Create Action to open one of the previously opened files.
		 * 
		 * @param no   file number 1..N.
		 * @param name path and file name.
		 */
		public OpenFile(int no, String name) {
			putValue(Action.NAME, "" + no + " " + name);
			putValue(Action.SHORT_DESCRIPTION, name);
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Empty));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_0 + no);
		}
	}

	/**
	 * "Exit"
	 */
	@SuppressWarnings("serial")
	public static abstract class Exit extends AbstractAction {
		/**
		 * Create Action "Exit".
		 */
		public Exit() {
			putValue(Action.NAME, Loc.get("exit"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("exiting_the_program"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Empty));
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_DOWN_MASK));
		}
	}

	/**
	 * "Undo"
	 */
	@SuppressWarnings("serial")
	public static abstract class Undo extends AbstractAction {
		/**
		 * Create Action "Undo".
		 */
		public Undo() {
			putValue(Action.NAME, Loc.get("undo"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("undo_changes"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Empty));
			putValue(Action.ACCELERATOR_KEY,
					KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK));
		}
	}

	/**
	 * "Redo"
	 */
	@SuppressWarnings("serial")
	public static abstract class Redo extends AbstractAction {
		/**
		 * Redo Action "Redo".
		 */
		public Redo() {
			putValue(Action.NAME, Loc.get("redo"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("redo_changes"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Empty));
			putValue(Action.ACCELERATOR_KEY,
					KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, InputEvent.CTRL_DOWN_MASK));
		}
	}

	/**
	 * "Cut"
	 */
	@SuppressWarnings("serial")
	public static abstract class Cut extends AbstractAction {
		/**
		 * Create Action "Cut".
		 */
		public Cut() {
			putValue(Action.NAME, Loc.get("cut"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("cut_fragment"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Cut));
			putValue(Action.ACCELERATOR_KEY,
					KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
			setEnabled(false);
		}
	}

	/**
	 * "Copy"
	 */
	@SuppressWarnings("serial")
	public static abstract class Copy extends AbstractAction {
		/**
		 * Create Action "Copy".
		 */
		public Copy() {
			putValue(Action.NAME, Loc.get("copy"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("copy_fragment"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Copy));
			putValue(Action.ACCELERATOR_KEY,
					KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
			setEnabled(false);
		}
	}

	/**
	 * "Paste"
	 */
	@SuppressWarnings("serial")
	public static abstract class Paste extends AbstractAction {
		/**
		 * Create Action "Paste".
		 */
		public Paste() {
			putValue(Action.NAME, Loc.get("paste"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("paste_fragment"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Paste));
			putValue(Action.ACCELERATOR_KEY,
					KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
			setEnabled(false);
		}
	}

	/**
	 * "Select all"
	 */
	@SuppressWarnings("serial")
	public static abstract class SelectAll extends AbstractAction {
		/**
		 * Create Action "Select all".
		 */
		public SelectAll() {
			putValue(Action.NAME, Loc.get("select_all"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("select_all"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Empty));
			putValue(Action.ACCELERATOR_KEY,
					KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		}
	}

	/**
	 * "Find..."
	 */
	@SuppressWarnings("serial")
	public static abstract class Find extends AbstractAction {
		/**
		 * Create Action "Find...".
		 */
		public Find() {
			putValue(Action.NAME, Loc.get("find") + "...");
			putValue(Action.SHORT_DESCRIPTION, Loc.get("find..."));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Find));
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK));
		}
	}

	/**
	 * "Continue finding forward"
	 */
	@SuppressWarnings("serial")
	public static abstract class FindForward extends AbstractAction {
		/**
		 * Create Action "Continue finding forward".
		 */
		public FindForward() {
			putValue(Action.NAME, Loc.get("continue_finding_forward"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("continue_finding_forward"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.FindForward));
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK));
		}
	}

	/**
	 * "Continue finding backward"
	 */
	@SuppressWarnings("serial")
	public static abstract class FindBack extends AbstractAction {
		/**
		 * Create Action "Continue finding backward".
		 */
		public FindBack() {
			putValue(Action.NAME, Loc.get("continue_finding_backward"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("continue_finding_backward"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.FindBack));
			putValue(Action.ACCELERATOR_KEY,
					KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		}
	}

	/**
	 * "Replace..."
	 */
	@SuppressWarnings("serial")
	public static abstract class Replace extends AbstractAction {
		/**
		 * Create Action "Replace...".
		 */
		public Replace() {
			putValue(Action.NAME, Loc.get("replace") + "...");
			putValue(Action.SHORT_DESCRIPTION, Loc.get("replace_found_with_specified_string"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Replace));
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_DOWN_MASK));
		}
	}

	/**
	 * Установить указанный LaF.
	 */
	@SuppressWarnings("serial")
	public static class SetLaF extends AbstractAction {
		/**
		 * Create an Action to install the specified LaF.
		 * 
		 * @param lafi installed LaF.
		 */
		public SetLaF(UIManager.LookAndFeelInfo lafi) {
			this.lafi = lafi;
			putValue(Action.NAME, lafi.getName());
		}

		@Override
		public void actionPerformed(ActionEvent ae) {
			LaF.setLookAndFeel(lafi.getClassName());
		}

		/**
		 * Installed LaF.
		 */
		private UIManager.LookAndFeelInfo lafi;
	}

	/**
	 * "Show toolbar"
	 */
	@SuppressWarnings("serial")
	public static abstract class ToolbarOn extends AbstractAction {
		/**
		 * Create Action "Show toolbar".
		 */
		public ToolbarOn() {
			putValue(Action.NAME, Loc.get("show_toolbar"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("show_toolbar"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Empty));
		}
	}

	/**
	 * "Show status bar"
	 */
	@SuppressWarnings("serial")
	public static abstract class StatusbarOn extends AbstractAction {
		/**
		 * Create Action "Show status bar".
		 */
		public StatusbarOn() {
			putValue(Action.NAME, Loc.get("show_status_bar"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("show_status_bar"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Empty));
		}
	}

	/**
	 * "Russian"
	 */
	@SuppressWarnings("serial")
	public static class LanguageRU extends AbstractAction {
		/**
		 * Create Action "Russian".
		 */
		public LanguageRU() {
			putValue(Action.NAME, "Russian");
		}

		@Override
		public void actionPerformed(ActionEvent ae) {
			String prevLanguage = Proper.getProperty("Language", "en");
			Proper.setProperty("Language", "ru");
			if (!prevLanguage.equalsIgnoreCase("ru"))
				Mes.inf(Loc.get("restart_the_application"));
		}
	}

	/**
	 * "English"
	 */
	@SuppressWarnings("serial")
	public static class LanguageEN extends AbstractAction {
		/**
		 * Create Action "English".
		 */
		public LanguageEN() {
			putValue(Action.NAME, "English");
		}

		@Override
		public void actionPerformed(ActionEvent ae) {
			String prevLanguage = Proper.getProperty("Language", "en");
			Proper.setProperty("Language", "en");
			if (!prevLanguage.equalsIgnoreCase("en"))
				Mes.inf(Loc.get("restart_the_application"));
		}
	}

	/**
	 * "Use a monospaced font"
	 */
	@SuppressWarnings("serial")
	public static abstract class MonoFont extends AbstractAction {
		/**
		 * Create Action "Use a monospaced font".
		 */
		public MonoFont() {
			putValue(Action.NAME, Loc.get("use_monospaced_font"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("use_monospaced_font"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Empty));
		}
	}

	/**
	 * "Increase font size"
	 */
	@SuppressWarnings("serial")
	public static abstract class IncFontSize extends AbstractAction {
		/**
		 * Create Action "Increase font size".
		 */
		public IncFontSize() {
			putValue(Action.NAME, Loc.get("increase_font_size"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("increase_font_size"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Empty));
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, InputEvent.CTRL_DOWN_MASK));
		}
	}

	/**
	 * "Decrease font size"
	 */
	@SuppressWarnings("serial")
	public static abstract class DecFontSize extends AbstractAction {
		/**
		 * Создать Action "Decrease font size".
		 */
		public DecFontSize() {
			putValue(Action.NAME, Loc.get("decrease_font_size"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("decrease_font_size"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Empty));
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.CTRL_DOWN_MASK));
		}
	}

	/**
	 * "Default font size"
	 */
	@SuppressWarnings("serial")
	public static abstract class DefFontSize extends AbstractAction {
		/**
		 * Create Action "Default font size".
		 */
		public DefFontSize() {
			putValue(Action.NAME, Loc.get("default_font_size"));
			putValue(Action.SHORT_DESCRIPTION, Loc.get("default_font_size"));
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Empty));
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_DOWN_MASK));
		}
	}

	/**
	 * "About..."
	 */
	@SuppressWarnings("serial")
	public static abstract class About extends AbstractAction {
		/**
		 * Create Action "About...".
		 */
		public About() {
			putValue(Action.NAME, Loc.get("about") + "...");
			putValue(Action.SHORT_DESCRIPTION, Loc.get("about") + "...");
			putValue(Action.SMALL_ICON, Img.getImageIcon(Icons.Empty));
		}
	}
}
