package tools;

public class Verbase {
	
	public final static int verbase = 2;
	
	public static void verbaseAtLevel(int level, String output){
		if(level >= verbase && output != null && !output.equals("")){
			System.out.println(output);
		}
	}
}
