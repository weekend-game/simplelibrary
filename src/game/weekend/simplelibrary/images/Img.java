package game.weekend.simplelibrary.images;

import javax.swing.ImageIcon;

/**
 * Working with images.
 */
public class Img {

	/**
	 * The class contains only static methods and there is no need to create object.
	 */
	private Img() {
	}

	/**
	 * Get ImageIcon.
	 * 
	 * @param icon one of the values ​​of the Icons enumeration.
	 * 
	 * @return ImageIcon.
	 */
	public static ImageIcon getImageIcon(Icons icon) {
		String fileName = icon.toString().toLowerCase() + ".gif";
		return new ImageIcon(Img.class.getResource(fileName));
	}

}
