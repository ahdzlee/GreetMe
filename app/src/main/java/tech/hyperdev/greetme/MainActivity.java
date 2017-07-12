package tech.hyperdev.greetme;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
    }

    private void findViews() {
        mEtName = (EditText) findViewById(R.id.etName);
        Button btnGreetMe = (Button) findViewById(R.id.btnGreetMe);

        btnGreetMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String name = mEtName.getText().toString();
//        Toast toast = Toast.makeText(this, "Hello, " + name, Toast.LENGTH_SHORT);
//        toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
//        toast.show();

        new AlertDialog.Builder(this)
                .setTitle("This is the title")
                .setMessage("And this is the message")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You tapped YES", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", null)
                .setNeutralButton("Cancel", null)
                .show();
    }
}
