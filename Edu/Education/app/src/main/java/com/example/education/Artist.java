package com.example.education;

public class Artist {


    String uid;
    String email;
    String un;
    String pass;
    String cpass;
    String name;
    String ins;
    String id;
//, String pass, String cpass, String name, String ins, String id
//
//        this.pass = pass;
//        this.cpass = cpass;
//        this.name = name;
//        this.ins = ins;
//        this.id = id;
    public Artist(String uid, String email, String un) {
        this.uid = uid;
        this.email = email;
        this.un = un;
    }
    public String getUid() {
        return uid;
    }

    public String getUn() {
        return un;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getCpass() {
        return cpass;
    }

    public String getName() {
        return name;
    }

    public String getIns() {
        return ins;
    }

    public String getId() {
        return id;
    }

    public Artist() {
    }

}
