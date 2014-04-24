package jp.tamadalab;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class  Scanalyze{
	private String inlinecode;		//単行コード
	private PosMap namemap;			//コード中の名前一覧(名前,行と列を格納するmap)
	private double[] analyzedata = new double[56];	//解析データ
	private Vector<String> arrangecode;	//整理されたコード
	
	//コンストラクタ
	Scanalyze(Scdata sc){}
	
	//解析用メンバ関数の呼び出し
	public void CallAnalyzeFunction(Scdata sc){
	}
	/*------------------解析系の関数-------------------*/
	
	//行の長さの平均
	public void LengthAverage(Scdata sc){
	}
	
	//行の長さの分散
	public void LengthVariance(Scdata sc){
	}
	
	//インデントの平均と分散(コメントと空行除外)
	public void IndentAvgVar(Scdata sc){
	}
	
	//インデントとスコープの比率
	public void Scope_IndentRatio(Scdata sc){
	}
	
	//各インデントレベルでのレベル平均の誤差の平均と分散
	public void Scope_IndentErrorAvgVar(Scdata sc){
	}
	
	//{や}の前後に改行がくる割合
	//{や}の前後にコメントが入ってそれから改行の場合は単純に考えて前後に改行がきていると断定してよいか？
	//暫定的に、良いと勝手に判断してコメント削除したソースコードを使って改行割合を導入する
	public void BreakCurlyAverage(Scdata sc){
	}
	
	//(や)の前後の空白の平均値
	public void SpaceSquareAverage(){
	}
	
	//予約語・演算子・その他に続く(の前の空白の平均
	public void SpaceCaseSquareAverage(){
	}
	
	//コメントのバイト数平均、行数平均、ファイルに対するコメントの割合（バイト数の）、ファイルに対する行数の割合
	public void CommentMetrics(Scdata sc){
	}
	
	//各演算子の出現割合，前後の空白，演算子の行辺りの出現回数
	public void OperatorMetrics(Scdata sc){
	}
	
	//クラス名・関数名・変数名に関するもの全部
	public void NamingConventionMetrics(Scdata sc){
	}
	
	//名前の長さの平均と分散
	public void NameLengthAvgVar(PosMap classlist, PosMap funclist, PosMap varlist){
	}
	
	//スコープレベルごとの名前の長さの平均と分散
	public void NameLengthScopeAvgVar(PosMap classlist, PosMap funclist, PosMap varlist){
	}
	
	//行ごとの名前出現頻度
	public void NameKindsRatio(Scdata sc, PosMap varlist){
	}
	
	//大文字・小文字・混在・数字・アンダーバー含有率
	public void NamingConventionRatio(PosMap classlist, PosMap funclist, PosMap varlist){
	}
	/*-----------------アクセッサ-------------------*/
	
	public void getAnalyzeData(double[] databox[]){
	}
	
	//行の長さの平均
	public double getLengthAverage(){
		return 0;
	}
	
	//行の長さの分散
	public double getLengthVariance(){
		return 0;
	}
	
	//インデントの平均
	public double getIndentAverage(){
		return 0;
	}
	
	//インデントの分散
	public double getIndentVariance(){
		return 0;
	}
	
	//インデントとスコープ比
	public double getScope_IndentRatio(){
		return 0;
	}
	
	//各スコープでのインデント平均からの誤差平均
	public double getScope_IndentErrorAverage(){
		return 0;
	}
	
	//各スコープでのインデント平均からの誤差分散
	public double getScope_IndentErrorVariance(){
		return 0;
	}
	
	//{の前に改行が来ている割合
	public double getPrevBreakLCurlyAverage(){
		return 0;
	}
	
	//{の後に改行が来ている割合
	public double getNextBreakLCurlyAverage(){
		return 0;
	}
	
	//}の前に改行が来ている割合
	public double getPreBreakRCurlyAverage(){
		return 0;
	}
	
	//}の後に改行が来ている割合
	public double getNextBreakRCurlyAverage(){
		return 0;
	}
	
	//{の前に改行が来ている割合
	public double getPrevSpaceLSquareAverage(){
		return 0;
	}
	
	//{の後に改行が来ている割合
	public double getNextSpaceLSquareAverage(){
		return 0;
	}
	
	//}の前に改行が来ている割合
	public double getPrevSpaceRSquareAverage(){
		return 0;
	}
	//}の後に改行が来ている割合
	public double getNExtSpaceRSquareAverage(){
		return 0;
	}
	
	//単項算術演算子の出現割合
	public double getMonoArithRatio(){
		return 0;
	}
	
	// 単項論理演算子の出現割合
	public double getMonoLogicRatio(){
		return 0;
	}
	
	// 二項算術演算子の出現割合
	public double getDiArithRatio(){
		return 0;
	}
	
	// 二項論理演算子の出現割合
	public double getDiLogicRatio(){
		return 0;
	}
	
	// 二項比較演算子の出現割合
	public double getDiCompareRatio(){
		return 0;
	}
	
	// 二項代入演算子の出現割合
	public double getDiAssignRatio(){
		return 0;
	}
	
	// 三項条件演算子の出現割合
	public double getConditionRatio(){
		return 0;
	}
	
	// 行当たりの演算子の出現頻度
	public double getLineOperationRatio(){
		return 0;
	}
	
	/*------------------解析補助関数------------------*/
	
	//ソースコードを解析向けにきれいにする
	public void CreateArrangeCode(Scdata sc){
	}
	
	//左側のスペースを求める
	public long getPrevSpace(long pos){
		return 0;
	}
	
	//右側のスペースを求める
	public long getNextSpace(long pos){
		return 0;
	}
	
	//単項論理か二項算術か
	public boolean LogicOrArith(long pos){
		return false;
	}
	
	//テンプレート記述や配列初期化記述、Extends等を空白に置換する
	public String getCutAccessaryString(String code){
		return "";
	}
	
	//名前リストの作成
	public void CreateNameList(){
	}
	
	//クラス宣言リストの作成
	public void CreateClassList(PosMap classlist){
	}
	
	//関数宣言リストの作成
	public void CreateFunctionList(PosMap funclist){
	}
	
	//変数宣言リストの作成
	public void CreateVariableList(PosMap varlist){
	}
}
