package com.caseanalitica.commons;

import com.caseanalitica.commons.builder.PageResponseBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ResponseTest {

    @Test
    public void buildResponseSuccessWithParameter() {

        PageResponse pageResponse = new PageResponseBuilder()
                .code(200)
                .status("ok")
                .message("success")
                .build();

        Response<String> response = new Response<>();
        var actualResponse = response.ofSuccess(pageResponse, List.of());

        Assert.assertEquals("200", actualResponse.getCode().toString());
        Assert.assertEquals("ok", actualResponse.getStatus());
        Assert.assertEquals("success", actualResponse.getMessage());

    }

    @Test
    public void buildResponseErrorWithParameter() {

        PageResponse pageResponse = new PageResponseBuilder()
                .code(400)
                .status("nok")
                .message("error")
                .build();

        Response<String> response = new Response<>();
        var actualResponse = response.ofError(pageResponse);

        Assert.assertEquals("400", actualResponse.getCode().toString());
        Assert.assertEquals("nok", actualResponse.getStatus());
        Assert.assertEquals("error", actualResponse.getMessage());

    }


}