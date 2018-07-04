package android.example.com.assignment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RView extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<CustomData> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rview);
        recyclerView = findViewById(R.id.rview);
        createData();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapt(this,list));
    }

    private void createData() {

        CustomData data = new CustomData();
        data.setName("Saurav");
        data.setAge("22");
        data.setDob("1993");
        list.add(data);
        CustomData data1 = new CustomData();
        data.setName("Gaurav");
        data.setAge("23");
        data.setDob("1992");
        list.add(data1);
        CustomData data2 = new CustomData();
        data.setName("Gautam");
        data.setAge("20");
        data.setDob("1998");
        list.add(data2);
        CustomData data3 = new CustomData();
        data.setName("Prem");
        data.setAge("18");
        data.setDob("2000");
        list.add(data3);CustomData data4 = new CustomData();
        data.setName("Naveen");
        data.setAge("26");
        data.setDob("1988");
        list.add(data4);CustomData data5 = new CustomData();
        data.setName("Amit");
        data.setAge("29");
        data.setDob("1995");
        list.add(data5);CustomData data6 = new CustomData();
        data.setName("Pranav");
        data.setAge("25");
        data.setDob("1989");
        list.add(data6);CustomData data7 = new CustomData();
        data.setName("Sameer");
        data.setAge("21");
        data.setDob("1986");
        list.add(data7);CustomData data8 = new CustomData();
        data.setName("Garry");
        data.setAge("32");
        data.setDob("1989");
        list.add(data8);

    }
}
