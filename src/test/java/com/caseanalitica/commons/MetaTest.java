package com.caseanalitica.commons;

import org.junit.Assert;
import org.junit.Test;

public class MetaTest {

    @Test
    public void buildMetaSuccessWithoutParameters() {

        Meta meta = new Meta();
        meta.setPageIndex(0);
        meta.setPageSize(1);
        meta.setTotalPages(3);
        meta.setTotalRecords(3L);

        Assert.assertEquals("0", meta.getPageIndex().toString());
        Assert.assertEquals("1", meta.getPageSize().toString());
        Assert.assertEquals("3", meta.getTotalPages().toString());
        Assert.assertEquals("3", meta.getTotalRecords().toString());

    }

    @Test
    public void buildMetaSuccessWithParameters() {

        Meta meta = new Meta(0, 1, 3, 3L);

        Assert.assertEquals("0", meta.getPageIndex().toString());
        Assert.assertEquals("1", meta.getPageSize().toString());
        Assert.assertEquals("3", meta.getTotalPages().toString());
        Assert.assertEquals("3", meta.getTotalRecords().toString());

    }

}