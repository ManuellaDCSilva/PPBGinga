/**
 * This class it's an abstraction of QRCode defined by ISO/IEC 18004:2000 (E),
 * implemented as a object with methods to access their elements.
 * 
 * @author Manuella D. C. Silva (manuellablablau@gmail.com)
 * @version 0.0.1
 */
public class QRCode {

	Mode mode;
	Version version;
	ErrorCorrectionLevel errorCorrectionLevel;
	String data;

	/**
	 * Constructs a QRCode object according to the parameters: version, mode, error correction level and data content.
	 * 
	 * @param version - the Version
	 * @param errorCorrectionLevel - the ErrorCorrectionLevel
	 * @param mode - the Mode
	 * @param data - a String containing the data content
	 */
	public QRCode(Version version, ErrorCorrectionLevel errorCorrectionLevel,
			Mode mode, String data) {
		this.mode = mode;
		this.version = version;
		this.errorCorrectionLevel = errorCorrectionLevel;
		this.data = data;
	}

	/**
	 * Returns the Mode of the QRCode.
	 * 
	 * @return a Mode.
	 */
	public Mode getMode() {
		return mode;
	}

	/**
	 * Set the Mode to QRCode.
	 * 
	 * @param mode - a Mode.
	 */
	public void setMode(Mode mode) {
		this.mode = mode;
	}

	/**
	 * Returns the Version of the QRCode.
	 * 
	 * @return the Version.
	 */
	public Version getVersion() {
		return version;
	}

	/**
	 * Set the Version to QRCode.
	 * 
	 * @param version - a Version.
	 */
	public void setVersion(Version version) {
		this.version = version;
	}

	/**
	 * Returns the ErrorCorrectionLevel of the QRCode.
	 * 
	 * @return the ErrorCorrectionLevel.
	 */
	public ErrorCorrectionLevel getErrorCorrectionLevel() {
		return errorCorrectionLevel;
	}

	/**
	 * Set the ErrorCorrectionLevel to QRCode.
	 * 
	 * @param errorCorrectionLevel - a ErrorCorrectionLevel.
	 */
	public void setErrorCorrectionLevel(
			ErrorCorrectionLevel errorCorrectionLevel) {
		this.errorCorrectionLevel = errorCorrectionLevel;
	}

	/**
	 * Returns the data content (the message) of the QRCode.
	 * 
	 * @return a String representing the message.
	 */
	public String getData() {
		return data;
	}

	/**
	 * Set a content to QRCode.
	 * 
	 * @param data - a String with data content.
	 */
	public void setData(String data) {
		this.data = data;
	}
	
}
