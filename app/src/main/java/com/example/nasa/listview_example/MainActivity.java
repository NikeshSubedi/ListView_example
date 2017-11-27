package com.example.nasa.listview_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] NAMES ={"Anil","Nikesh","Santosh","Beeplop","Sagar","Roshan","Ajesh"};
    String[] DESCRIPTION ={"MOTE","NIK","MATE","SARKAR","GULE","BAUN","CHIPPU"};
    int[] IMAGES={R.mipmap.jhandi,R.mipmap.munda,R.mipmap.chidi,R.mipmap.bhote,R.mipmap.pana,R.mipmap.itta,R.mipmap.dicee};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.lv2);

        adapter adapter = new adapter();
        listView.setAdapter(adapter);



    }
    class adapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.layout_simple,null);
            ImageView imageView=convertView.findViewById(R.id.iv1);
            TextView textView1 = convertView.findViewById(R.id.tv1);
            TextView textView2 = convertView.findViewById(R.id.tv2);

            imageView.setImageResource(IMAGES[position]);
            textView1.setText(NAMES[position]);
            textView2.setText(DESCRIPTION[position]);

            return convertView;
        }
    }
}
