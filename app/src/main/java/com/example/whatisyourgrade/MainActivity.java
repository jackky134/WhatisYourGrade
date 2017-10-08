package com.example.whatisyourgrade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText text;
    private Button grader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button exitbutton = (Button) findViewById(R.id.exitbutton);
        exitbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                finish();
            }
        });
        grader = (Button) findViewById(R.id.findgrade);
        grader.setOnClickListener(new View.OnClickListener() {

                                                public void onClick(View v) {
                                                    String gradeText = getGrade(grade);

                                                    String result = String.format("%s", gradeText);
                                                }

                                                private String getGrade(int grade) {


                                                    String gradeText = "";

                                                    if (grade < 49) {
                                                        gradeText = "F";
                                                    } else if (grade <= 59) {
                                                        gradeText = "D";
                                                    } else if (grade <= 69) {
                                                        gradeText = "C";
                                                    }
                                                      else if (grade <= 79) {
                                                        gradeText = "B";
                                                    }
                                                    else {
                                                        gradeText = "A";
                                                    }

                                                    return gradeText;

                                                }

                                            });
    }
}
