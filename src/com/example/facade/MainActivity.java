package com.example.facade;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	/**
	 * ����ģʽ���ǽ�����ʵ�ֵ�ϸ�ڶ���װ���ڲ���ֻ�����ṩ������������������չ��
	 */
	/**
	 * ������������ д��Ϊ��  
	 * ��ǰ����д��Ҫ����4�����裬 д���ݣ�װ�ŷ⣬д��ַ���ʼ�
	 * ����̫���������ǿ��Խ���Щ��������װ������ֻ�����ṩһ�����������ڲ�����Щ��������
	 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Facade facade = new Facade();
        facade.sendMessage("����", "��ַ");
    }


}
