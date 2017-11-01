package com.example3.demo3.query;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter@ToString
public class QueryObject {
    private int page = 1;
    private int rows = 10;

    public int getStart() {
        return (page-1)*rows;
    }
}
