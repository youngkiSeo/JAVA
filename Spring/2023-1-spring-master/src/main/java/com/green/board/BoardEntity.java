package com.green.board;

import lombok.Data;

@Data
public class BoardEntity {
    private int iboard;
    private String title; //안녕
    private String ctnt; //잘가
    private String writer; //또보자
    private String createdAt;
    private String updatedAt;
}
