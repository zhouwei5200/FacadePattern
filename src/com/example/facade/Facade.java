package com.example.facade;

public class Facade {
	/**
	 * 在这个类中，把写信的过程都封装到这里面，只对外提供一个方法，得到信的内容和地址就可以了
	 * 这就是门面模式
	 */
	Letter letter = new Letter();
	public void  sendMessage(String content,String address){
		//写信
		letter.writeContext(content);
		//写信封
		letter.fillEnvelope(address);
		//装信封
		letter.letterInotoEnvelope();
		//发出
		letter.sendLetter();
		
	}

}
