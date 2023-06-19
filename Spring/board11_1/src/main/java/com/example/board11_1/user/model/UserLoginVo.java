package com.example.board11_1.user.model;

import lombok.Data;

@Data
public class UserLoginVo {
    private String uid;
    private String upw;
    private String nm;
    private char gender;
    private String addr;
    private String mainPic;
}
