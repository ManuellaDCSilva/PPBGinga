/**
 * The Version class implements the object that represents the Version from the
 * QRCode. In addition, this class contains a set of information associated with
 * QRCode's version..
 * 
 * @author Manuella D. C. Silva (manuellablablau@gmail.com)
 * @version 0.0.1
 */

public class Version {

	/**
	 * Number of remainder bits added at final of blocks
	 */
	public static final int[] remainderBits = { 0, 7, 7, 7, 7, 7, 0, 0, 0, 0,
			0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3,
			3, 3, 0, 0, 0, 0, 0, 0 };

	/**
	 * Number of codewords (blocks from 8 bits) per version
	 */
	public static final int[] dataCapacityCodewords = { 26, 44, 70, 100, 134,
			172, 196, 242, 292, 346, 404, 466, 532, 581, 655, 733, 815, 901,
			991, 1085, 1156, 1258, 1364, 1474, 1588, 1706, 1828, 1921, 2051,
			2185, 2323, 2465, 2611, 2761, 2876, 3034, 3196, 3362, 3532, 3706 };

	/**
	 * Number of capacity data bits per version
	 */
	public static final int[][] dataCapacityBits = { { 152, 128, 104, 72 },
			{ 272, 224, 176, 128 }, { 440, 352, 272, 208 },
			{ 640, 512, 384, 288 }, { 864, 688, 496, 368 },
			{ 1088, 864, 608, 480 }, { 1248, 992, 704, 528 },
			{ 1552, 1232, 880, 688 }, { 1856, 1456, 1056, 800 },
			{ 2192, 1728, 1232, 976 }, { 2592, 2032, 1440, 1120 },
			{ 2960, 2320, 1648, 1264 }, { 3424, 2672, 1952, 1440 },
			{ 3688, 2920, 2088, 1576 }, { 4184, 3320, 2360, 1784 },
			{ 4712, 3624, 2600, 2024 }, { 5176, 4056, 2936, 2264 },
			{ 5768, 4504, 3176, 2504 }, { 6360, 5016, 3560, 2728 },
			{ 6888, 5352, 3880, 3080 }, { 7456, 5712, 4096, 3248 },
			{ 8048, 6256, 4544, 3536 }, { 8752, 6880, 4912, 3712 },
			{ 9392, 7312, 5312, 4112 }, { 10208, 8000, 5744, 4304 },
			{ 1096, 8496, 6032, 4768 }, { 11744, 9024, 6464, 5024 },
			{ 12248, 9544, 6968, 5288 }, { 13048, 10136, 7288, 5608 },
			{ 1388, 10984, 7880, 5960 }, { 14744, 11640, 8264, 6344 },
			{ 1564, 12328, 8920, 6760 }, { 16568, 13048, 9368, 7208 },
			{ 17528, 13800, 9848, 7688 }, { 18448, 14496, 10288, 7888 },
			{ 19472, 15312, 10832, 8432 }, { 20528, 15936, 11408, 8768 },
			{ 21616, 16816, 12016, 9136 }, { 22496, 17728, 12656, 9776 },
			{ 23648, 18672, 13328, 10208 } };

	/**
	 * Maximun capacity of characters at this version and ECLevel in numeric
	 * mode.
	 */
	public static final int[][] dataCapacityNumeric = { { 41, 34, 27, 17 },
			{ 77, 63, 48, 34 }, { 127, 101, 77, 58 }, { 187, 149, 111, 82 },
			{ 255, 202, 144, 106 }, { 322, 255, 178, 139 },
			{ 370, 293, 207, 154 }, { 461, 365, 259, 202 },
			{ 552, 432, 312, 235 }, { 652, 513, 364, 288 },
			{ 772, 604, 427, 331 }, { 883, 691, 489, 374 },
			{ 1022, 796, 580, 427 }, { 1101, 871, 621, 468 },
			{ 125, 991, 703, 530 }, { 1408, 1082, 775, 602 },
			{ 1548, 1212, 876, 674 }, { 1725, 1346, 948, 746 },
			{ 1903, 15, 1063, 813 }, { 2061, 16, 1159, 919 },
			{ 2232, 1708, 1224, 969 }, { 2409, 1872, 1358, 1056 },
			{ 262, 2059, 1468, 1108 }, { 2812, 2188, 1588, 1228 },
			{ 3057, 2395, 1718, 1286 }, { 3283, 2544, 1804, 1425 },
			{ 3514, 2701, 1933, 1501 }, { 3669, 2857, 2085, 1581 },
			{ 3909, 3035, 2181, 1677 }, { 4158, 3289, 2358, 1782 },
			{ 4417, 3486, 2473, 1897 }, { 4686, 3693, 267, 2022 },
			{ 4965, 3909, 2805, 2157 }, { 5253, 4134, 2949, 2301 },
			{ 5529, 4343, 3081, 2361 }, { 5836, 4588, 3244, 2524 },
			{ 6153, 4775, 3417, 2625 }, { 6479, 5039, 3599, 2735 },
			{ 6743, 5313, 3791, 2927 }, { 7089, 5596, 3993, 3057 } };

