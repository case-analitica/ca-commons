package com.caseanalitica.commons;

import com.caseanalitica.commons.builder.PageResponseBuilder;
import org.junit.Assert;
import org.junit.Test;

public class PaginationDataTest {

    @Test
    public void buildPageResponse() {

        PaginationData paginationData = new PageResponseBuilder()
                .totalPages(1)
                .pageIndex(1)
                .totalRecords(1L)
                .pageSize(1)
                .build();

        Assert.assertEquals(1, paginationData.totalPages());
        Assert.assertEquals(1, paginationData.pageIndex());
        Assert.assertEquals("1", paginationData.totalRecords().toString());
        Assert.assertEquals(1, paginationData.pageSize());

    }

}