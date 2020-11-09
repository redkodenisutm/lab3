package com.company;

public class GameDeveloper extends Developer{

    GameDeveloper(String fullname, int experience, String company) {
        super(fullname, experience, company);
    }

    GameDeveloper(String fullname) {
        super(fullname);
    }

    public void develope(){
        System.out.println(this.getFullname() + " develope games");
    }


}
