package Transactions;

public class TransactionsAttr {
	
int eId;
int cId;
String sId;
String tType;
String tDate;
int value;
boolean flag;
public TransactionsAttr(int eId,int cId,String tType, String tDate, int value, boolean flag){
	this.eId = eId;
	this.cId = cId;
	this.tType = tType;
	this.tDate = tDate;
	this.value = value;
	this.flag = flag;
}
}