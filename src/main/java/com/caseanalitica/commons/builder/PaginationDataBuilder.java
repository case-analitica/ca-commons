package com.caseanalitica.commons.builder;

import com.caseanalitica.commons.PaginationData;

public class PaginationDataBuilder {
    private Long totalRecords;
    private int totalPages;
    private int pageIndex;
    private int pageSize;

    public PaginationDataBuilder totalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    public PaginationDataBuilder totalPages(int totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public PaginationDataBuilder pageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    public PaginationDataBuilder pageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public PaginationData build() {
        return new PaginationData(totalRecords, totalPages, pageIndex, pageSize);
    }
}