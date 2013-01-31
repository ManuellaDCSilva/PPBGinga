/**
 * The Mode class implements the object that represents the mode from the
 * QRCode.
 * 
 * @author Manuella D. C. Silva (manuellablablau@gmail.com)
 * @version 0.0.1
 */

public class Mode {

	public static final int NUMERIC = 1;// 1
	public static final int ALPHANUMERIC = 2;// 2
	public static final int EIGHT_BIT = 3;// 4
	public static final int KANJI = 4;// 8

	public static final int[][] numCharacterCountIndicator = { { 10, 12, 14 },
			{ 9, 11, 13 }, { 8, 16, 16 }, { 8, 10, 12 } };

	public final int[] characterCountBitsForVersions;

	public final int bits;

	public final int indicator;

	/**
	 * Constructs a Mode with the appropriated QRCode mode.
	 * 
	 * @param mode
	 *            - a int representing the mode.
	 */
	public Mode(int mode) {
		this.indicator = mode;
		this.bits = (int) Math.pow(2, (mode - 1));
		this.characterCountBitsForVersions = numCharacterCountIndicator[mode - 1];
	}

	/**
	 * Returns a number representing the mode.
	 * 
	 * @return a int representing the mode.
	 */
	public int getBits() {
		return this.bits;
	}

	/**
	 * Returns the mode indicator number.
	 * 
	 * @return a int representing the mode indicator.
	 */
	public int getIndicator() {
		return this.indicator;
	}

	/**
	 * Returns the appropriated character count bits according to the version.
	 * 
	 * @return the character count bits for version.
	 */
	public int[] getCharacterCountBitsForVersions() {
		return characterCountBitsForVersions;
	}

	/**
	 * Returns the appropriated character count indicator according to the version.
	 * 
	 * @param version - the Version.
	 * @return the character count indicator for version.
	 */
	public int getCharacterCountIndicator(int version) {
		if (version <= 9) {
			return getCharacterCountBitsForVersions()[0];
		} else if (version <= 26) {
			return getCharacterCountBitsForVersions()[1];
		} else {
			return getCharacterCountBitsForVersions()[2];
		}
	}

}
