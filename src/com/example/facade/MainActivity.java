package com.example.facade;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	/**
	 * 门面模式就是将方法实现的细节都封装到内部，只对外提供方法，极大的提高了拓展性
	 */
	/**
	 * 在这里我们以 写信为例  
	 * 以前我们写信要经过4个步骤， 写内容，装信封，写地址，邮寄
	 * 过程太繁琐，我们可以将这些方法都封装起来，只对外提供一个方法，在内部把这些事情做完
	 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Facade facade = new Facade();
        facade.sendMessage("内容", "地址");
    }


}
