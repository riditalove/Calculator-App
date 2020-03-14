package com.example.calcappfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    String tot="";
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
    }

    public void Equal(View v){
        try {
            ArrayList<String> list = new ArrayList<>();
            String[] strings = tot.split("\\s");

            for(String e : strings)
                Log.d("e", "" + e);

            Collections.addAll(list, strings);

            for (int x = 0; x < list.size(); x++) {
                double num, num2;
                double res;
                if (list.get(x).equals("/") || list.get(x).equals("*")) {
                    num = Double.parseDouble(list.get(x - 1));
                    num2 = Double.parseDouble(list.get(x + 1));

                    if (list.get(x).equals("/")) {
                        res = num / num2;
                    } else {
                        res = num * num2;
                    }
                    list.remove(x + 1);
                    list.set(x, "" + res);
                    list.remove(x - 1);
                    x -= 2;
                }
            }

            for (int x = 0; x < list.size(); x++) {
                double num, num2;
                double res;
                if (list.get(x).equals("-") || list.get(x).equals("+")) {
                    num = Double.parseDouble(list.get(x - 1));
                    num2 = Double.parseDouble(list.get(x + 1));

                    if (list.get(x).equals("-")) {
                        res = num - num2;
                    } else {
                        res = num + num2;
                    }
                    list.remove(x + 1);
                    list.set(x, "" + res);
                    list.remove(x - 1);
                    x -= 2;
                }
            }
            if ((double) (int) (Double.parseDouble(list.get(0)))==Double.parseDouble(list.get(0)))
                list.set(0, "" + (int) (Double.parseDouble(list.get(0))));
            if(Double.isInfinite(Double.parseDouble(list.get(0)))){
                tv1.setText("Error");
                tot = "Error";
            }else {
                tv1.setText(list.get(0));
                tot = list.get(0);
            }
        } catch (Throwable e){
            tv1.setText("Error");
            tot = "Error";
        }
    }

    public void Num(View v){
        if(tv1.getText().equals("Error")) {
            tv1.setText("");
            tot = "";
        }
        String sign = "";
        if(tv1.getText().equals("0")){
            tv1.setText("Error");
            tot = "Error";
        }
        else {
            if (tv1.getText().length() - 1 > 0) {
                sign = ("" + tv1.getText()).substring(tv1.getText().length() - 1, tv1.getText().length());
            }
            if (sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) {
                tv1.setText(tv1.getText() + " " + ((Button) v).getText());
                tot += (" "+((Button)v).getText());
            } else {
                tv1.setText(tv1.getText() + "" + ((Button) v).getText());
                tot += ("" + ((Button) v).getText());
            }
        }
        String n = ((String)tv1.getText()).replaceAll("\\s","");
        tv1.setText(n);
    }

    public void Sign(View v){
        if(tv1.getText().equals("Error")) {
            tv1.setText("");
            tot = "";
        }
        tv1.setText(tv1.getText() + " " + ((Button)v).getText());
        tot += " "+((Button)v).getText();
        String n = ((String)tv1.getText()).replaceAll("\\s","");
        tv1.setText(n);
    }

    public void Clear(View v){
        tv1.setText("");
        tot = "";
    }

}
