package com.green.java.dao.model;

public class BoardDetailVo {
    private int iboard;
    private String title;
    private String ctnt;
    private String createdAt;
    private String writer;
    private String writerMainPic;

    public BoardDetailVo(int iboard, String title, String ctnt, String createdAt, String writer, String writerMainPic) {
        this.iboard = iboard;
        this.title = title;
        this.ctnt = ctnt;
        this.createdAt = createdAt;
        this.writer = writer;
        this.writerMainPic = writerMainPic;
    }

    public void setIboard(int iboard) {
        this.iboard = iboard;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCtnt(String ctnt) {
        this.ctnt = ctnt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setWriterMainPic(String writerMainPic) {
        this.writerMainPic = writerMainPic;
    }

    @Override
    public String toString(){
        return String.format("iboard: %d, title : %s, ctnt: %s, createdAt : %s, writer: %s, writerMainPic : %s"
                ,iboard,title,ctnt,createdAt,writer,writerMainPic);

    }
}
