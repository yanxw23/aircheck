package com.novasoft.aircheck.ui;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.novasoft.aircheck.R;
import com.novasoft.aircheck.base.BaseActivity;
import com.novasoft.aircheck.utils.ToastUtil;

import butterknife.BindView;
import butterknife.OnClick;

import static com.novasoft.aircheck.base.Constant.FULL_SCREEN_FLAG;


public class MainActivity extends BaseActivity {

    @BindView(R.id.iv_menu)
    ImageView ivMenu;
    @BindView(R.id.iv_index)
    ImageView ivIndex;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.iv_right)
    ImageView ivRight;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_connect_status)
    ImageView ivConnectStatus;
    @BindView(R.id.iv_blutooth_status)
    ImageView ivBlutoothStatus;
    @BindView(R.id.iv_cloud_status)
    ImageView ivCloudStatus;
    @BindView(R.id.iv_power)
    ImageView ivPower;
    @BindView(R.id.contener)
    FrameLayout contener;
    @BindView(R.id.tv_status)
    TextView tvStatus;
    @BindView(R.id.tv_type)
    TextView tvType;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_temp)
    TextView tvTemp;
    @BindView(R.id.tv_pressure)
    TextView tvPressure;
    @BindView(R.id.tv_process)
    TextView tvProcess;


    @Override
    public void initContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initView() {

        if (findFragment(IndexFragment.class) == null) {
            loadRootFragment(R.id.contener, new IndexFragment());  // 加载根Fragment
        }

    }

    @OnClick({R.id.iv_menu, R.id.iv_index, R.id.iv_back, R.id.iv_right, R.id.iv_connect_status, R.id.iv_blutooth_status, R.id.iv_cloud_status, R.id.tv_status})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_menu:
                showPopupWindow(ivMenu);
                break;
            case R.id.iv_index:
                finish();
                break;
            case R.id.iv_back:
                break;
            case R.id.iv_right:
                break;
            case R.id.iv_connect_status:
                break;
            case R.id.iv_blutooth_status:
                break;
            case R.id.iv_cloud_status:
                break;
            case R.id.tv_status:
                break;
        }
    }

    PopupWindow mPopupWindow;

    private void showPopupWindow(View view) {

        if (mPopupWindow == null) {
            //加载布局
            View inflate = LayoutInflater.from(this).inflate(R.layout.pop_index_menu, null);
            //更改背景颜色
            inflate.setBackgroundColor(getResources().getColor(R.color.white));

            mPopupWindow = new PopupWindow(inflate);
            LinearLayout ll_user = inflate.findViewById(R.id.ll_user);
            LinearLayout ll_file = inflate.findViewById(R.id.ll_file);
            LinearLayout ll_upload = inflate.findViewById(R.id.ll_upload);
            LinearLayout ll_log = inflate.findViewById(R.id.ll_log);
            LinearLayout ll_laguage = inflate.findViewById(R.id.ll_laguage);
            LinearLayout ll_newer = inflate.findViewById(R.id.ll_newer);
            LinearLayout ll_about = inflate.findViewById(R.id.ll_about);
            LinearLayout ll_logout = inflate.findViewById(R.id.ll_logout);

            ll_user.setOnClickListener(new MenuClickLIstener());
            ll_file.setOnClickListener(new MenuClickLIstener());
            ll_upload.setOnClickListener(new MenuClickLIstener());
            ll_log.setOnClickListener(new MenuClickLIstener());
            ll_laguage.setOnClickListener(new MenuClickLIstener());
            ll_newer.setOnClickListener(new MenuClickLIstener());
            ll_about.setOnClickListener(new MenuClickLIstener());
            ll_logout.setOnClickListener(new MenuClickLIstener());

            //必须设置宽和高
            mPopupWindow.setWidth(getResources().getDimensionPixelOffset(R.dimen.dp_320));
            mPopupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
            mPopupWindow.getContentView().setSystemUiVisibility(FULL_SCREEN_FLAG);

            mPopupWindow.setBackgroundDrawable(new ColorDrawable(Color.GRAY));
            mPopupWindow.setElevation(15);

            //点击其他地方隐藏,false为无反应
            mPopupWindow.setFocusable(true);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //对他进行便宜
            mPopupWindow.showAsDropDown(view, 0, 0, Gravity.LEFT);
        }
        //对popupWindow进行显示
        mPopupWindow.update();
    }


    private class MenuClickLIstener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.ll_user:

                    ToastUtil.showToast("用户设置");
                    break;

                case R.id.ll_file:
                    ToastUtil.showToast("文件夹");
                    break;

                case R.id.ll_upload:
                    ToastUtil.showToast("上传");
                    break;
                case R.id.ll_log:
                    break;
                case R.id.ll_laguage:
                    break;
                case R.id.ll_newer:
                    break;
                case R.id.ll_about:
                    break;
                case R.id.ll_logout:
                    break;

            }

            mPopupWindow.dismiss();

        }
    }

}
