package book.chapter03.eventtransfertest;

import android.os.Bundle;
/*
 
��ͬһ�ؼ������ü���ģʽ���ֲ��ûص�ģʽ��������д�˸ÿؼ�����Activity��Ӧ�Ļص����������ҳ�����û����ֹ�¼�������
��ÿ������������falseʱ��Androidϵͳ�����¼���˳������:
���ȴ������Ǹÿؼ����󶨵��¼������������ŲŴ����ÿؼ��ṩ���¼��ص����������Ŵ������ÿؼ����ڵ�Activity��
����Activity��Ӧ���¼��ص�������
 
 */
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		MyButton myButton=(MyButton) this.findViewById(R.id.myBtn);
		myButton.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				System.out.println("�������еĴ����¼������ˣ�");
				return false;//����false����ʾ�¼��������⴫��
				//return true;
			}
			
		});
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("MainActivity�еĴ����¼������ˣ�");
		return false;//����false����ʾ�¼��������⴫��
		//return true;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
