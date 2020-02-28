
public class AsteriskLogger implements Logger {

	//4a
	@Override
	public void Log(String log) {
		StringBuilder a = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			a.append("*");
		}
		String newWord = a + log + a;
		System.out.println(newWord);
		
	}
	
	//4b
	public String LogTwo(String log, int num) {
		StringBuilder a = new StringBuilder();
		for(int i = 0; i < num; i++) {
			a.append("*");
		}
		String newWord = a + log + a;
		return newWord;
		
		
	}

	@Override
	public void Error(String error) {
		StringBuilder rowOne = new StringBuilder();
		String word = LogTwo(error, 3);
		for(int i = 0; i < word.length(); i++) {
			rowOne = rowOne.append('*');
		}
		System.out.println(rowOne + "\n");
		System.out.println(word +"\n");
		System.out.println(rowOne);
		
	}

}
