package com.example.hw2;

import java.util.ArrayList;

public class Course {
    private String shortLectureContent;
    private String shortLabContent;
    private String week;
    private String date;
    private String lectureContentDescription;
    private String labContentDescription;

    public Course() {
    }

    public Course(String shortLectureContent, String shortLabContent, String week, String date, String lectureContentDescription, String labContentDescription) {
        this.shortLectureContent = shortLectureContent;
        this.shortLabContent = shortLabContent;
        this.week = week;
        this.date = date;
        this.lectureContentDescription = lectureContentDescription;
        this.labContentDescription = labContentDescription;
    }

    public String getShortLectureContent() {
        return shortLectureContent;
    }
    public void setShortLectureContent(String shortLectureContent) {
        this.shortLectureContent = shortLectureContent;
    }

    public String getShortLabContent() {
        return shortLabContent;
    }

    public void setShortLabContent(String shortLabContent) {
        this.shortLabContent = shortLabContent;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDate () {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLectureContentDescription() {
        return lectureContentDescription;
    }

    public void setLectureContentDescription(String lectureContentDescription) {
        this.lectureContentDescription = lectureContentDescription;
    }

    public String getLabContentDescription() {
        return labContentDescription;
    }

    public void setLabContentDescription(String labContentDescription) {
        this.labContentDescription = labContentDescription;
    }

    public static ArrayList<Course> getCourses() {
        ArrayList<Course> courses = new ArrayList<>();

        courses.add(new Course(
                //shortLectureContent:
                "Introduction & Android Fundamentals",
                //shortLabContent:
                "Android Studio, Git & App basics",
                //week:
                "Week 1",
                //date:
                "18th February",
                //lectureContentDescription:
                "Android Fundamentals & Android App Components",
                //labContentDescription:
                "Get Android Studio Running, Tinker with Git and GitHub & Build Your First App"
        ));

        courses.add(new Course(
                //shortLectureContent:
                "Activities, Lifecycle & Intents",
                //shortLabContent:
                "Activities & Intents",
                //week:
                "Week 2",
                //date:
                "25th February",
                //lectureContentDescription:
                "Activities, Activities Lifecycle & Intents",
                //labContentDescription:
                "Implement 2nd Activity, Build an intent & Launch another activity"
        ));

        courses.add(new Course(
                //shortLectureContent:
                "Layouts & UI",
                //shortLabContent:
                "Designing a UI",
                //week:
                "Week 3",
                //date:
                "4th March",
                //lectureContentDescription:
                "Layouts, Widgets & Widget Attributes",
                //labContentDescription:
                "Implement a Constraint Layout, Design a UI using different widgets & Style a UI applying different text styles"

        ));

        courses.add(new Course(
                //shortLectureContent:
                "Lists & Adapters",
                //shortLabContent:
                "Displaying Items in a List",
                //week:
                "Week 4",
                //date:
                "11th March",
                //lectureContentDescription:
                "ListView, RecyclerView & Adapters",
                //labContentDescription:
                "Implement a Recycler View List, Implement an adapter to populate the list & Connect the list with the Detail Activity"
        ));

        courses.add(new Course(
                //shortLectureContent:
                "Fragments & Multi-layout Apps",
                //shortLabContent:
                "Fragments & Multi-layout Apps",
                //week:
                "Week 5",
                //date:
                "18th March",
                //lectureContentDescription:
                "Fragments, Situational layouts & Multi-layouts apps",
                //labContentDescription:
                "Implement a DetailFragment, Make a situational layout file for tablets & Implement a dual pane master-detail-view"
        ));

        courses.add(new Course(
                //shortLectureContent:
                "APIs, Permissions & Libraries",
                //shortLabContent:
                "APis & JSON",
                //week:
                "Week 6",
                //date:
                "25th March",
                //lectureContentDescription:
                "RESTful APIs, JSON & Libraries (GSON example)",
                //labContentDescription:
                "Implement GSON deserializer to convert JSON string from BeerDB, Connect deserializer to RecycleView adapter to display data"
        ));

        courses.add(new Course(
                //shortLectureContent:
                "Networking",
                //shortLabContent:
                "Networking",
                //week:
                "Week 7",
                //date:
                "1st April",
                //lectureContentDescription:
                "Networking",
                //labContentDescription:
                "Networking"

        ));

        courses.add(new Course(
                //shortLectureContent:
                "Threads & Async Tasks",
                //shortLabContent:
                "Async Tasks",
                //week:
                "Week 8",
                //date:
                "8th April",
                //lectureContentDescription:
                "Threads & Async Tasks",
                //labContentDescription:
                "Async Tasks"
        ));

        courses.add(new Course(
                //shortLectureContent:
                "Data Saving",
                //shortLabContent:
                "Database",
                //week:
                "Week 9",
                //date:
                "15th April",
                //lectureContentDescription:
                "Data Saving",
                //labContentDescription:
                "Database"
        ));

        courses.add(new Course(
                //shortLectureContent:
                "Outlook & Course Summary",
                //shortLabContent:
                "Revision",
                //week:
                "Week 10",
                //date:
                "22nd April",
                //lectureContentDescription:
                "Outlook & Course Summary",
                //labContentDescription:
                "Revision"
        ));
        return courses;
    }
}
