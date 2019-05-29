package test;

public class OSUtils {

	
	public static boolean isWindows() {
		return System.getProperty("os.name").toLowerCase().contains("win");
	}
	
	public static String modifyNameForWindows(String name) {
		if(isWindows()) {
			return name+".exe";
		}else{
			return name;
		}
		
	}
	
}
