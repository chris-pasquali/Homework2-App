package com.example.hw2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private Course mCourse;
    private TextView mLecName;
    private TextView mLabName;
    private TextView mWeek;
    private TextView mDate;
    private TextView mLecContentDescription;
    private TextView mLabContentDescription;
    private Button mSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mLecName = findViewById(R.id.tvLecName);
        mLabName = findViewById(R.id.tvLabName);
        mWeek = findViewById(R.id.tvWeek);
        mDate = findViewById(R.id.tvDate);
        mLecContentDescription = findViewById(R.id.tvDescription);
        mLabContentDescription = findViewById(R.id.tvLabContentDescription);
        mSearch = findViewById(R.id.btSearch);

        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        mCourse = Course.getCourses().get(position);
        setTitle(mCourse.getShortLectureContent());
        mLecName.setText(mCourse.getShortLectureContent());
        mLabName.setText(mCourse.getShortLabContent());
        mWeek.setText(mCourse.getWeek());
        mDate.setText(mCourse.getDate());
        mLecContentDescription.setText(mCourse.getLectureContentDescription());
        mLabContentDescription.setText(mCourse.getLabContentDescription());
        mSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                searchCourseContent(mCourse.getShortLectureContent());
            }
        });
    }

    private void searchCourseContent(String name) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.business.unsw.edu.au/degrees-courses/course-outlines/archives/INFS3634-2019-T1#course-schedule"));
        startActivity(intent);
    }
}
