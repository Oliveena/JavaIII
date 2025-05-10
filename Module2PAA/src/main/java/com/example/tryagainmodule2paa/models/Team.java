package com.example.tryagainmodule2paa.models;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Employee> {
    private List<T> teamMembers = new ArrayList<>();

    public void addTeamMember(T teamMember) {
        teamMembers.add(teamMember);
    }

    public void removeTeamMember(T teamMember) {
        teamMembers.remove(teamMember);
    }

    public List<T> getTeamMembers() {
        return teamMembers;
    }

    // This method prints detailed information of all team members
    public void printTeamInfo() {
        for (T member : teamMembers) {
            System.out.println(member.displayInfo());
        }
    }
}

