package com.example.facade;

public interface LetterPro {
	 //内容
	public void writeContext(String context);    
	//信封  
	public void fillEnvelope(String address); 
	//把信放到信封里
	public void letterInotoEnvelope();    
	//邮递  
	public void sendLetter(); 
}
