package com.example.board11_1.board.model;

import lombok.Data;

@Data
public class BoardVo {
    private int iboard;
    private String title;
    private String ctnt;
    private int iuser;
    private String updated_at;
}
