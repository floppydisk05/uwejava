/**
 * This class contains easy to use input methods as described in the the text book "Java - The First Semester" by Quentin Charatan and Aaron Kan.
 * 
 * For convenience, the class has been moved into the "uwejava" package, so you must put the following line at the start of every program that uses it:
 * <pre>import uwejava.*;</pre>
 * 
 * Note that you must not/cannot create any objects of this class, so a typical method call has the form:
 * <pre>String s = EasyIn.getString ();</pre>
 * @author Nick H.
 * @author Frankie B.
 */

package uwejava;
import java.io.*;

public abstract class EasyIn extends java.lang.Object{
	static String s = new String();
	static byte[] b = new byte[512];
	static int bytesRead = 0;

	/**
	 * Get a complete line of input from the keyboard and return it as a String value.
	 * @return String
	 */
	public static String getString() {
		boolean ok = false;
		while (!ok) {
	  try {
		bytesRead = System.in.read(b);
		s = new String(b, 0, bytesRead - 1);
		s = s.trim();
		ok = true;
	  } catch (IOException e) {
		System.out.println(e.getMessage());
	  }
	}
		return s;
	}

	/**
	 * Read a number from the keyboard and return it as an int value.
	 * @return int
	 */
	public static int getInt() {
		int i = 0;
		boolean ok = false;
		while (!ok) {
			try {
				bytesRead = System.in.read(b);
				s = new String(b, 0, bytesRead - 1);
				i = Integer.parseInt(s.trim());
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Make sure you enter an integer");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return i;
	}

	/**
	 * Reads a small number from the keyboard and returns it as a byte (8 bit) value.
	 * @return byte
	 */
	public static byte getByte() {
		byte i = 0;
		boolean ok = false;
		while (!ok) {
			try {
				bytesRead = System.in.read(b);
				s = new String(b, 0, bytesRead - 1);
				i = Byte.parseByte(s.trim());
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Make sure you enter a byte");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return i;
	}

	/**
	 * Read a number from the keyboard and returns it as a short integer (16 bit) value.
	 * @return short
	 */
	public static short getShort() {
		short i = 0;
		boolean ok = false;
		while (!ok) {
			try {
				bytesRead = System.in.read(b);
				s = new String(b, 0, bytesRead - 1);
				i = Short.parseShort(s.trim());
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Make sure you enter a short integer");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return i;
	}

	/**
	 * Read a number from the keyboard and returns it as a long integer (64 bit) value.
	 * @return long
	 */
	public static long getLong() {
		long l = 0;
		boolean ok = false;
		while (!ok) {
			try {
				bytesRead = System.in.read(b);
				s = new String(b, 0, bytesRead - 1);
				l = Long.parseLong(s.trim());
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Make surre you enter a long integer");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return l;
	}

	/**
	 * Read a floating point number from the keyboard and returns it as a double value.
	 * @return double
	 */
	public static double getDouble() {
		double d = 0;
		boolean ok = false;
		while (!ok) {
			try {
				bytesRead = System.in.read(b);
				s = new String(b, 0, bytesRead - 1);
				d = (Double.valueOf(s.trim())).doubleValue();
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Make sure you enter a decimal number");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return d;
	}

	/**
	 * Read a floating point number from the keyboard and returns it as a float value.
	 * @return float
	 */
	public static float getFloat() {
		float f = 0;
		boolean ok = false;
		while (!ok) {
			try {
				bytesRead = System.in.read(b);
				s = new String(b, 0, bytesRead - 1);
				f = (Float.valueOf(s.trim())).floatValue();
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Make sure you enter a decimal number");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return f;
	}

	/**
	 * Read a single character from the keyboard and return it as a char value.
	 * @return char
	 */
	public static char getChar() {
		char c = ' ';
		boolean ok = false;
		while (!ok) {
			try {
				bytesRead = System.in.read(b);
				s = new String(b, 0, bytesRead - 1);
				if (s.trim().length() != 1) {
					System.out.println("Make sure you enter a single character");
				} else {
					c = s.trim().charAt(0);
					ok = true;
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return c;
	}

	/**
	 * Wait until the user presses [return].
	 */
	public static void pause() {
		boolean ok = false;
		while (!ok) {
			try {
				System.in.read(b);
				ok = true;
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	/**
	 * Write the specified message and wait until the user presses [return].
	 * @param messageIn
	 */
	public static void pause(String messageIn) {
		boolean ok = false;
		while (!ok) {
			try {
				System.out.print(messageIn);
				System.in.read(b);
				ok = true;
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
