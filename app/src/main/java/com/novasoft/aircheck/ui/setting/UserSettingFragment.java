package com.novasoft.aircheck.ui.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.novasoft.aircheck.R;
import com.novasoft.aircheck.adapter.UserSettingAdapter;
import com.novasoft.aircheck.utils.ToastUtil;
import com.weikaiyun.fragmentation.SupportFragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UserSettingFragment extends SupportFragment {

    @BindView(R.id.rv_user)
    RecyclerView rvUser;
    @BindView(R.id.tv_add_user)
    TextView tvAddUser;

    public UserSettingFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_user_setting, container, false);

        ButterKnife.bind(this, view);

        initView();

        return view;
    }

    private void initView() {

        rvUser.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvUser.setAdapter(new UserSettingAdapter(getActivity(), new UserSettingAdapter.OnUserMenuClickListener() {
            @Override
            public void onEditClicked(int position) {
                ToastUtil.showToast("111");
            }

            @Override
            public void onCopyClicked(int position) {
                ToastUtil.showToast("222");
            }

            @Override
            public void onPsdClicked(int position) {
                ToastUtil.showToast("333");
            }

            @Override
            public void onDelecteClicked(int position) {
                ToastUtil.showToast("444");
            }
        }));


    }

    @OnClick(R.id.tv_add_user)
    public void onViewClicked() {

        ToastUtil.showToast("add user");

    }
}
