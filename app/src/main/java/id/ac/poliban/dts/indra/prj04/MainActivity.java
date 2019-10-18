package id.ac.poliban.dts.indra.prj04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter adapter;

    private List<String> data = new ArrayList<>();
    {
        data.add("Persija");
        data.add("Persiba");
        data.add("Bola1");
        data.add("Bola2");
        data.add("Bola3");
        data.add("Bola4");
        data.add("Bola5");
        data.add("Bola6");
        data.add("Bola7");
        data.add("Bola8");
        data.add("Bola9");
        data.add("Bola10");
        data.add("Bola11");
        data.add("Bola12");
        data.add("Bola13");
        data.add("Bola14");
        data.add("Bola15");
        data.add("Bola16");
        data.add("Bola17");
        data.add("Bola18");
        data.add("Bola19");
        data.add("Bola20");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null)getSupportActionBar().setTitle("Demo SImple List");
        ListView lv = findViewById(R.id.lvItem);
        adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,data);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Kamu Memilih " +data.get(position), Toast.LENGTH_SHORT).show();
        });

        lv.setOnItemLongClickListener((parent, view, position, id) -> {
            data.remove(position);
            adapter.notifyDataSetChanged();
            return true;
        });
    }
}
