package com.example.joselm.asteroides;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by joselm on 5/11/16.
 */

public class Puntuaciones extends ListActivity {
    @Override public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puntuaciones);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                MainActivity.almacen.listaPuntuaciones(10)));
    }
}
