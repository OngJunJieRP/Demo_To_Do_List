package sg.edu.rp.c346.id19032110.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvActivity;
    ArrayList<ToDoItem> alToDoList;
    ArrayAdapter<ToDoItem> aaToDo;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvActivity = findViewById(R.id.ListViewActivity);
        alToDoList = new ArrayList<>();
        adapter = new CustomAdapter(this,R.layout.row, alToDoList);

        Calendar date1 = Calendar.getInstance();
        date1.set(2020,8,1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2020,8,2);

        //alToDoList.add(new ToDoItem("Watch movie", date1));
        ToDoItem activity1 = new ToDoItem("Watch movie", date1);
        ToDoItem activity2 = new ToDoItem("Go for haircut", date2);

        alToDoList.add(activity1);
        alToDoList.add(activity2);

        aaToDo = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alToDoList);
        lvActivity.setAdapter(adapter);

    }
}
