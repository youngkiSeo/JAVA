package com.green.board11.board.model;

import lombok.Data;

@Data
public class BoardSelDto {
    private int iboard;
    private int page;
    private int row;
    private int startIdx;
}
