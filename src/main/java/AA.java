import java.util.regex.*;
public class AA {
	public static void main(String[] args) {  
		String s = "aabbcc";
		String result=null;
		char [] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length-1;j++) {
				if(String.valueOf(c[i]).equals(String.valueOf(c[j]))){
					result=result+c[i];
					System.out.println(result);
				}
			}			
		}
		System.out.println((result.substring(result.length()-1)));
	}

}
