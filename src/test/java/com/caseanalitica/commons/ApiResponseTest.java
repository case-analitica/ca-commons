package com.caseanalitica.commons;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ApiResponseTest {

    @Test
    public void buildApiResponseSuccessWithoutParameters() {

        ApiResponse<String> apiResponse = new ApiResponse<>();
        apiResponse.setMeta(new Meta());
        apiResponse.setData(List.of());

        Assert.assertNotNull(apiResponse.getMeta());
        Assert.assertNotNull(apiResponse.getData());

    }

    @Test
    public void buildApiResponseSuccessWithParameters() {

        ApiResponse<String> apiResponse = new ApiResponse<>(new Meta(), List.of());

        Assert.assertNotNull(apiResponse.getMeta());
        Assert.assertNotNull(apiResponse.getData());

    }


}