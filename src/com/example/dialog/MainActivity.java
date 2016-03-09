package com.example.dialog;

import android.R.layout;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {
	String [] single_list = {"男","女","不男不女","人妖"};
	String [] multi_list = {"刀塔","美女","金坷垃","逼站"};
	String [] item_list = {"经理","产品狗","程序猿"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initEenvt();
		
	}
	/*
	 * 初始化点击事件
	 *
	 */
	private void initEenvt(){
		findViewById(R.id.dialog_btn1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog1();
				
			}
		});
		
		findViewById(R.id.dialog_btn2).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog2();
			}
		});
		findViewById(R.id.dialog_btn3).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog3();
			}
		});
		findViewById(R.id.dialog_btn4).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog4();
			}
		});
	}
	
	
	
	private void showDialog1(){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("确认对话框");
		builder.setIcon(R.drawable.ic_launcher);
		builder.setMessage("确认对话框提示内容");
		builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "点击了确定按钮~", Toast.LENGTH_SHORT).show();
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "点击了取消按钮~", Toast.LENGTH_SHORT).show();
			}
		});
		AlertDialog dialog = builder.create();
		dialog.show();
		
	}

	protected void showDialog2() {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("单选按钮对话框");
		builder.setIcon(R.drawable.ic_launcher);
		builder.setSingleChoiceItems(single_list, 0, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				String str = single_list[which];
				Toast.makeText(MainActivity.this, "这个人是"+str, Toast.LENGTH_SHORT).show();
				
			}
		});
		AlertDialog dialog = builder.create();
		dialog.show();
	}
	
	protected void showDialog3() {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("多选按钮对话框");
		builder.setIcon(R.drawable.ic_launcher);
		builder.setMultiChoiceItems(multi_list, null, new DialogInterface.OnMultiChoiceClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) {
					Toast.makeText(MainActivity.this, "我喜欢上了"+multi_list[which], Toast.LENGTH_SHORT).show();
				}
				else {
					Toast.makeText(MainActivity.this, "我不喜欢"+multi_list[which], Toast.LENGTH_SHORT).show();

				}
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		});
		builder.setNegativeButton("确定", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		});
		AlertDialog dialog = builder.create();
		dialog.show();
	}
	
	protected void showDialog4() {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("列表对话框");
		builder.setIcon(R.drawable.ic_launcher);
		builder.setItems(item_list, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "我动了"+multi_list[which], Toast.LENGTH_SHORT).show();

			}
		});
		AlertDialog dialog = builder.create();
		dialog.show();
	}
	
}
