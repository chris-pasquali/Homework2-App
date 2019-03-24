package com.example.hw2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.content.Intent;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.hw2.MESSAGE";

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        CourseAdapter.RecyclerViewClickListener listener = new CourseAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                launchDetailActivity(position);
            }
        };
        mAdapter = new CourseAdapter(Course.getCourses(), listener);
        mRecyclerView.setAdapter(mAdapter);

    }

    private void launchDetailActivity(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE, position);
        startActivity(intent);
    }
}
