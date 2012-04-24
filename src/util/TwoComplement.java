package util;

public class TwoComplement {

	public static double to2complement(byte b) {
		if(b < 0)
			return (b + (short) 256);

		return b;
	}

	public static byte from2complement(double d) {
		if(d >= 255.0)
			return -1;

		if(d < 0.0)
			return 0;

		short s = (short) Math.round(d);
		if(s < 128)
			return (byte) s;

		return (byte) (s - 256);
	}
}
