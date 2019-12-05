package com.example.danhba;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    List<User> userList;

    public Adapter(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int position) {
        return userList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.item_user,viewGroup,false);
        TextView tvName = v.findViewById(R.id.tvName);
        TextView tvNumber = v.findViewById(R.id.tvNumber);

        User user = userList.get(i);
        tvName.setText(user.getName());
        tvNumber.setText(String.valueOf(user.getNumber()));

        ImageView imageView = v.findViewById(R.id.image);
        if(user.isIcon()) imageView.setImageResource(R.drawable.ic_launcher_background);

        return v;
    }
}
