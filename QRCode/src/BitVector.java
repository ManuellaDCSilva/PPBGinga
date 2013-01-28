/**
 * The BitVector class implements a static bit vector and contains various
 * methods for manipulating a bit vector.
 * 
 * @author Manuella D. C. Silva (manuellablablau@gmail.com)
 * @version 0.0.1
 */

public class BitVector {

	private int vector[];
	private int offset;

	/**
	 * Constructs a empty BitVector and with initial capacity specified by the
	 * length argument.
	 * 
	 * @param length
	 *            - the capacity of bit elements divided by 32.
	 */
	public BitVector(int length) {
		this.offset = 0;
		this.vector = new int[length];
	}

	/**
	 * Return the vector of the object.
	 * 
	 * @return a int[] representing the vector.
	 */
	public int[] getVector() {
		return vector;
	}

	/**
	 * Returns the current offset index at the BitVector.
	 * 
	 * @return a int representing the index at the vector.
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * Appends the bit represented by a boolean to the sequence.
	 * 
	 * @param bit
	 *            - a boolean.
	 */
	public void appendBit(boolean bit) {
		if (bit) {
			this.vector[this.offset >> 5] |= 1 << (this.offset & 0x1F);
		}
		this.offset++;
	}

	/**
	 * Appends the value like a bit sequence.
	 * 
	 * @param value
	 *            - a int that represents the bit sequence.
	 * @param numBits
	 *            - the number that represents the bits sequence length.
	 */
	public void appendBits(int value, int numBits) {
		if (numBits < 0 || numBits > 32) {
			return;// TODO Exception Class
		}
		for (int numBitsLeft = numBits; numBitsLeft > 0; numBitsLeft--) {
			appendBit(((value >> (numBitsLeft - 1)) & 0x01) == 1);
		}
	}

	/**
	 * Returns the bit element at the specified position in this BitVector.
	 * 
	 * @param index
	 *            - index of element to return.
	 * @return a boolean value that represents the element at the specified
	 *         index.
	 */
	public boolean get(int index) {
		return (this.vector[index >> 5] & (1 << (index & 0x1F))) != 0;
	}

	/**
	 * Returns the element at the specified position in this BitVector.
	 * 
	 * @param index
	 *            - index of element to return.
	 * @return a int value that represents the element at the specified index.
	 */
	public int getBitWise(int index) {
		if (get(index)) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * Returns a int that represents a sequence of elements.
	 * 
	 * @param offset
	 *            - initial offset of the BitVector.
	 * @param count
	 *            - length of the BitVector.
	 * @return a int that contains the elements of the specified sequence of the
	 *         BitVector.
	 */
	public int getNBits(int offset, int count) {
		int i = 0;
		int bits = 0;
		int bit;
		while (i < count) {
			if (get(offset + i)) {
				bit = 1;
			} else {
				bit = 0;
			}

			bits += bit * Math.pow(2, count - i - 1);

			i++;
		}
		return bits;
	}

	/**
	 * Returns a string representation of the BitVector, i.e., the object
	 * represented textually.
	 * 
	 * @return a String that represents the BitVector.
	 */
	public String toString() {
		String result = "";
		for (int i = 0; i < this.offset; i++) {
			if ((i & 0x07) == 0) {
				result += "\n";
			}

			if (get(i)) {
				result += "1";
			} else {
				result += "0";
			}
		}
		return result;
	}
}
