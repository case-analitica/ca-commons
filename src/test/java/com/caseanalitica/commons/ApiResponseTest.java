package com.caseanalitica.commons;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ApiResponseTest {

    @Test
    public void buildApiResponseSuccessWithoutParameters() {

        ApiResponse<String> apiResponse = new ApiResponse<>();
        apiResponse.setCode(200);
        apiResponse.setStatus("success");
        apiResponse.setMessage("customer-api-ok");
        apiResponse.setMeta(new Meta());
        apiResponse.setData(List.of());

        Assert.assertEquals("200", apiResponse.getCode().toString());
        Assert.assertEquals("success", apiResponse.getStatus());
        Assert.assertEquals("customer-api-ok", apiResponse.getMessage());
        Assert.assertNotNull(apiResponse.getMeta());
        Assert.assertNotNull(apiResponse.getData());

    }

    @Test
    public void buildApiResponseSuccessWithParameters() {

        ApiResponse<String> apiResponse = new ApiResponse<>(200, "success", "customer-api-ok", new Meta(), List.of());

        Assert.assertEquals("200", apiResponse.getCode().toString());
        Assert.assertEquals("success", apiResponse.getStatus());
        Assert.assertEquals("customer-api-ok", apiResponse.getMessage());
        Assert.assertNotNull(apiResponse.getMeta());
        Assert.assertNotNull(apiResponse.getData());

    }


}