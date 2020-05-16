package utility;

// Type your code

public class StringMethod {

	private String string;
	
	public String getInput() {
		return string;
	}

	public void setInput(String string) {
		this.string = string;
	}

	public String lower(String str) {
		return str.toLowerCase();
	}

	public String upper(String str) {
		return str.toUpperCase();
	}

	public char firstCharacter(String str) {
		return str.charAt(0);
	}

	public int length(String str) {
		return str.length();
	}

	public String trim(String str) {
		return str.trim();
	}

}