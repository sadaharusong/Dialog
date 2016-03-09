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
	String [] single_list = {"��","Ů","���в�Ů","����"};
	String [] multi_list = {"����","��Ů","�����","��վ"};
	String [] item_list = {"����","��Ʒ��","����Գ"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initEenvt();
		
	}
	/*
	 * ��ʼ������¼�
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
		builder.setTitle("ȷ�϶Ի���");
		builder.setIcon(R.drawable.ic_launcher);
		builder.setMessage("ȷ�϶Ի�����ʾ����");
		builder.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "�����ȷ����ť~", Toast.LENGTH_SHORT).show();
			}
		});
		builder.setNegativeButton("ȡ��", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "�����ȡ����ť~", Toast.LENGTH_SHORT).show();
			}
		});
		AlertDialog dialog = builder.create();
		dialog.show();
		
	}

	protected void showDialog2() {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("��ѡ��ť�Ի���");
		builder.setIcon(R.drawable.ic_launcher);
		builder.setSingleChoiceItems(single_list, 0, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				String str = single_list[which];
				Toast.makeText(MainActivity.this, "�������"+str, Toast.LENGTH_SHORT).show();
				
			}
		});
		AlertDialog dialog = builder.create();
		dialog.show();
	}
	
	protected void showDialog3() {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("��ѡ��ť�Ի���");
		builder.setIcon(R.drawable.ic_launcher);
		builder.setMultiChoiceItems(multi_list, null, new DialogInterface.OnMultiChoiceClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) {
					Toast.makeText(MainActivity.this, "��ϲ������"+multi_list[which], Toast.LENGTH_SHORT).show();
				}
				else {
					Toast.makeText(MainActivity.this, "�Ҳ�ϲ��"+multi_list[which], Toast.LENGTH_SHORT).show();

				}
			}
		});
		builder.setNegativeButton("ȡ��", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		});
		builder.setNegativeButton("ȷ��", new DialogInterface.OnClickListener() {
			
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
		builder.setTitle("�б�Ի���");
		builder.setIcon(R.drawable.ic_launcher);
		builder.setItems(item_list, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "�Ҷ���"+multi_list[which], Toast.LENGTH_SHORT).show();

			}
		});
		AlertDialog dialog = builder.create();
		dialog.show();
	}
	
}