	/**
	 * Maximun capacity of characters at this version and ECLevel in
	 * alphanumeric mode.
	 */
	public static final int[][] dataCapacityAlphaNumeric = {
			{ 25, 20, 16, 10 }, { 47, 38, 29, 20 }, { 77, 61, 47, 35 },
			{ 114, 90, 67, 50 }, { 154, 122, 87, 64 }, { 195, 154, 108, 84 },
			{ 224, 178, 125, 93 }, { 279, 221, 157, 122 },
			{ 335, 262, 189, 143 }, { 395, 311, 221, 174 },
			{ 468, 366, 259, 200 }, { 535, 419, 296, 227 },
			{ 619, 483, 352, 259 }, { 667, 528, 376, 283 },
			{ 758, 600, 426, 321 }, { 854, 656, 470, 365 },
			{ 938, 734, 531, 408 }, { 1046, 816, 574, 452 },
			{ 1153, 909, 644, 493 }, { 1249, 970, 702, 557 },
			{ 1352, 1035, 742, 587 }, { 146, 1134, 823, 640 },
			{ 1588, 1248, 890, 672 }, { 1704, 1326, 963, 744 },
			{ 1853, 1451, 1041, 779 }, { 199, 1542, 1094, 864 },
			{ 2132, 1637, 1172, 910 }, { 2223, 1732, 1263, 958 },
			{ 2369, 1839, 1322, 1016 }, { 252, 1994, 1429, 108 },
			{ 2677, 2113, 1499, 115 }, { 284, 2238, 1618, 1226 },
			{ 3009, 2369, 17, 1307 }, { 3183, 2506, 1787, 1394 },
			{ 3351, 2632, 1867, 1431 }, { 3537, 278, 1966, 153 },
			{ 3729, 2894, 2071, 1591 }, { 3927, 3054, 2181, 1658 },
			{ 4087, 322, 2298, 1774 }, { 4296, 3391, 242, 1852 } };

	/**
	 * Maximun capacity of characters at this version and ECCLevel in 8-bit
	 * mode.
	 */
	public static final int[][] dataCapacity8Bit = { { 17, 14, 11, 7 },
			{ 32, 26, 20, 14 }, { 53, 42, 32, 24 }, { 78, 62, 46, 34 },
			{ 106, 84, 60, 44 }, { 134, 106, 74, 58 }, { 154, 122, 86, 64 },
			{ 192, 152, 108, 84 }, { 230, 180, 130, 98 },
			{ 271, 213, 151, 119 }, { 321, 251, 177, 137 },
			{ 367, 287, 203, 155 }, { 425, 331, 241, 177 },
			{ 458, 362, 258, 194 }, { 520, 412, 292, 220 },
			{ 586, 450, 322, 250 }, { 644, 504, 364, 280 },
			{ 718, 560, 394, 310 }, { 792, 624, 442, 338 },
			{ 858, 666, 482, 382 }, { 929, 711, 509, 403 },
			{ 1003, 779, 565, 439 }, { 1091, 857, 611, 461 },
			{ 1171, 911, 661, 511 }, { 1273, 997, 715, 535 },
			{ 1367, 1059, 751, 593 }, { 1465, 1125, 805, 625 },
			{ 1528, 119, 868, 658 }, { 1628, 1264, 908, 698 },
			{ 1732, 137, 982, 742 }, { 184, 1452, 103, 790 },
			{ 1952, 1538, 1112, 842 }, { 2068, 1628, 1168, 898 },
			{ 2188, 1722, 1228, 958 }, { 2303, 1809, 1283, 983 },
			{ 2431, 1911, 1351, 1051 }, { 2563, 1989, 1423, 1093 },
			{ 2699, 2099, 1499, 1139 }, { 2809, 2213, 1579, 1219 },
			{ 2953, 2331, 1663, 1273 } };

