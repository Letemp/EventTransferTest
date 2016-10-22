package book.chapter03.eventtransfertest;

import android.os.Bundle;
/*
 
当同一控件即采用监听模式，又采用回调模式，并且重写了该控件所在Activity对应的回调方法，而且程序又没有阻止事件传播，
即每个方法都返回false时，Android系统处理事件的顺序如下:
最先触发的是该控件所绑定的事件监听器，接着才触发该控件提供的事件回调方法，最后才传播到该控件所在的Activity，
调用Activity相应的事件回调方法。
 
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
				System.out.println("监听器中的触摸事件触发了！");
				return false;//返回false，表示事件可以向外传播
				//return true;
			}
			
		});
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("MainActivity中的触摸事件触发了！");
		return false;//返回false，表示事件可以向外传播
		//return true;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
