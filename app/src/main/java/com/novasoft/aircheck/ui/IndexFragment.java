package com.novasoft.aircheck.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.novasoft.aircheck.R;
import com.weikaiyun.fragmentation.SupportFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class IndexFragment extends SupportFragment {

    @BindView(R.id.ll_auto)
    LinearLayout llAuto;
    @BindView(R.id.ll_diy)
    LinearLayout llDiy;
    @BindView(R.id.ll_history)
    LinearLayout llHistory;
    @BindView(R.id.ll_voc)
    LinearLayout llVoc;

    public IndexFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_index, container, false);
        ButterKnife.bind(this,view);

        initView();

        return view;
    }

    private void initView() {



    }

    @OnClick({R.id.ll_auto, R.id.ll_diy, R.id.ll_history, R.id.ll_voc})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_auto:
                break;
            case R.id.ll_diy:
                break;
            case R.id.ll_history:
                break;
            case R.id.ll_voc:
                break;
        }
    }
}
