package programs;

public enum Enum {
	MALE("1"), FEMALE("2"), OTHERS("0");

	String val;

	Enum(String i) {
		val = i;
	}

	public static void main(String[] args) {
		for (Enum s : Enum.values()) {
			System.out.println(s + " " + s.val);

		}
		System.out.println(Enum.valueOf("MALE"));
		System.out.println(Enum.valueOf("MALE").ordinal());

	}

}
