package sg.edu.rp.dmsd.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvemployee;
    ArrayList<EmpInfo> alEmpInfo;
    CustomAdapter caEmp;
    private int contentView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvemployee =

        alEmpInfo = new ArrayList<>();

        float float1 = (float) 3400.0;
        float float2 = (float) 2200.0;

        EmpInfo employee1 = new EmpInfo("John", "Software Technical Leader", float1);
        EmpInfo employee2 = new EmpInfo("John", "Software Technical Leader", float2);
        alEmpInfo.add(employee1);
        alEmpInfo.add(employee2);

        caEmp = new CustomAdapter(this, R.layout.emp_info, alEmpInfo);

        lvemployee.setAdapter(caEmp);

    }

    public void setContentView(int contentView) {
        this.contentView = contentView;
    }
}
