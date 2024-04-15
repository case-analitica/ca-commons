package com.caseanalitica.commons;

import com.caseanalitica.commons.builder.PaginationDataBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ResponseTest {

    @Test
    public void buildResponseSuccessWithParameter() {

        PaginationData paginationData = new PaginationDataBuilder()
                .pageSize(1)
                .pageIndex(1)
                .totalPages(1)
                .totalRecords(1L)
                .build();

        Response<String> response = new Response<>();
        Assert.assertNotNull(response.ofSuccess(paginationData, List.of()));

    }

    @Test
    public void buildResponseSuccessWithoutParameter() {

        Response<String> response = new Response<>();
        Assert.assertNotNull(response.ofSuccess(List.of()));

    }


}