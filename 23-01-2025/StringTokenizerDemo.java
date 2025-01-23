import java.util.*;
public class StringTokenizerDemo{
	public static void main(String[] args){
		String str = "Raju|24|30000:Tester_93299302|raju@gmail.com;Mumbai, India";

		StringTokenizer st = new StringTokenizer(str, "|:;_");

		int count = st.countTokens();
		
		for(int i = 0 ; i < count ; i++){
			System.out.println(st.nextToken());
		}		
	}
}