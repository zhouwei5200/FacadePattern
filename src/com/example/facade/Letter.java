package com.example.facade;

import android.util.Log;

public class Letter implements LetterPro {

	@Override
	public void writeContext(String context) {
		// TODO Auto-generated method stub
		Log.i("flag", "写信");
	}

	@Override
	public void fillEnvelope(String address) {
		// TODO Auto-generated method stub
		Log.i("flag", "写信封");
	}

	@Override
	public void letterInotoEnvelope() {
		// TODO Auto-generated method stub
		Log.i("flag", "把信装到信封中");
	}

	@Override
	public void sendLetter() {
		// TODO Auto-generated method stub
		Log.i("flag", "邮寄");
	}
	
}
