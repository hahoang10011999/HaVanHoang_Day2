package com.example.danhba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class
MainActivity extends AppCompatActivity {
    ArrayList<User> users;

    User user1,user2,user3;
    ListView listView;
    Adapter adapter;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        users = new ArrayList<>();
        listView = findViewById(R.id.lv1);

        img = findViewById(R.id.plus);
        user1 = new User("hoàng",82828,false);
        user2 = new User("hiếu",193834,true);
        user3 = new User("dương",89373,true);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        adapter = new Adapter(users);
        listView.setAdapter(adapter);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Add.class);
                startActivity(intent);
            }
        });
        Intent intent1 = getIntent();
        String name = intent1.getStringExtra("inputName");
        String number = intent1.getStringExtra("inputNumber");
        boolean image = intent1.getBooleanExtra("image",false);

        if(name != null && number != null ){
            User user = new User(name,Integer.valueOf(number),image);
            users.add(user);
        }

    }
}
