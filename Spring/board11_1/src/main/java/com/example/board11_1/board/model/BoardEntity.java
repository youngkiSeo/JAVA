package com.example.board11_1.board.model;

import lombok.Data;

@Data
public class BoardEntity {
    private int iboard;
    private String title;
    private String ctnt;
    private String iuser;
    private String createdAt;
    private String updatedAt;
}
