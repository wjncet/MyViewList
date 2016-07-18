package com.example.gtune.myviewlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits(); // 初始化水果数据
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this, "This is " +fruit.getName() +" and it saying: fuck you!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.drawable.test);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana", R.drawable.test);
        fruitList.add(banana);
        Fruit orange = new Fruit("Orange", R.drawable.test);
        fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon", R.drawable.test);
        fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear", R.drawable.test);
        fruitList.add(pear);
        Fruit grape = new Fruit("Grape", R.drawable.test);
        fruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple", R.drawable.test);
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry", R.drawable.test);
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry", R.drawable.test);
        fruitList.add(cherry);
        Fruit mango = new Fruit("Mango", R.drawable.test);
        fruitList.add(mango);
    }
}
