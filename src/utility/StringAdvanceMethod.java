package utility;

// Type your code

public class StringAdvanceMethod {
	private String input1;
	private String input2;

	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getInput2() {
		return input2;
	}

	public void setInput2(String input2) {
		this.input2 = input2;
	}

	public String concat(String a,String b) {
		return (a+b);
	}
	
	
	public String split(String str,String p) {
	  String[] data = str.split(p);
	  return data[0];
	}
	
	public int indexOf(String str,String b) {
		return str.indexOf(b);
	}
	
}