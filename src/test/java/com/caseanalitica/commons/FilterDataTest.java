package com.caseanalitica.commons;

import com.caseanalitica.commons.builder.FilterDataBuilder;
import org.junit.Assert;
import org.junit.Test;

public class FilterDataTest {

    @Test
    public void buildPageInformationRequestWithoutParameters() {

        FilterData filterData = new FilterData();
        filterData.setFilterName("test");
        filterData.setFilterValue("test");
        filterData.setPageSize(1);
        filterData.setDirection("ASC");
        filterData.setSort("test");
        filterData.setPageIndex(1);


        Assert.assertEquals("test", filterData.getFilterValue());
        Assert.assertEquals("test", filterData.getFilterName());
        Assert.assertEquals("1", filterData.getPageSize().toString());
        Assert.assertEquals("ASC", filterData.getDirection());
        Assert.assertEquals("test", filterData.getSort());
        Assert.assertEquals("1", filterData.getPageIndex().toString());


    }

    @Test
    public void buildPageInformationRequestWithParameters() {

        FilterData filterData = new FilterData("test", "test", 1, "test", "ASC", 1);

        Assert.assertEquals("test", filterData.getFilterValue());
        Assert.assertEquals("test", filterData.getFilterName());
        Assert.assertEquals("1", filterData.getPageSize().toString());
        Assert.assertEquals("ASC", filterData.getDirection());
        Assert.assertEquals("test", filterData.getSort());
        Assert.assertEquals("1", filterData.getPageIndex().toString());


    }

    @Test
    public void buildFilterDataBuilderWithoutParameters() {

        var filterData = new FilterDataBuilder()
                .filterName("test")
                .filterValue("test")
                .pageIndex(1)
                .sort("ASC")
                .direction("test")
                .pageSize(1)
                .build();

        Assert.assertEquals("test", filterData.getFilterName());
        Assert.assertEquals("test", filterData.getFilterValue());
        Assert.assertEquals("1", filterData.getPageIndex().toString());
        Assert.assertEquals("ASC", filterData.getSort());
        Assert.assertEquals("test", filterData.getDirection());
        Assert.assertEquals("1", filterData.getPageSize().toString());





    }

}