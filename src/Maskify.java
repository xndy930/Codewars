public class Maskify {
	public static void main(String[] args) {
		
		String str = Maskify.maskify("4556364607935616");
		System.out.println(str);
		
	}
	
	public static String maskify(String str) {
		char[] ch = str.toCharArray();
		if(ch.length <= 4) {
			return str;
		}
		String string = "";
		for(int i=0;i<ch.length;i++) {
			if(i >= ch.length-4) {
				string+=ch[i];
				continue;
			}
			string+="#";
		}
		return string;
    }
}
