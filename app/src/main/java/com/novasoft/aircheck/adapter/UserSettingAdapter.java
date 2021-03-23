package com.novasoft.aircheck.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.novasoft.aircheck.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class UserSettingAdapter extends RecyclerView.Adapter<UserSettingAdapter.ViewHolder> {

    private Context context;
    //
//    private ArrayList<String> stokes;


    public UserSettingAdapter(Context context,OnUserMenuClickListener onUserMenuClickListener) {
        this.context = context;
        this.onUserMenuClickListener = onUserMenuClickListener;
//        this.stokes = stokes;

    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

//        holder.tv_read.setText(stokes.get(position));


        holder.ivEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onUserMenuClickListener.onEditClicked(position);
            }
        });
        holder.ivCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onUserMenuClickListener.onCopyClicked(position);
            }
        });
        holder.ivChangePsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onUserMenuClickListener.onPsdClicked(position);
            }
        });
        holder.ivDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onUserMenuClickListener.onDelecteClicked(position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return 5;
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_nickname)
        TextView tvNickname;
        @BindView(R.id.tv_xing)
        TextView tvXing;
        @BindView(R.id.tv_ming)
        TextView tvMing;
        @BindView(R.id.tv_num)
        TextView tvNum;
        @BindView(R.id.tv_job)
        TextView tvJob;
        @BindView(R.id.tv_dept)
        TextView tvDept;
        @BindView(R.id.tv_permission)
        TextView tvPermission;
        @BindView(R.id.tv_disc)
        TextView tvDisc;
        @BindView(R.id.iv_edit)
        ImageView ivEdit;
        @BindView(R.id.iv_copy)
        ImageView ivCopy;
        @BindView(R.id.iv_change_psd)
        ImageView ivChangePsd;
        @BindView(R.id.iv_delete)
        ImageView ivDelete;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }


    OnUserMenuClickListener onUserMenuClickListener;

    public interface OnUserMenuClickListener {
        void onEditClicked(int position);

        void onCopyClicked(int position);

        void onPsdClicked(int position);

        void onDelecteClicked(int position);
    }


}