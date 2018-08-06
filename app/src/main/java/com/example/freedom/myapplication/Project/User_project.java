package com.example.freedom.myapplication.Project;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User_project {
    @SerializedName("pj_id")
    @Expose
    private String pjId;
    @SerializedName("pj_code")
    @Expose
    private String pjCode;
    @SerializedName("pj_name")
    @Expose
    private String pjName;
    @SerializedName("pj_start_date")
    @Expose
    private String pjstartdate;
    @SerializedName("pst_th_name")
    @Expose
    private String pstthname;
    @SerializedName("UsName")
    @Expose
    private String usName;
    @SerializedName("df_pj_id")
    @Expose
    private String dfPjId;

    public String getPjId() {
        return pjId;
    }

    public void setPjId(String pjId) {
        this.pjId = pjId;
    }

    public String getPjCode() {
        return pjCode;
    }

    public void setPjCode(String pjCode) {
        this.pjCode = pjCode;
    }

    public String getPjName() {
        return pjName;
    }

    public void setPjName(String pjName) {
        this.pjName = pjName;
    }

    public String getPjstartdate() {
        return pjstartdate;
    }

    public void setPjstartdate(String pjstartdate) {
        this.pjstartdate = pjstartdate;
    }

    public String getPstthname() {
        return pstthname;
    }

    public void setPstthname(String pstthname) {
        this.pstthname = pstthname;
    }

    public String getUsName() {
        return usName;
    }

    public void setUsName(String usName) {
        this.usName = usName;
    }

    public String getDfPjId() {
        return dfPjId;
    }

    public void setDfPjId(String dfPjId) {
        this.dfPjId = dfPjId;
    }
}
