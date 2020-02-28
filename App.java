
public class App {

	public static void main(String[] args) {
		Logger AsteriskLogger = new AsteriskLogger();
		Logger SpacedLogger = new SpacedLogger();
		
		AsteriskLogger.Log("Hello");
		System.out.println("\n"+"--------------------------" + "\n");
		AsteriskLogger.Error("Hello");
		System.out.println("\n"+"--------------------------" + "\n");
		AsteriskLogger.Error("pneumonoultramicroscopicsilicovolcanoconiosis");

		
		SpacedLogger.Log("Hello");
		System.out.println("\n"+"--------------------------" + "\n");
		SpacedLogger.Error("Hello");
		
	}

}
