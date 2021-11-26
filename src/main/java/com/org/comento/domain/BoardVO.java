package com.org.comento.domain;

import lombok.Data;

import java.util.Date;

@Data
public class BoardVO {

    private Long no;
    private String title;
    private String content;
    private String writer;
    private Date writeDate;
    private Long hit;
    private String pw;

}
