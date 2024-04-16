package com.caseanalitica.commons.builder;

import com.caseanalitica.commons.FilterData;

public class FilterDataBuilder {
    private String filterName;
    private String filterValue;
    private int pageIndex;
    private String sort;
    private String direction;
    private int pageSize;

    public FilterDataBuilder filterName(String filterName) {
        this.filterName = filterName;
        return this;
    }

    public FilterDataBuilder filterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }

    public FilterDataBuilder pageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    public FilterDataBuilder sort(String sort) {
        this.sort = sort;
        return this;
    }

    public FilterDataBuilder direction(String direction) {
        this.direction = direction;
        return this;
    }

    public FilterDataBuilder pageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public FilterData build() {
        return new FilterData(filterName, filterValue, pageIndex, sort, direction, pageSize);
    }
}