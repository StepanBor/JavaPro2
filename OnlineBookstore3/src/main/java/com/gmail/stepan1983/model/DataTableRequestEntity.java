package com.gmail.stepan1983.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class DataTableRequestEntity {

    Integer draw;
    Integer start;
    Integer length;
    /* name = "search[value]"*/
    String searchValue;
    /*name = "search[regex]" */
    Boolean isRegExUsed;
    /*name = "order[][column]") */
    Integer[] orderColumns;
    /*name = "order[][dir]") */
    String[] orderDir;
    /*name = "columns[][data]")*/
    String[] columnsData;
    /*name = "columns[][name]") */
    String[] columnsName;
    /*name = "columns[][searchable]")*/
    Boolean[] isSearchable;
    /*name = "columns[][orderable]") */
    Boolean[] isOrderable;
    /*name = "columns[][search][value]")*/
    String[] searchColValue;
    /*name = "columns[][search][regex]") */
    Boolean[] isSearchRegex;

    @JsonCreator
    public DataTableRequestEntity(@JsonProperty("draw") Integer draw,
                                  @JsonProperty("Start") Integer start,
                                  @JsonProperty("lenght") Integer length,
                                  @JsonProperty("search[value]") String searchValue,
                                  @JsonProperty("search[regex]") Boolean isRegExUsed,
                                  @JsonProperty("order[][column]") Integer[] orderColumns,
                                  @JsonProperty("order[][dir]") String[] orderDir,
                                  @JsonProperty("columns[][data]") String[] columnsData,
                                  @JsonProperty("columns[][name]") String[] columnsName,
                                  @JsonProperty("columns[][searchable]") Boolean[] isSearchable,
                                  @JsonProperty("columns[][orderable]") Boolean[] isOrderable,
                                  @JsonProperty("columns[][search][value]") String[] searchColValue,
                                  @JsonProperty("columns[][search][regex]") Boolean[] isSearchRegex) {
        this.draw = draw;
        this.start = start;
        this.length = length;
        this.searchValue = searchValue;
        this.isRegExUsed = isRegExUsed;
        this.orderColumns = orderColumns;
        this.orderDir = orderDir;
        this.columnsData = columnsData;
        this.columnsName = columnsName;
        this.isSearchable = isSearchable;
        this.isOrderable = isOrderable;
        this.searchColValue = searchColValue;
        this.isSearchRegex = isSearchRegex;
    }

    public DataTableRequestEntity() {
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public Boolean getRegExUsed() {
        return isRegExUsed;
    }

    public void setRegExUsed(Boolean regExUsed) {
        isRegExUsed = regExUsed;
    }

    public Integer[] getOrderColumns() {
        return orderColumns;
    }

    public void setOrderColumns(Integer[] orderColumns) {
        this.orderColumns = orderColumns;
    }

    public String[] getOrderDir() {
        return orderDir;
    }

    public void setOrderDir(String[] orderDir) {
        this.orderDir = orderDir;
    }

    public String[] getColumnsData() {
        return columnsData;
    }

    public void setColumnsData(String[] columnsData) {
        this.columnsData = columnsData;
    }

    public String[] getColumnsName() {
        return columnsName;
    }

    public void setColumnsName(String[] columnsName) {
        this.columnsName = columnsName;
    }

    public Boolean[] getIsSearchable() {
        return isSearchable;
    }

    public void setIsSearchable(Boolean[] isSearchable) {
        this.isSearchable = isSearchable;
    }

    public Boolean[] getIsOrderable() {
        return isOrderable;
    }

    public void setIsOrderable(Boolean[] isOrderable) {
        this.isOrderable = isOrderable;
    }

    public String[] getSearchColValue() {
        return searchColValue;
    }

    public void setSearchColValue(String[] searchColValue) {
        this.searchColValue = searchColValue;
    }

    public Boolean[] getIsSearchRegex() {
        return isSearchRegex;
    }

    public void setIsSearchRegex(Boolean[] isSearchRegex) {
        this.isSearchRegex = isSearchRegex;
    }

    @Override
    public String toString() {
        return "DataTableRequestEntity{" +
                "draw=" + draw +
                ", Start=" + start +
                ", length=" + length +
                ", searchValue='" + searchValue + '\'' +
                ", isRegExUsed=" + isRegExUsed +
                ", orderColumns=" + Arrays.toString(orderColumns) +
                ", orderDir=" + Arrays.toString(orderDir) +
                ", columnsData=" + Arrays.toString(columnsData) +
                ", columnsName=" + Arrays.toString(columnsName) +
                ", isSearchable=" + Arrays.toString(isSearchable) +
                ", isOrderable=" + Arrays.toString(isOrderable) +
                ", searchColValue=" + Arrays.toString(searchColValue) +
                ", isSearchRegex=" + Arrays.toString(isSearchRegex) +
                '}';
    }
}
