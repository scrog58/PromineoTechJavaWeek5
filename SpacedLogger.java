
public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
		StringBuilder SpacedLogger = new StringBuilder();
		String newWord = "";
		for(int i = 0; i < log.length(); i++) {
			SpacedLogger.append(log.charAt(i));
			SpacedLogger.append(" ");
		}
		newWord = SpacedLogger.toString();
		System.out.println(newWord);	
	}

	@Override
	public String LogTwo(String log, int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Error(String error) {
		StringBuilder SpacedLogger = new StringBuilder();
		String newWord = "";
		for(int i = 0; i < error.length(); i++) {
			SpacedLogger.append(error.charAt(i));
			SpacedLogger.append(" ");
		}
		newWord = SpacedLogger.toString();
		System.out.println("ERROR: "+newWord);
		
	}


}
