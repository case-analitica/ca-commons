package com.caseanalitica.commons;

import java.util.List;

public class Response<T> {

    private ApiResponse<T> apiResponse;

    public ApiResponse<T> ofSuccess(PaginationData paginationData, List<T> data) {

        this.apiResponse = new ApiResponse<>();
        Meta meta = new Meta();

        meta.setTotalRecords(paginationData.totalRecords());
        meta.setTotalPages(paginationData.totalPages());
        meta.setPageIndex(paginationData.pageIndex());
        meta.setPageSize(paginationData.pageSize());

        apiResponse.setMeta(meta);
        apiResponse.setData(data);

        return apiResponse;

    }

    public ApiResponse<T> ofSuccess(List<T> data) {

        this.apiResponse = new ApiResponse<>();
        apiResponse.setData(data);

        return apiResponse;

    }

}
