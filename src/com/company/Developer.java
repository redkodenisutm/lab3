package com.company;

public class Developer {
    private String fullname;
    private int experience;
    private String company;

    Developer(String fullname, int experience, String company) {
        this.fullname = fullname;
        this.experience = experience;
        this.company = company;
    }

    Developer(String fullname) {
        this.fullname = fullname;
        this.experience = 0;
        this.company = "freelance";
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int exp) {
        experience = exp;
    }

    public String getCompany() {
        return company;
    }

    public String getFullname() {
        return fullname;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void develope() {
        System.out.println(fullname + " develope applications");
    }
}
