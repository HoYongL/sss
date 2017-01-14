package xxx.sss;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button listButton = (Button) findViewById(R.id.listButton);
        final Button resellButton = (Button) findViewById(R.id.resellButton);
        final Button qnaButton =(Button) findViewById(R.id.qnaButton);
        final LinearLayout notice = (LinearLayout) findViewById(R.id.notice); // fragement 작동


        listButton.setOnClickListener(new View.OnClickListener(){

            // 공지사항이 보이지 않도록 ( 해당 프레그먼트가 보이도록)
            @Override
            public void onClick(View v) {
                notice.setVisibility(View.GONE);
                listButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                resellButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                qnaButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragementManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragementManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new ListFragement());
                fragmentTransaction.commit();
            }
        });
        resellButton.setOnClickListener(new View.OnClickListener(){

            // 공지사항이 보이지 않도록 ( 해당 프레그먼트가 보이도록)
            @Override
            public void onClick(View v) {
                notice.setVisibility(View.GONE);
                listButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                resellButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                qnaButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragementManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragementManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new ResellFregement());
                fragmentTransaction.commit();
            }
        });
        qnaButton.setOnClickListener(new View.OnClickListener(){

            // 공지사항이 보이지 않도록 ( 해당 프레그먼트가 보이도록)
            @Override
            public void onClick(View v) {
                notice.setVisibility(View.GONE);
                listButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                resellButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                qnaButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                FragmentManager fragementManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragementManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new QnaFragement());
                fragmentTransaction.commit();
            }
        });
    }
}
