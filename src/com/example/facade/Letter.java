package com.example.facade;

import android.util.Log;

public class Letter implements LetterPro {

	@Override
	public void writeContext(String context) {
		// TODO Auto-generated method stub
		Log.i("flag", "д��");
	}

	@Override
	public void fillEnvelope(String address) {
		// TODO Auto-generated method stub
		Log.i("flag", "д�ŷ�");
	}

	@Override
	public void letterInotoEnvelope() {
		// TODO Auto-generated method stub
		Log.i("flag", "����װ���ŷ���");
	}

	@Override
	public void sendLetter() {
		// TODO Auto-generated method stub
		Log.i("flag", "�ʼ�");
	}
	
}
