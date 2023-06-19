package com.example.board11_1.cmt.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CmtRes {
    private int maxPage;
    private int row;
    private int isMore;
    private List<CmtVo> list;
}
