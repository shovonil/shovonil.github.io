import java.io.CharArrayReader;

public class solution{


	public static String replace(String input){

		if(input.length()<=1){
			return input;
		}

		if(input.charAt(0)=='p' && input.charAt(1)=='i'){

			int SmallOutput=replace(input.substring(2));
			return 3.14+SmallOutput;
		}else{
				int SmallOutput=replace(input.substring(1));
				return input.charAt(0)+SmallOutput;
		}
	}
}