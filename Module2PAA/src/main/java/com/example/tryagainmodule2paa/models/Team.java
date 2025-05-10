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

    // Use this method to return team members
    public List<T> getTeamMembers() {
        return teamMembers;
    }

    public void returnTeamMembers(List<T> teamMembers) {
        for (T member : teamMembers) {
            System.out.println(member.getName());
        }
    }
}
