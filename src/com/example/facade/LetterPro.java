package com.example.facade;

public interface LetterPro {
	 //����
	public void writeContext(String context);    
	//�ŷ�  
	public void fillEnvelope(String address); 
	//���ŷŵ��ŷ���
	public void letterInotoEnvelope();    
	//�ʵ�  
	public void sendLetter(); 
}
