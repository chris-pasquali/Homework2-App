package com.example.hw2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {
    private ArrayList<Course> mCourse;
    private RecyclerViewClickListener mListener;

    public CourseAdapter(ArrayList<Course> course, RecyclerViewClickListener listener) {
        mCourse = course;
        mListener = listener;
    }

    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView lecName, labName, week, date, lecContentDescription, labContentDescription;
        private RecyclerViewClickListener mListener;

        public CourseViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            mListener = listener;
            v.setOnClickListener(this);
            lecName = v.findViewById(R.id.tvLecName);
            labName = v.findViewById(R.id.tvLabShortDescription);
            week = v.findViewById(R.id.tvWeek);
            date = v.findViewById(R.id.tvDate);
        }

        @Override
        public void onClick(View view) {
            mListener.onClick(view, getAdapterPosition());
        }
    }

    @Override
    public CourseAdapter.CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_course_list_view, parent, false);
        return new CourseViewHolder(v, mListener);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(CourseViewHolder holder, int position) {
        Course course = mCourse.get(position);
        holder.lecName.setText(course.getShortLectureContent());
        holder.labName.setText(course.getShortLabContent());
        holder.week.setText(course.getWeek());
        holder.date.setText(course.getDate());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mCourse.size();
    }

}
