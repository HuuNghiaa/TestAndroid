package com.example.phuongtrinhbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt_a,edt_b,edt_c;
    Button btn_tinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.btn_tinh);

        final TextView result = (TextView) findViewById(R.id.tv_kq);

        button.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {

                String sa = ((EditText) findViewById(R.id.edt_a)).getText().toString();

                String sb = ((EditText) findViewById(R.id.edt_b)).getText().toString();

                String sc = ((EditText) findViewById(R.id.edt_c)).getText().toString();


                try

                {

                    double a = Double.parseDouble(sa);

                    double b = Double.parseDouble(sb);

                    double c = Double.parseDouble(sc);


                    if (a == 0)

                    {

                        result.setText("Phương trình bậc I: ");

                        if (b == 0)

                        {

                            if (c == 0)

                                result.setText(result.getText() + "Phương trình có vô số nghiệm");

                            else

                                result.setText(result.getText() + "Phương trình vô nghiệm");

                        }

                        else

                        {

                            result.setText(result.getText() + "x = " + (-c/b));

                        }

                    }

                    else

                    {

                        double delta = b*b - 4*a*c;


                        if (delta < 0.0)

                        {

                            result.setText("Phương trình vô nghiệm");

                        }

                        else

                        if (delta == 0)

                        {

                            result.setText("Phương trình có nghiệm kép = " + (-b/(2*a)));

                        }

                        else

                        {

                            double delta_sqrt = Math.sqrt(delta);

                            result.setText("x1 = " + ((b*b + delta_sqrt)/(2 * a)) + "\n" + "x2 = " + ((b*b - delta_sqrt)/(2 * a)));

                        }

                    }


                } catch (Exception ex)

                {

                    result.setText(ex.toString());

                }

            }

        });

    }

}