	/**
	 * Maximun capacity of characters at this version and ECCLevel in kanji
	 * mode.
	 */
	public static final int[][] dataCapacityKanji = { { 10, 8, 7, 4 },
			{ 20, 16, 12, 8 }, { 32, 26, 20, 15 }, { 48, 38, 28, 21 },
			{ 65, 52, 37, 27 }, { 82, 65, 45, 36 }, { 95, 75, 53, 39 },
			{ 118, 93, 66, 52 }, { 141, 111, 80, 60 }, { 167, 131, 93, 74 },
			{ 198, 155, 109, 85 }, { 226, 177, 125, 96 },
			{ 262, 204, 149, 109 }, { 282, 223, 159, 120 },
			{ 320, 254, 180, 136 }, { 361, 277, 198, 154 },
			{ 397, 310, 224, 173 }, { 442, 345, 243, 191 },
			{ 488, 384, 272, 208 }, { 528, 410, 297, 235 },
			{ 572, 438, 314, 248 }, { 618, 480, 348, 270 },
			{ 672, 528, 376, 284 }, { 721, 561, 407, 315 },
			{ 784, 614, 440, 330 }, { 842, 652, 462, 365 },
			{ 902, 692, 496, 385 }, { 940, 732, 534, 405 },
			{ 1002, 778, 559, 430 }, { 1066, 843, 604, 457 },
			{ 1132, 894, 634, 486 }, { 1201, 947, 684, 518 },
			{ 1273, 1002, 719, 553 }, { 1347, 106, 756, 590 },
			{ 1417, 1113, 790, 605 }, { 1496, 1176, 832, 647 },
			{ 1577, 1224, 876, 673 }, { 1661, 1292, 923, 701 },
			{ 1729, 1362, 972, 750 }, { 1817, 1435, 1024, 784 } };

