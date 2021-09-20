package ru.gb.shatilova.lesson1;

import static ru.gb.shatilova.lesson1.Course.*;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Лютики", "Борис", "Петр", "Михаил", "Степан");
        Course course1 = new Course(34, 4, 5);

        team1.teamInfo();

        course1.passCourseArr(team1.getName());
        System.out.println();
        
        course1.results(team1.getName(), team1.getPerson1());
        System.out.println();
        course1.results(team1.getName(), team1.getPerson2());
        System.out.println();
        course1.results(team1.getName(), team1.getPerson3());
        System.out.println();
        course1.results(team1.getName(), team1.getPerson4());
    }




    }


