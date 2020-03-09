package com.selfvsself.tolerancelistmvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.selfvsself.tolerancelistmvvm.R;
import com.selfvsself.tolerancelistmvvm.constant.Tolerance;
import com.selfvsself.tolerancelistmvvm.model.ListItem;
import com.selfvsself.tolerancelistmvvm.model.RecyclerAdapter;
import com.selfvsself.tolerancelistmvvm.viewModel.MainActivityModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MainActivityModel viewModel;
    private ImageButton menuBtn;
    private TextInputEditText sizeInput, toleranceInput;
    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    private List<ListItem> listItems = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainActivityModel.class);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.hasFixedSize();
        recyclerAdapter = new RecyclerAdapter(listItems);
        recyclerView.setAdapter(recyclerAdapter);
        sizeInput = findViewById(R.id.textInputSize);
        toleranceInput = findViewById(R.id.textInputTolerance);
        menuBtn = findViewById(R.id.imageBtnMenu);

        sizeInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                viewModel.setSizeText(s.toString());
            }
        });

        toleranceInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                viewModel.setTolerance(s.toString());
            }
        });

        viewModel.getListData().observe(this, listItems -> {
            this.listItems.clear();
            this.listItems.addAll(listItems);
            recyclerAdapter.notifyDataSetChanged();
        });
    }
}
