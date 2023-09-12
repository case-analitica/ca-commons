package com.caseanalitica.model;

import org.junit.Assert;
import org.junit.Test;

public class MetaTest {

    @Test
    public void buildMetaSuccess() {

        Meta meta = new Meta();
        meta.setPage(0);
        meta.setPageSize(1);
        meta.setNextPage("2");
        meta.setPreviousPage("0");
        meta.setTotalPages(3L);
        meta.setTotalRecords(3);

        Assert.assertEquals("0", meta.getPage().toString());
        Assert.assertEquals("1", meta.getPageSize().toString());
        Assert.assertEquals("2", meta.getNextPage());
        Assert.assertEquals("0", meta.getPreviousPage());
        Assert.assertEquals("3", meta.getTotalPages().toString());
        Assert.assertEquals("3", meta.getTotalRecords().toString());


    }

}