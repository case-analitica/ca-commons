package com.caseanalitica.commons;

import org.junit.Assert;
import org.junit.Test;

public class PageInformationRequestTest {

    @Test
    public void buildPageInformationRequestWithoutParameters() {

        PageInformationRequest pageInformationRequest = new PageInformationRequest();
        pageInformationRequest.setFilterName("test");
        pageInformationRequest.setFilterValue("test");
        pageInformationRequest.setPageSize(1);
        pageInformationRequest.setDirection("ASC");
        pageInformationRequest.setSort("test");
        pageInformationRequest.setPage(1);


        Assert.assertEquals("test", pageInformationRequest.getFilterValue());
        Assert.assertEquals("test", pageInformationRequest.getFilterName());
        Assert.assertEquals("1", pageInformationRequest.getPageSize().toString());
        Assert.assertEquals("ASC", pageInformationRequest.getDirection());
        Assert.assertEquals("test", pageInformationRequest.getSort());
        Assert.assertEquals("1", pageInformationRequest.getPage().toString());


    }

    @Test
    public void buildPageInformationRequestWithParameters() {

        PageInformationRequest pageInformationRequest = new PageInformationRequest("test", "test", 1, "test", "ASC", 1);

        Assert.assertEquals("test", pageInformationRequest.getFilterValue());
        Assert.assertEquals("test", pageInformationRequest.getFilterName());
        Assert.assertEquals("1", pageInformationRequest.getPageSize().toString());
        Assert.assertEquals("ASC", pageInformationRequest.getDirection());
        Assert.assertEquals("test", pageInformationRequest.getSort());
        Assert.assertEquals("1", pageInformationRequest.getPage().toString());


    }

}