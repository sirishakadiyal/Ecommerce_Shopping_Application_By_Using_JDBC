package com.shopping.exception;

public class CustomerDataInvalidException extends RuntimeException{
private String exceptionmsg;
//public char[] getExceptionmsg;
public CustomerDataInvalidException()
{
	
}
public CustomerDataInvalidException(String exceptionmsg) {

	this.exceptionmsg = exceptionmsg;
}
public String getExceptionmsg() {
	return exceptionmsg;
}
public void setExceptionmsg(String exceptionmsg) {
	this.exceptionmsg = exceptionmsg;
}
@Override
public String toString() {
	return "CustomerDataInvalidException ";
}

}
