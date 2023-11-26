package com.caseanalitica.commons.builder;

import com.caseanalitica.commons.PageResponse;

public class PageResponseBuilder {
    private Long totalRecords;
    private int totalPages;
    private int pageIndex;
    private int pageSize;
    private int code;
    private String status;
    private String message;

    public PageResponseBuilder totalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    public PageResponseBuilder totalPages(int totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public PageResponseBuilder pageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    public PageResponseBuilder pageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public PageResponseBuilder code(int code) {
        this.code = code;
        return this;
    }

    public PageResponseBuilder status(String status) {
        this.status = status;
        return this;
    }

    public PageResponseBuilder message(String message) {
        this.message = message;
        return this;
    }

    public PageResponse build() {
        return new PageResponse(totalRecords, totalPages, pageIndex, pageSize, code, status, message);
    }
}