package com.example.mytic_activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnRestart;
    int count = 0;
    int flag = 0;
///aman
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        btn1 = findViewById(R.id.btnResults1);
        btn2 = findViewById(R.id.btnResults2);
        btn3 = findViewById(R.id.btnResults3);
        btn4 = findViewById(R.id.btnResults4);
        btn5 = findViewById(R.id.btnResults5);
        btn6 = findViewById(R.id.btnResults6);
        btn7 = findViewById(R.id.btnResults7);
        btn8 = findViewById(R.id.btnResults8);
        btn9 = findViewById(R.id.btnResults9);
        btnRestart = findViewById(R.id.btnResults);
        btnRestart.setVisibility(View.GONE); // Hide the button initially

        // Set OnClickListener for btnRestart
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartGame(v);
            }
        });
    }

    public void Check(View view) {
        Button btnCurrent = (Button) view;

        if (btnCurrent.getText().toString().equals("")) {
            count++;

            if (flag == 0) {
                btnCurrent.setText("x");
                flag = 1;
            } else {
                btnCurrent.setText("o");
                flag = 0;
            }

            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                // condition applied on the tic tac toe game:
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_SHORT).show();
                    showRestartButton();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "Winner is: " + b4, Toast.LENGTH_SHORT).show();
                    showRestartButton();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is: " + b7, Toast.LENGTH_SHORT).show();
                    showRestartButton();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_SHORT).show();
                    showRestartButton();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, "Winner is: " + b2, Toast.LENGTH_SHORT).show();
                    showRestartButton();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is: " + b3, Toast.LENGTH_SHORT).show();
                    showRestartButton();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_SHORT).show();
                    showRestartButton();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is: " + b3, Toast.LENGTH_SHORT).show();
                    showRestartButton();
                } else if (!b1.equals("") && !b2.equals("") && !b3.equals("")
                        && !b4.equals("") && !b5.equals("") && !b6.equals("")
                        && !b7.equals("") && !b8.equals("") && !b9.equals("")) {
                    Toast.makeText(this, "Game is Drawn:", Toast.LENGTH_SHORT).show();
                    showRestartButton();
                }
            }
        }
    }

    private void showRestartButton() {
        btnRestart.setVisibility(View.VISIBLE);
    }

    public void restartGame(View view) {
        newGame();
        btnRestart.setVisibility(View.GONE);
    }

    public void newGame() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag = 0;
    }
}
