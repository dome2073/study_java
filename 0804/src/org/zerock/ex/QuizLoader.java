package org.zerock.ex;

import java.lang.reflect.Constructor;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class QuizLoader {

	public AbstractQuiz[] loadFile(String filePath)throws Exception{
		
		//파일의 모든 줄을 가져옴 List
		List<String> lines = Files.readAllLines(Paths.get("C:\\zzz\\quiz0.txt"));
		
		AbstractQuiz[] quizArr = new AbstractQuiz[lines.size()];
		//System.out.println(lines);
		
		for (int i = 0; i < lines.size(); i++) {
			
			String line = lines.get(i);
			
			String[] arr = line.split(",");
			
			System.out.println(Arrays.deepToString(arr));
			
			String className = "org.zerock.ex."+ arr[0];
			
			Class clz = Class.forName(className);
			
			if(arr.length ==3) {
			
				Constructor<?> con = clz.getDeclaredConstructor(String.class, String.class);
				
				quizArr[i] = (AbstractQuiz) con.newInstance(arr[1], arr[2]);
			
			}else if(arr.length == 4) {
				
				Constructor<?> con = clz.getDeclaredConstructor(String.class, String.class, String[].class);
				
				quizArr[i] = (AbstractQuiz)con.newInstance(arr[1], arr[2], arr[3].split("-"));
			}
			
		}
		
		return quizArr;
	}
	
	public static void main(String[] args) throws Exception{
		
		QuizLoader quizLoader = new QuizLoader();
		
		System.out.println(quizLoader.loadFile("C:\\zzz\\quiz0.txt"));
	
	}
}
