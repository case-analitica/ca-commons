package com.caseanalitica.commons;

import java.util.List;

public class Response<T> {

    private ApiResponse<T> apiResponse;

    public ApiResponse<T> ofSuccess(PageResponse pageResponse, List<T> data) {

        this.apiResponse = new ApiResponse<>();
        Meta meta = new Meta();

        meta.setTotalRecords(pageResponse.getTotalRecords());
        meta.setTotalPages(pageResponse.getTotalPages());
        meta.setPageIndex(pageResponse.getPageIndex());
        meta.setPageSize(pageResponse.getPageSize());

        apiResponse.setCode(pageResponse.getCode());
        apiResponse.setStatus(pageResponse.getStatus());
        apiResponse.setMessage(pageResponse.getMessage());
        apiResponse.setMeta(meta);
        apiResponse.setData(data);

        return apiResponse;

    }

    public ApiResponse<T> ofError(PageResponse pageResponse) {

        this.apiResponse = new ApiResponse<>();

        apiResponse.setCode(pageResponse.getCode());
        apiResponse.setStatus(pageResponse.getStatus());
        apiResponse.setMessage(pageResponse.getMessage());
        apiResponse.setData(List.of());

        return apiResponse;

    }
}
