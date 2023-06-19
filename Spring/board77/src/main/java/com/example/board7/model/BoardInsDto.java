package com.example.board7.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class BoardInsDto {
    private String title;
    private String ctnt;
    @Schema(description =  "작성자",hidden = false)
    private String writer;
}
