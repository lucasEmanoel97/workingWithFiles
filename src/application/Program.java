package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a fila path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
		
		
		
		/*
		 * AULA05 DA SECAO17 TRABALHANDO COM ARQUIVOS
		 * LISTANDO DIRETORIOS, LISTANDO ARQUIVOS, CRIANDO DIRETORIOS
		 * 
		 * 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "/subdiretorio").mkdir(); // cria uma subpasta
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
		
		*/
		
		
		
		
		
		/*
		 * AULA04 DA SECAO17 TRABALHANDO COM ARQUIVOS
		 * USANDO FileWriter e BufferedWriter
		 * 
		String[] lines = new String[] {"Good morning", "Goodafternoon", "Good night"};
		String path = "/home/lems/out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		*/
		
		
		
		
		
		
		/*
		 * 
		 * AULA03 DA SECAO17 TRABALHANDO COM ARQUIVOS
		 * USANDO BLOCO try COM RECURSOS
		 * 
		String path = "/home/lems/in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		*/
		
		
		
		
		
		
		/*
		 * 
		 * AULA02 DA SECAO17 TRABALHANDO COM ARQUIVOS
		 * USANDO FileReader e BufferedReader
		
		String path = "/home/lems/in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}catch(IOException e1) {
				e1.printStackTrace();
			}
		}
		
		*/
		
		
		
		
		
		/*
		 * 
		 * AULA01 DA SECAO17 TRABALHANDO COM ARQUIVOS
		 * USANDO FILE
		 * 
		File file = new File("/home/lems/in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
		
		
		*/
	}
}
