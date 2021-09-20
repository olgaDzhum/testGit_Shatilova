package ru.gb.shatilova.lesson1;

public class Team {
    private String teamName;
    private String person1;
    private String person2;
    private String person3;
    private String person4;


    public Team(String teamName,String person1,String person2,String person3,String person4) {
        this.person1 = person1;
        this.person2 = person2;
        this.person3 = person3;
        this.person4 = person4;
        this.teamName = teamName;
createArr();

    }
public String getName() {
        return teamName;
}
    public String getPerson1() {
        return person1;
    }
    public String getPerson2() {
        return person2;
    }

    public String getPerson3() {
        return person3;
    }

    public String getPerson4() {
        return person4;
    }

    public void createArr () {
        String[] teamArr = {person1, person2, person3, person4};
        System.out.println("Комманда" + " " + getName());
        System.out.println();
    //    for (int i = 0; i < 4; i++) {

    //        System.out.println(teamArr[i]);
      //  }

    }

public void teamInfo(){
    System.out.println("Информация о команде "+ teamName);
    System.out.println();
    System.out.println("1. "+ person1);
    System.out.println();
    System.out.println("2. "+ person2);
    System.out.println();
    System.out.println("3. "+ person3);
    System.out.println();
    System.out.println("4. "+ person4);
    System.out.println();
}





}
