package com.example.function.cookingmenus.service.model.categorydetail;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by function on 2016/2/19.
 */
public class Result {

    @SerializedName("data")
    private List<Datum> data = new ArrayList<Datum>();
    @SerializedName("totalNum")
    private String totalNum;
    @SerializedName("pn")
    private String pn;
    @SerializedName("rn")
    private String rn;

    /**
     *
     * @return
     * The data
     */
    public List<Datum> getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(List<Datum> data) {
        this.data = data;
    }

    /**
     *
     * @return
     * The totalNum
     */
    public String getTotalNum() {
        return totalNum;
    }

    /**
     *
     * @param totalNum
     * The totalNum
     */
    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

    /**
     *
     * @return
     * The pn
     */
    public String getPn() {
        return pn;
    }

    /**
     *
     * @param pn
     * The pn
     */
    public void setPn(String pn) {
        this.pn = pn;
    }

    /**
     *
     * @return
     * The rn
     */
    public String getRn() {
        return rn;
    }

    /**
     *
     * @param rn
     * The rn
     */
    public void setRn(String rn) {
        this.rn = rn;
    }

}
