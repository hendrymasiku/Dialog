package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button resetButton = (Button) findViewById(R.id.btnreset);
        resetButton.setOnClickListener((View.OnClickListener) resetButton);

        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.custom_dialog);
        dialog.setTitle("Custom Dialog");

        Button btnDialog = (Button)dialog.findViewById(R.id.btntombol);
        btnDialog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub dialog.dismiss();
                }
        });
        dialog.show();

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Apakah Anda Yakin Untuk Mereset Nilai Protein ?").setNegativeButton("NO",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Tidak jadi reset", Toast.LENGTH_SHORT).show();
            }
        }).setPositiveButton("YES",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Melakukan RESET !!", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog dialog1 = builder.create();
        dialog.show();

    }
}

