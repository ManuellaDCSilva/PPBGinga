/**
 * The ErrorCorrectionLevel class implements the object that represents the
 * error correction level from the QRCode.
 * 
 * @author Manuella D. C. Silva (manuellablablau@gmail.com)
 * @version 0.0.1
 */

public class ErrorCorrectionLevel {

	public static final int L = 1;// 1
	public static final int M = 2;// 2
	public static final int Q = 3;// 3
	public static final int H = 4;// 4

	public final int bits;

	/**
	 * Constructs a ErrorCorrectionLevel with the appropriated QRCode error
	 * correction level.
	 * 
	 * @param eccLevel
	 *            - a int representing the error correction level.
	 */
	ErrorCorrectionLevel(int eccLevel) {
		this.bits = eccLevel;
	}

	/**
	 * Returns a number representing the error correction level.
	 * 
	 * @return a int representing the error correction level.
	 */
	public int getBits() {
		return bits;
	}

}
