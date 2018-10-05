package com.mmall.beans;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;

public class PageQuery {

    @Getter
    @Setter
    @Min(value = 1, message = "当前页码不合法")
    private int pageNo = 1;   //第几页

    @Getter
    @Setter
    @Min(value = 1, message = "每页展示数量不合法")
    private int pageSize = 10;  //每页的数量

    @Setter
    private int offset;  //mysql查询时limit 第一个参数offset

    public int getOffset() {
        return (pageNo - 1) * pageSize;
    }
}
