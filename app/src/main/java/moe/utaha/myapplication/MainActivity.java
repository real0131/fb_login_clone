package moe.utaha.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit_email;
    EditText edit_password;
    Button btn_login;
    Button btn_finish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog.Builder alertdialog = new AlertDialog.Builder(this);

        alertdialog.setTitle("hello dialog")
                .setMessage("utaha daisuki")
                .setCancelable(true)
                .setPositiveButton("확인", new DialogInterface.OnClickListener(){
                // 확인 버튼 클릭시 설정
                public void onClick(DialogInterface dialog, int whichButton){
                    finish();
                }
                })
                .setNegativeButton("취소", new DialogInterface.OnClickListener(){
            // 취소 버튼 클릭시 설정
            public void onClick(DialogInterface dialog, int whichButton){
                dialog.cancel();
            }
        });


        edit_email = (EditText) findViewById(R.id.edit_email);
        edit_password = (EditText) findViewById(R.id.edit_password);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_finish = (Button) findViewById(R.id.btn_finish);

        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = alertdialog.create();
                dialog.show();
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Login.class);
                startActivity(intent);
            }
        });
    }
}
