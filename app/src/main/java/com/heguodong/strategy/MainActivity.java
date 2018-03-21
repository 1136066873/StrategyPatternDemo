package com.heguodong.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 *
 *
 * http://blog.csdn.net/jason0539/article/details/45007553
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_click ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_click = (TextView)findViewById(R.id.tv_click);
        tv_click.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_click:
                test();

                break;
        }
    }

    private void test() {

        MyContext myContext ;

        myContext = new MyContext(new ConcreteStrategyFirst());
        myContext.operate();

        myContext = new MyContext(new ConcreteStrategySecond());
        myContext.operate();

        myContext = new MyContext(new ConcreteStrategyThird());
        myContext.operate();

    }
}
