package book.chapter03.eventtransfertest;



import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

public class MyButton extends Button {

	public MyButton(Context context,AttributeSet attrs) {//�Զ���ؼ��Ĺ��췽��
		super(context,attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("MyButton�д����¼������ˣ�");
		return false;//����false����ʾ�¼��������⴫��
		//return true;
	}
	

}
