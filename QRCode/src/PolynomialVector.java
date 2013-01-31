/**
 * The PolynomialVector class implements a polynomial like a integer vector and
 * contains various methods for manipulating it.
 * 
 * @author Manuella D. C. Silva (manuellablablau@gmail.com)
 * @version 0.0.1
 */

public class PolynomialVector {

	private int vector[];
	private int length;

	/**
	 * Constructs a empty Polynomialvector with major exponent defined by the
	 * length argument.
	 * 
	 * @param lenght
	 */
	public PolynomialVector(int lenght) {
		this.length = lenght;
		this.vector = new int[lenght + 1];
	}

	/**
	 * Returns the vector containing all the elements in the vector.
	 * 
	 * @return a int vector
	 */
	public int[] getVector() {
		return vector;
	}

	/**
	 * Set a polynomial using a vector and yours index.
	 * 
	 * @param vector
	 *            - a int vector with the values
	 */
	public void setVector(int[] vector) {
		this.vector = vector;
	}

	/**
	 * Returns a element at the PolynomialVector with this exponent.
	 * 
	 * @param exponent
	 *            - a int representing the exponent of element.
	 * @return a element
	 */
	public int getTerm(int exponent) {
		if ((exponent <= length) && (exponent >= 0))
			return vector[exponent];
		else
			return -1;
	}

	/**
	 * Set a element at the PolynomialVector.
	 * 
	 * @param coefficient
	 *            - a int representing the element's coefficient.
	 * @param exponent
	 *            - a int representing the element's exponent.
	 */
	public void setTerm(int coefficient, int exponent) {
		vector[exponent] = coefficient;
	}

	/**
	 * Returns the number of elements at the PolynomialVector, your length.
	 * 
	 * @return the length of PolynomialVector.
	 */
	public int length() {
		return this.length;
	}

	/**
	 * Returns a clone of this PolynomialVector, i.e., a copy of the
	 * PolynomialVector.
	 * 
	 * @return a clone of this PolynomialVector.
	 */
	public PolynomialVector clone() {
		PolynomialVector result = new PolynomialVector(this.length);
		for (int i = 0; i <= this.length; i++) {
			result.setTerm(this.getTerm(i), i);
		}
		return result;
	}

	/**
	 * Returns a string representation of the PolynomialVector.
	 * 
	 * @return a String that represents the PolynomialVector.
	 */
	public String toString() {
		String result = "";
		for (int i = this.length; i >= 0; i--) {
			result += "a" + this.vector[i] + "x" + i + " + ";
		}
		return result;
	}

}
