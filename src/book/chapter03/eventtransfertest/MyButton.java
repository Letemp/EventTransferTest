package book.chapter03.eventtransfertest;



import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

public class MyButton extends Button {

	public MyButton(Context context,AttributeSet attrs) {//自定义控件的构造方法
		super(context,attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("MyButton中触摸事件触发了！");
		return false;//返回false，表示事件可以向外传播
		//return true;
	}
	

}
