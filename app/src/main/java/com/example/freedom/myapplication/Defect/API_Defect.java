package com.example.freedom.myapplication.Defect;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class API_Defect {

    @SerializedName("df_pj_id")
    @Expose
    private Integer dfPjId;
    @SerializedName("df_code")
    @Expose
    private String dfCode;
    @SerializedName("sv_code")
    @Expose
    private String svCode;
    @SerializedName("sv_th_name")
    @Expose
    private String svThName;
    @SerializedName("pr_code")
    @Expose
    private String prCode;
    @SerializedName("pr_th_name")
    @Expose
    private String prThName;
    @SerializedName("dft_name")
    @Expose
    private String dftName;
    @SerializedName("dft_description")
    @Expose
    private String dftDescription;
    @SerializedName("dfs_en_name")
    @Expose
    private String dfsEnName;
    @SerializedName("dfs_th_name")
    @Expose
    private String dfsThName;

    public Integer getDfPjId() {
        return dfPjId;
    }

    public void setDfPjId(Integer dfPjId) {
        this.dfPjId = dfPjId;
    }

    public String getDfCode() {
        return dfCode;
    }

    public void setDfCode(String dfCode) {
        this.dfCode = dfCode;
    }

    public String getSvCode() {
        return svCode;
    }

    public void setSvCode(String svCode) {
        this.svCode = svCode;
    }

    public String getSvThName() {
        return svThName;
    }

    public void setSvThName(String svThName) {
        this.svThName = svThName;
    }

    public String getPrCode() {
        return prCode;
    }

    public void setPrCode(String prCode) {
        this.prCode = prCode;
    }

    public String getPrThName() {
        return prThName;
    }

    public void setPrThName(String prThName) {
        this.prThName = prThName;
    }

    public String getDftName() {
        return dftName;
    }

    public void setDftName(String dftName) {
        this.dftName = dftName;
    }

    public String getDftDescription() {
        return dftDescription;
    }

    public void setDftDescription(String dftDescription) {
        this.dftDescription = dftDescription;
    }

    public String getDfsEnName() {
        return dfsEnName;
    }

    public void setDfsEnName(String dfsEnName) {
        this.dfsEnName = dfsEnName;
    }

    public String getDfsThName() {
        return dfsThName;
    }

    public void setDfsThName(String dfsThName) {
        this.dfsThName = dfsThName;
    }
}
