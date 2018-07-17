package sg.edu.rp.dmsd.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by 17010603 on 17/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<EmpInfo> empInfos;


    public CustomAdapter(@NonNull Context context, int resource,  @NonNull ArrayList objects) {
        super(context, resource,  objects);
        parent_context = context;
        layout_id = resource;
        empInfos = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

    }
}
