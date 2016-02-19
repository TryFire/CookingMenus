package com.example.function.cookingmenus.service.model.Category;

import com.google.gson.annotations.SerializedName;

import java.util.*;
import java.util.List;

/**
 * Created by function on 2016/1/28.
 */
public class CategoryResp {
    @SerializedName("resultcode")
    private String resultCode;
    private String reason;
    @SerializedName("result")
    //private String result;
    //private java.util.List<String> result = new ArrayList<String>();
    private List<Result> result = new ArrayList<>();
    @SerializedName("error_code")
    private Integer errorCode;

    /**
     *
     * @return
     * The resultcode
     */
    public String getResultcode() {
        return resultCode;
    }

    /**
     *
     * @param resultCode
     * The resultcode
     */
    public void setResultcode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     *
     * @return
     * The reason
     */
    public String getReason() {
        return reason;
    }

    /**
     *
     * @param reason
     * The reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     *
     * @return
     * The result
     */
    public List<Result> getResult() {
        return result;
    }

    /**
     *
     * @param result
     * The result
     */
    public void setResult(List<Result> result) {
        this.result = result;
    }

    /**
     *
     * @return
     * The errorCode
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     *
     * @param errorCode
     * The error_code
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }


}
