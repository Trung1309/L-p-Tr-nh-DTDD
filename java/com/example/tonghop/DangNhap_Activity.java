package com.example.tonghop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DangNhap_Activity extends AppCompatActivity {

    private TextView tv_dk;
    private EditText txt_name, txt_pass;
    private Button btn_dn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        tv_dk = findViewById(R.id.tv_dk);
        txt_name = findViewById(R.id.txt_name);
        txt_pass = findViewById(R.id.txt_pass);
        btn_dn = findViewById(R.id.btn_dn);
        
        btn_dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt_name.getText().length() !=0 && txt_pass.getText().length() !=0  ){
                    if (txt_name.getText().toString().equals("Admin") && txt_pass.getText().toString().equals("Admin")){
                        Intent intent = new Intent(DangNhap_Activity.this,Home_Activity.class);
                        startActivity(intent);
                        finish();
                        Toast.makeText(DangNhap_Activity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show(); 

                    }else {
                        Toast.makeText(DangNhap_Activity.this, "Sai tài khoản hoăc mật khẩu", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(DangNhap_Activity.this, "Nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv_dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangNhap_Activity.this, DangKi_Activity.class);
                startActivity(intent);
            }
        });
    }
}