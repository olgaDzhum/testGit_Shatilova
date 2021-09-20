package ru.gb.shatilova.lesson1;

public class Course {
    private int run;
    private int swim;
    private int jump;

    public Course(int run, int swim, int jump) {
        this.run = run;
        this.swim = swim;
        this.jump = jump;

    }

    public void passCourseArr(String nameTeam) {
        int[] courseArr = {run, swim, jump};
        System.out.println("Уважаемые " + nameTeam+ "! Пройдите пожалуйста Вашу дистанцию: ");
        System.out.println("Бег: " + courseArr[0] +" км");
        System.out.println("Плавание: " + courseArr[1]+" км");
        System.out.println("Прыжки: " + courseArr[2]+" км");
        }
    public void results(String teamName,String namePerson){
        System.out.println("Участник команды " + teamName+ " "+ namePerson);
        System.out.println("Пробежал: " + run +" км");
        System.out.println("Проплыл: " + swim+" км");
        System.out.println("Пропрыгал: " + jump+" км");

    }


    }

