package com.novasoft.aircheck.ui;

import android.content.Intent;
import android.graphics.Paint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.novasoft.aircheck.R;
import com.novasoft.aircheck.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.et_name)
    EditText etName;
    @BindView(R.id.et_psd)
    EditText etPsd;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_forget_name)
    TextView tvForgetName;
    @BindView(R.id.tv_forget_psd)
    TextView tvForgetPsd;
    @BindView(R.id.tv_version)
    TextView tvVersion;


    @Override
    public void initContentView() {
        setContentView(R.layout.activity_login);
    }

    @Override
    public void initView() {

        tvForgetName.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//画线
        tvForgetName.getPaint().setAntiAlias(true);
        tvForgetPsd.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//画线
        tvForgetPsd.getPaint().setAntiAlias(true);

    }


    Intent intent;

    @OnClick({R.id.btn_login, R.id.tv_forget_name, R.id.tv_forget_psd})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();

                break;
            case R.id.tv_forget_name:
                break;
            case R.id.tv_forget_psd:
                break;
        }
    }
}
