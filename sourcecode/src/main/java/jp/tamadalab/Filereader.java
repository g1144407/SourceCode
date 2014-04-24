package jp.tamadalab;

import java.util.Vector;

public class  Filereader{
	private String filename;
	private Vector<String> filepath;
	//コンストラクタ
	public Filereader(){}
	
	//ファイルパスをセットする
	public void setFilePathListFile(String fname){
	}
	
	//指定のファイルパスを返す
	public String getFilePath(short num){
		return "";
	}
	
	//ファイル数を返す
	public short getFileNumber(){
		return 0;
	}
	
	//指定ファイルのソースコードを読み込んで返す
	public Vector<String> getSourceCode(short num){
		return filepath;
	}
}