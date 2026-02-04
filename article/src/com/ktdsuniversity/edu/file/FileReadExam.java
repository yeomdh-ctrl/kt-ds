package com.ktdsuniversity.edu.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Properties;


public class FileReadExam {
	/**
	 * NIO
	 * Java version >= 1.8
	 */
	public static void readAndPrintFileDescriptionUseNIO(String parentPath, String file) {
		//1.읽으려는 파일을 특정
		File target = new File(parentPath, file);
		//2.파일의 내용을 읽는다
		//3.파일의 내용을 List 에 할당한다
		try {
//			Files.lines(target.toPath()); -> 나중에 함수 배우면 씀
			List<String> lines = Files.readAllLines(target.toPath()); //메모리를 많이 먹는다는 단점이있음
			//4.파일의 내용을 출력한다
			for(String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	/**
	 * IO
	 * Java version < 1.8
	 */
	public static void readAndPrintFileDescriptionUseIO(String parentPath, String file) {
		//1.읽으려는 파일을 특정
		File target = new File(parentPath, file);
		
		//2.파일이 존재하는지 확인
		//3.읽으려는 대상이 진짜 파일이 맞는지 확인
		if(target.exists() && target.isFile()) {
			//4.파일의 내용을 읽기 시작
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			try {
				//4-1. 파일의 byte 를 Chunking 해서 가져온다
				fileReader = new FileReader(target); //내가 읽으려는 파일이 존재하지 않을 때 예외 발생
				//4-2. 파일의 내용을 String 으로 변환한다
				bufferedReader = new BufferedReader(fileReader);
				
				String line = null; // 한 줄씩 읽어올 내용들
				while(true) {
					line = bufferedReader.readLine();
					//EOF(end of file)까지 갔느냐
					if(line == null) { //pipe 해제
						break; //pipe 해제
					}
					else {
						//4-3. 내용을 출력한다
						System.out.println(line);
					}
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally { // pipe 가 열려있으면 끊어라
				if(bufferedReader != null) {
					try {
						bufferedReader.close();
					} catch (IOException e) {
					}
				}
				if(fileReader != null) {
					try {
						fileReader.close();
					} catch (IOException e) {
					}
				}
			}
			
		}
		
	}
	public static void readAndPrintFileDescriptionUseIOAutoClose(String parentPath, String file) {
		//1.읽으려는 파일을 특정
		File target = new File(parentPath, file);
		
		//2.파일이 존재하는지 확인
		//3.읽으려는 대상이 진짜 파일이 맞는지 확인
		if(target.exists() && target.isFile()) {
			//4.파일의 내용을 읽기 시작
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			try {
				//4-1. 파일의 byte 를 Chucking 해서 가져온다
				fileReader = new FileReader(target); //내가 읽으려는 파일이 존재하지 않을 때 예외 발생
				//4-2. 파일의 내용을 String 으로 변환한다
				bufferedReader = new BufferedReader(fileReader);
				
				String line = null; // 한 줄씩 읽어올 내용들
				while(true) {
					line = bufferedReader.readLine();
					//EOF(end of file)까지 갔느냐
					if(line == null) { //pipe 해제
						break; //pipe 해제
					}
					else {
						//4-3. 내용을 출력한다
						System.out.println(line);
					}
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally { // pipe 가 열려있으면 끊어라
				if(bufferedReader != null) {
					try {
						bufferedReader.close();
					} catch (IOException e) {
					}
				}
				if(fileReader != null) {
					try {
						fileReader.close();
					} catch (IOException e) {
					}
				}
			}
			
		}
		
	}
		public static void main(String[] args) {
			//운영체제의 정보를 취득
			Properties props = System.getProperties();
			String homePath = props.get("user.home").toString();
			System.out.println(homePath);
//			System.out.println(props);
//			System.out.println(props.get("user.home"));
//			
//			Map<String, String> env = System.getenv();
//			System.out.println(env);
//			System.out.println(env.get("HOME"));
			
			// C:\Java Exam 폴더의 정보를 추출
			//java.io.File
			System.out.println(File.separator);
			File directory = new File(homePath + File.separator + "Java Exam");
			
			//1.폴더의 이름을 출력
			String directoryName = directory.getName();
			System.out.println(directoryName);
			
			//2.이 경로가 가리키는 것이 파일인지 폴더인지를 구분
			boolean isFile = directory.isFile();
			//isFile 의 값이 true 이면 파일이고 false 이면 파일이 아니다
			System.out.println(isFile);
			boolean isDirectory = directory.isDirectory();
			//isDirectory 가 true 이면 폴더고 false 이면 파일이 아니다
			System.out.println(isDirectory);
			
			//3.이 경로가 실제 존재하는 것인지 구분
			boolean exists = directory.exists();
			//exist 가 true 이면 존재하는 폴더이고 false 이면 존재하지 않는다
			System.out.println(exists);
			
			//4.이 경로의 크기(폴더의 크기) 출력
			long bytes = directory.length();
			System.out.println(bytes + "byte");
			
			// C:\Java Exam.txt 파일의 정보를 추출 => 파일 핸들링의 시작
			File textFile = new File(homePath + File.separator + "Java Exam","Java Exam.txt");
			
			//1.파일의 이름을 출력
			String FileName = textFile.getName();
			System.out.println(FileName);
			
			//2.파일이 폴더인지 파일인지 구분해서 출력
			boolean isFiles = textFile.isFile();
			System.out.println(isFiles);
			//3.이 파일이 실제 존재하는 것인지 출력
			boolean existsf = textFile.exists();
			System.out.println(existsf);
			//4.파일의 크기를 출력한다
			long bytesF = textFile.length();
			System.out.println(bytesF + "byte");
			//5.이 파일이 있는 부모의 경로를 출력한다
			//  -첫번째 방법
			String parentPath = textFile.getParent();
			System.out.println(parentPath);
			//  -두번째 방법
			File parentFile = textFile.getParentFile();
			System.out.println(parentFile);
			//6.이 파일의 경로를 출력한다
			String textFilePath = textFile.getAbsolutePath();
			System.out.println(textFilePath);
			
			
//			readAndPrintFileDescriptionUseIO(homePath + File.separator + "Java Exam","Java Exam.txt");
			readAndPrintFileDescriptionUseNIO(homePath + File.separator + "Java Exam","Java Exam.txt");
		}

}
