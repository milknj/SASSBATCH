package co.th.kbtg.util;

public class StringUtils {

	/**
	 * Padding zero to right position
	 */
	public static String padZeroRight(String input, int padLength) {
		return padding(input, padLength, '0', true, true);
	}

	/**
	 * Padding zero to left position
	 */
	public static String padZeroLeft(String input, int padLength) {
		return padding(input, padLength, '0', false, true);
	}

	public static boolean isEmpty(String input) {
		if (input == null || input.equals("")) {
			return true;
		}
		return false;
	}
	
	public static String padding(String input, int padLength, char padChar, boolean isPadRight, boolean isCutOverPadded) {
		StringBuilder str = new StringBuilder();
		if (isEmpty(input)) {
			input = "";
		}
		str.append(input);
		if (str.length() < padLength) {
			while (str.length() < padLength) {
				if (isPadRight == true) {
					str.append(padChar);
				} else {
					str.insert(0, padChar);
				}
			}
		} else if (isCutOverPadded == true && str.length() > padLength) {
			if (isPadRight == true) {
				str.delete(padLength, str.length());
			} else {
				str.delete(0, str.length() - padLength);
			}
		}
		return str.toString();
	}
}	
