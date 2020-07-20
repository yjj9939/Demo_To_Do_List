package sg.edu.rp.c346.id18054367.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDoItem;
    ArrayList<ToDoItem> ToDoItemList;
    CustomAdapter adapter;
    Calendar calendar = Calendar.getInstance();
    Calendar calendar2 = Calendar.getInstance();
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvToDoItem = findViewById(R.id.listViewToDoList);

        calendar.set(Calendar.DATE, 1);
        calendar.set(Calendar.MONTH, 8);
        calendar.set(Calendar.YEAR, 2020);

        calendar2.set(Calendar.DATE, 2);
        calendar2.set(Calendar.MONTH, 8);
        calendar2.set(Calendar.YEAR, 2020);

        ToDoItemList = new ArrayList<>();
        ToDoItem item1 = new ToDoItem("Go for movie", calendar);
        ToDoItem item2 = new ToDoItem("Go for haircut", calendar2);
        ToDoItemList.add(item1);
        ToDoItemList.add(item2);

        adapter = new CustomAdapter(this, R.layout.row, ToDoItemList);
        lvToDoItem.setAdapter(adapter);

    }
}
