package com.caseanalitica.commons;

import com.caseanalitica.commons.builder.PageResponseBuilder;
import org.junit.Assert;
import org.junit.Test;

public class PageResponseTest {

    @Test
    public void buildPageResponse() {

        PageResponse pageResponse = new PageResponseBuilder()
                .totalPages(1)
                .pageIndex(1)
                .totalRecords(1L)
                .pageSize(1)
                .code(200)
                .status("ok")
                .message("success")
                .build();

        Assert.assertEquals(1, pageResponse.getTotalPages());
        Assert.assertEquals(1, pageResponse.getPageIndex());
        Assert.assertEquals("1", pageResponse.getTotalRecords().toString());
        Assert.assertEquals(1, pageResponse.getPageSize());
        Assert.assertEquals(200, pageResponse.getCode());
        Assert.assertEquals("ok", pageResponse.getStatus());
        Assert.assertEquals("success", pageResponse.getMessage());

    }

}