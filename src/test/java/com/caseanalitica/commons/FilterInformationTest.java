package com.caseanalitica.commons;

import org.junit.Assert;
import org.junit.Test;

public class FilterInformationTest {

    @Test
    public void buildPageInformationRequestWithoutParameters() {

        FilterInformation filterInformation = new FilterInformation();
        filterInformation.setFilterName("test");
        filterInformation.setFilterValue("test");
        filterInformation.setPageSize(1);
        filterInformation.setDirection("ASC");
        filterInformation.setSort("test");
        filterInformation.setPage(1);


        Assert.assertEquals("test", filterInformation.getFilterValue());
        Assert.assertEquals("test", filterInformation.getFilterName());
        Assert.assertEquals("1", filterInformation.getPageSize().toString());
        Assert.assertEquals("ASC", filterInformation.getDirection());
        Assert.assertEquals("test", filterInformation.getSort());
        Assert.assertEquals("1", filterInformation.getPage().toString());


    }

    @Test
    public void buildPageInformationRequestWithParameters() {

        FilterInformation filterInformation = new FilterInformation("test", "test", 1, "test", "ASC", 1);

        Assert.assertEquals("test", filterInformation.getFilterValue());
        Assert.assertEquals("test", filterInformation.getFilterName());
        Assert.assertEquals("1", filterInformation.getPageSize().toString());
        Assert.assertEquals("ASC", filterInformation.getDirection());
        Assert.assertEquals("test", filterInformation.getSort());
        Assert.assertEquals("1", filterInformation.getPage().toString());


    }

}