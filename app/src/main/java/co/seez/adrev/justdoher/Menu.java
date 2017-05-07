package co.seez.adrev.justdoher;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Adrev on 27-04-2017.
 */

public class Menu extends ListActivity {

    String classes[] = {"TextPlay", "Email", "Example2", "Example3", "Example4"};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String cheese = classes [position];
        super.onListItemClick(l, v, position, id);
        try {


            Class ourClass = Class.forName("co.seez.adrev.justdoher." + cheese);
            Intent ourIntent = new Intent(Menu.this, ourClass);
            startActivity(ourIntent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();


        }
    }
}
