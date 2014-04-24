package jp.tamadalab;

import java.util.Vector;

public class  Scdata{
	private  String filename;	//ソースコードファイルの名前
	private Vector<String> sourcecode;	//ソースコード情報(コメントを含むコード)
	private Vector<Short> indent;			//インデント
	private Vector<Short> commentflag;		//コメントフラグ
	
	//コンストラクタ(ファイル名を初期化)
	public Scdata(String fname){}
	
	//指定行のコード
	public String getLineCode(short line){
		return "";
	}
	
	//指定行のコードから""内を除去したコード
	public String getNonDataLineCode(short line){
		return "";
	}
	
	//ファイル名
	public String getFileName(){
		return filename;
	}
	
	//プログラムが何行あるか
	public short getTotalLine(){
		return 0;
	}
	
	//指定した行のコードの長さ
	public short getCodeLength(short line){
		return 0;
	}
	
	//指定された行の先頭のインデント
	public short getIndent(short line){
		return 0;
	}
	
	//指定された行の先頭のスコープレベル
	public short getScopeLevel(short line){
		return 0;
	}
	
	//指定された行のコメント判断
	public short getCommentFlag(short line){
		return 0;
	}
	
	//ソースコード格納
	public void setSourceCodeData(Vector<String> code){
	}
	
	//インデントを読み取って設定
	public void setIndent(){
	}
	
	//スコープレベルの設定
	//行の先頭のスコープレベルを保持する
	public void setScopeLevel(){
	}
	
	//ブロックコメントフラグを立てる
	//0:ブロックコメントが継続しない
	//1:ブロックコメントが継続している
	public void setCommentFlag(){
	}
}