package com.example.facade;

public class Facade {
	/**
	 * ��������У���д�ŵĹ��̶���װ�������棬ֻ�����ṩһ���������õ��ŵ����ݺ͵�ַ�Ϳ�����
	 * ���������ģʽ
	 */
	Letter letter = new Letter();
	public void  sendMessage(String content,String address){
		//д��
		letter.writeContext(content);
		//д�ŷ�
		letter.fillEnvelope(address);
		//װ�ŷ�
		letter.letterInotoEnvelope();
		//����
		letter.sendLetter();
		
	}

}