	/**
	 * Data code blocks information for each version and ECLevel. There are
	 * divided into four parts, the 1st and 3rd indicates the number of blocks
	 * with the length of the 2nd and 4th information, respectively. And these
	 * two indicates the length of error correction code per data codewords.
	 */
	public static final int[][][] numberOfDataCodewords = {
			{ { 1, 19, 0, 0 }, { 1, 16, 0, 0 }, { 1, 13, 0, 0 }, { 1, 9, 0, 0 } },
			{ { 1, 34, 0, 0 }, { 1, 28, 0, 0 }, { 1, 22, 0, 0 },
					{ 1, 16, 0, 0 } },
			{ { 1, 55, 0, 0 }, { 1, 44, 0, 0 }, { 2, 17, 0, 0 },
					{ 2, 13, 0, 0 } },
			{ { 1, 80, 0, 0 }, { 2, 32, 0, 0 }, { 2, 24, 0, 0 }, { 4, 9, 0, 0 } },
			{ { 1, 108, 0, 0 }, { 2, 43, 0, 0 }, { 2, 15, 2, 16 },
					{ 2, 11, 2, 12 } },
			{ { 2, 68, 0, 0 }, { 4, 27, 0, 0 }, { 4, 19, 0, 0 },
					{ 4, 15, 0, 0 } },
			{ { 2, 78, 0, 0 }, { 4, 31, 0, 0 }, { 2, 14, 4, 15 },
					{ 4, 13, 1, 14 } },
			{ { 2, 97, 0, 0 }, { 2, 38, 2, 39 }, { 4, 18, 2, 19 },
					{ 4, 14, 2, 15 } },
			{ { 2, 116, 0, 0 }, { 3, 36, 2, 37 }, { 4, 16, 4, 17 },
					{ 4, 12, 4, 13 } },
			{ { 2, 68, 2, 69 }, { 4, 43, 1, 44 }, { 6, 19, 2, 20 },
					{ 6, 15, 2, 16 } },
			{ { 4, 81, 0, 0 }, { 1, 50, 4, 51 }, { 4, 22, 4, 23 },
					{ 3, 12, 8, 13 } },
			{ { 2, 92, 2, 93 }, { 6, 36, 2, 37 }, { 4, 20, 6, 21 },
					{ 7, 14, 4, 15 } },
			{ { 4, 107, 0, 0 }, { 8, 37, 1, 38 }, { 8, 20, 4, 21 },
					{ 12, 11, 4, 12 } },
			{ { 3, 115, 1, 116 }, { 4, 40, 5, 41 }, { 11, 16, 5, 17 },
					{ 11, 12, 5, 13 } },
			{ { 5, 87, 1, 88 }, { 5, 41, 5, 42 }, { 5, 24, 7, 25 },
					{ 11, 12, 7, 13 } },
			{ { 5, 98, 1, 99 }, { 7, 45, 3, 46 }, { 15, 19, 2, 20 },
					{ 3, 15, 13, 16 } },
			{ { 1, 107, 5, 108 }, { 10, 46, 1, 47 }, { 1, 22, 15, 23 },
					{ 2, 14, 17, 15 } },
			{ { 5, 120, 1, 121 }, { 9, 43, 4, 44 }, { 17, 22, 1, 23 },
					{ 2, 14, 19, 15 } },
			{ { 3, 113, 4, 114 }, { 3, 44, 11, 45 }, { 17, 21, 4, 22 },
					{ 9, 13, 16, 14 } },
			{ { 3, 107, 5, 108 }, { 3, 41, 13, 42 }, { 15, 24, 5, 25 },
					{ 15, 15, 10, 16 } },
			{ { 4, 116, 4, 117 }, { 17, 42, 0, 0 }, { 17, 22, 6, 23 },
					{ 19, 16, 6, 17 } },
			{ { 2, 111, 7, 112 }, { 17, 46, 0, 0 }, { 7, 24, 16, 25 },
					{ 34, 13, 0, 0 } },
			{ { 4, 121, 5, 122 }, { 4, 47, 14, 48 }, { 11, 24, 14, 25 },
					{ 16, 15, 14, 16 } },
			{ { 6, 117, 4, 118 }, { 6, 45, 14, 46 }, { 11, 24, 16, 25 },
					{ 30, 16, 2, 17 } },
			{ { 8, 106, 4, 107 }, { 8, 47, 13, 48 }, { 7, 24, 22, 25 },
					{ 22, 15, 13, 16 } },
			{ { 10, 114, 2, 115 }, { 19, 46, 4, 47 }, { 28, 22, 6, 23 },
					{ 33, 16, 4, 17 } },
			{ { 8, 122, 4, 123 }, { 22, 45, 3, 46 }, { 8, 23, 26, 24 },
					{ 12, 15, 28, 16 } },
			{ { 3, 117, 10, 118 }, { 3, 45, 23, 46 }, { 4, 24, 31, 25 },
					{ 11, 15, 31, 16 } },
			{ { 7, 116, 7, 117 }, { 21, 45, 7, 46 }, { 1, 23, 37, 24 },
					{ 19, 15, 26, 16 } },
			{ { 5, 115, 10, 116 }, { 19, 47, 10, 48 }, { 15, 24, 25, 25 },
					{ 23, 15, 25, 16 } },
			{ { 13, 115, 3, 116 }, { 2, 46, 29, 47 }, { 42, 24, 1, 25 },
					{ 23, 15, 28, 16 } },
			{ { 17, 115, 0, 0 }, { 10, 46, 23, 47 }, { 10, 24, 35, 25 },
					{ 19, 15, 35, 16 } },
			{ { 17, 115, 1, 116 }, { 14, 46, 21, 47 }, { 29, 24, 19, 25 },
					{ 11, 15, 46, 16 } },
			{ { 13, 115, 6, 116 }, { 14, 46, 23, 47 }, { 44, 24, 7, 25 },
					{ 59, 16, 1, 17 } },
			{ { 12, 121, 7, 122 }, { 12, 47, 26, 48 }, { 39, 24, 14, 25 },
					{ 22, 15, 41, 16 } },
			{ { 6, 121, 14, 122 }, { 6, 47, 34, 48 }, { 46, 24, 10, 25 },
					{ 2, 15, 64, 16 } },
			{ { 17, 122, 4, 123 }, { 29, 46, 14, 47 }, { 49, 24, 10, 25 },
					{ 24, 15, 46, 16 } },
			{ { 4, 122, 18, 123 }, { 13, 46, 32, 47 }, { 48, 24, 14, 25 },
					{ 42, 15, 32, 16 } },
			{ { 20, 117, 4, 118 }, { 40, 47, 7, 48 }, { 43, 24, 22, 25 },
					{ 10, 15, 67, 16 } },
			{ { 19, 118, 6, 119 }, { 18, 47, 31, 48 }, { 34, 24, 34, 25 },
					{ 20, 15, 61, 16 } } };

