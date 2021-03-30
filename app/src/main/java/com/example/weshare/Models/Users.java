package com.example.weshare.Models;

import android.net.Uri;

public class Users {
    private String userDetailKey;
    private String id;
    private String email;
    private String uname;
    private Uri imageURL;
    private String status;

    public Users(String id, String uname, String email, Uri imageURL){
        this.id = id;
        this.uname = uname;
        this.email = email;
        this.imageURL = imageURL;
       // this.status = status;
    }
    public Users(){

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserDetailKey() {
        return userDetailKey;
    }

    public void setUserDetailKey(String userDetailKey) {
        this.userDetailKey = userDetailKey;
    }

    public Uri getImageURL() {
        return imageURL;
    }

    public void setImageURL(Uri imageURL) {
        this.imageURL = imageURL;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
