package jp.tamadalab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class  Filereader{
	private String filename;
	private Vector<String> filepath;
	//コンストラクタ
	public Filereader(){}
	
	//ファイルパスをセットする
	public void setFilePathListFile(String fname) throws IOException{
		filename = fname;
		String str;
		try{
			FileReader fp = new FileReader(filename);
			BufferedReader br = new BufferedReader(fp);
			while((str = br.readLine()) != null){
				filepath.add(str);
			}
			br.close();
			fp.close();
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	//指定のファイルパスを返す
	public String getFilePath(int num){
		return filepath.get(num);
	}
	
	//ファイル数を返す
	public int getFileNumber(){
		return filepath.size();
	}
	
	//指定ファイルのソースコードを読み込んで返す
	//??意味分からん
	public Vector<String> getSourceCode(int num){
		String linecode;
		Vector<String> sourcecode = new Vector<String>();
		linecode = filepath.get(num);
		
		return sourcecode;
	}
}