	/**
	 * Error Correction code blocks information for each version and ECLevel.
	 */
	public static final int[][] numberofErrorCorrectionCodewords = {
			{ 7, 10, 13, 17 }, { 10, 16, 22, 28 }, { 15, 26, 18, 22 },
			{ 20, 18, 26, 16 }, { 26, 24, 18, 22 }, { 18, 16, 24, 28 },
			{ 20, 18, 18, 26 }, { 24, 22, 22, 26 }, { 30, 22, 20, 24 },
			{ 18, 26, 24, 28 }, { 20, 30, 24, 28 }, { 24, 22, 26, 28 },
			{ 26, 22, 24, 22 }, { 30, 24, 20, 24 }, { 22, 24, 30, 24 },
			{ 24, 28, 24, 30 }, { 28, 28, 28, 28 }, { 30, 26, 28, 28 },
			{ 28, 26, 26, 26 }, { 28, 26, 30, 28 }, { 28, 26, 28, 30 },
			{ 28, 28, 30, 24 }, { 30, 28, 30, 30 }, { 30, 28, 30, 30 },
			{ 26, 28, 30, 30 }, { 28, 28, 28, 30 }, { 30, 28, 30, 30 },
			{ 30, 28, 30, 30 }, { 30, 28, 30, 30 }, { 30, 28, 30, 30 },
			{ 30, 28, 30, 30 }, { 30, 28, 30, 30 }, { 30, 28, 30, 30 },
			{ 30, 28, 30, 30 }, { 30, 28, 30, 30 }, { 30, 28, 30, 30 },
			{ 30, 28, 30, 30 }, { 30, 28, 30, 30 }, { 30, 28, 30, 30 },
			{ 30, 28, 30, 30 } };

	public final int bits;

	public final int remainderBit;

	public final int[] maximunDataCapacityBits;

	public final int[] maximunDataCapacityCharacters;

	public final int[][] dataCodewordsCharacteristic;

	public final int[] errorCorrectioCodeWordsCharacteristic;

	/**
	 * Constructs a Version according to QRCode version number and the Mode.
	 * 
	 * @param number
	 *            - a int representing the QRCode version number.
	 * @param mode
	 *            - the Mode.
	 */
	public Version(int number, Mode mode) {
		this.bits = number;
		this.remainderBit = remainderBits[number - 1];
		this.maximunDataCapacityBits = dataCapacityBits[number - 1];
		this.dataCodewordsCharacteristic = numberOfDataCodewords[number - 1];
		this.errorCorrectioCodeWordsCharacteristic = numberofErrorCorrectionCodewords[number - 1];
		switch (mode.getIndicator()) {
		case Mode.NUMERIC:
			this.maximunDataCapacityCharacters = dataCapacityNumeric[number - 1];
			break;
		case Mode.ALPHANUMERIC:
			this.maximunDataCapacityCharacters = dataCapacityAlphaNumeric[number - 1];
			break;
		case Mode.EIGHT_BIT:
			this.maximunDataCapacityCharacters = dataCapacity8Bit[number - 1];
			break;
		case Mode.KANJI:
			this.maximunDataCapacityCharacters = dataCapacityKanji[number - 1];
			break;
		default:
			this.maximunDataCapacityCharacters = null;
			break;
		}
	}

	/**
	 * Returns the Remainder Bit to this Version.
	 * 
	 * @return a int representing the remainder bit.
	 */
	public int getRemainderBit() {
		return remainderBit;
	}

	/**
	 * Returns a int vector with all the Remainder Bits.
	 * 
	 * @return a int vector with the Remainder Bits.
	 */
	public static int[] getRemainderbits() {
		return remainderBits;
	}

	/**
	 * Returns a number representing the Version.
	 * 
	 * @return a int representing the version.
	 */
	public int getBits() {
		return bits;
	}

	/**
	 * Returns the maximun capacity of data bits per version.
	 * 
	 * @return a int vector containing the maximun capacity of data bits per
	 *         version.
	 */
	public int[] getMaximunDataCapacityBits() {
		return maximunDataCapacityBits;
	}

	/**
	 * Returns the maximun capacity of characters per version.
	 * 
	 * @return a int vector containing the maximun capacity of characters per
	 *         version.
	 */
	public int[] getMaximunDataCapacityCharacters() {
		return maximunDataCapacityCharacters;
	}

	/**
	 * Returns the number of Error Correction code blocks information for each
	 * version and ECLevel.
	 * 
	 * @return a int vector.
	 */
	public int[] getErrorCorrectionCodePerBlock() {
		return errorCorrectioCodeWordsCharacteristic;
	}

	/**
	 * Returns the Error Correction codewords information characteristics for
	 * each ECLevel.
	 * 
	 * @return a int bidimensional vector.
	 */
	public int[][] getDataCodewordsCharacteristic() {
		return dataCodewordsCharacteristic;
	}

	/**
	 * Returns the Error Correction codewords information characteristics for
	 * each ECLevel.
	 * 
	 * @return a int vector.
	 */
	public int[] getErrorCorrectioCodeWordsCharacteristic() {
		return errorCorrectioCodeWordsCharacteristic;
	}

}
