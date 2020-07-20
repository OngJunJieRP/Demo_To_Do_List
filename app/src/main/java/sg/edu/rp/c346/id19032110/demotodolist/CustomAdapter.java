package sg.edu.rp.c346.id19032110.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> toDoList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects){
        super (context, resource, objects);

        parent_context = context;
        layout_id = resource;
        toDoList = objects;

    }

    public View getView(int position, View convertView, ViewGroup parent){
        // obtain the Layoutinfaltor object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "inflate" the view for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // obtain the UI components and do the necessary binding
        TextView tvTitle = rowView.findViewById(R.id.textViewToDo);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        //obtain the title information based on the position
        ToDoItem currentToDO = toDoList.get(position);

        // Set values to the TextView to display the corresponding information
        tvTitle.setText(toDoList.get(position).getTitle());
        tvDate.setText(toDoList.get(position).toString());

        return rowView;
    }
}
