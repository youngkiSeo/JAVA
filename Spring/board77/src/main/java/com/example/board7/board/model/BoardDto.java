package com.example.board7.board.model;

import lombok.Data;

//BoardEntity 상속받아 프론트에서 넘어오는게 Entity와 다른 내용이 넘어온다면 여기를 늘려준다
// 기능이 늘어나는
@Data
public class BoardDto extends BoardEntity{
    private int page;
    private int startsIdx;
    private int rowLen;


}
