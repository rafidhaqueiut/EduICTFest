package com.example.education;

public class Artist {
    String id, name,group;
    public Artist() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public Artist(String id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }
}
