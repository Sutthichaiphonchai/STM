package com.example.freedom.myapplication.Login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class API_Login {
    @SerializedName("UsID")
    @Expose
    private Integer usID;
    @SerializedName("UsName")
    @Expose
    private String usName;
    @SerializedName("UsLogin")
    @Expose
    private String usLogin;
    @SerializedName("UsPassword")
    @Expose
    private String usPassword;
    @SerializedName("UsPsCode")
    @Expose
    private String usPsCode;
    @SerializedName("UsWgID")
    @Expose
    private Integer usWgID;
    @SerializedName("UsQsID")
    @Expose
    private Integer usQsID;
    @SerializedName("UsAnswer")
    @Expose
    private String usAnswer;
    @SerializedName("UsEmail")
    @Expose
    private String usEmail;
    @SerializedName("UsActive")
    @Expose
    private Integer usActive;
    @SerializedName("UsAdmin")
    @Expose
    private Integer usAdmin;
    @SerializedName("UsDesc")
    @Expose
    private String usDesc;
    @SerializedName("UsPwdExpDt")
    @Expose
    private String usPwdExpDt;
    @SerializedName("UsUpdDt")
    @Expose
    private String usUpdDt;
    @SerializedName("UsUpdUsID")
    @Expose
    private Integer usUpdUsID;
    @SerializedName("UsSessionID")
    @Expose
    private String usSessionID;
    @SerializedName("UsDpID")
    @Expose
    private Integer usDpID;
    @SerializedName("dpName")
    @Expose
    private String dpName;

    public Integer getUsID() {
        return usID;
    }

    public void setUsID(Integer usID) {
        this.usID = usID;
    }

    public String getUsName() {
        return usName;
    }

    public void setUsName(String usName) {
        this.usName = usName;
    }

    public String getUsLogin() {
        return usLogin;
    }

    public void setUsLogin(String usLogin) {
        this.usLogin = usLogin;
    }

    public String getUsPassword() {
        return usPassword;
    }

    public void setUsPassword(String usPassword) {
        this.usPassword = usPassword;
    }

    public String getUsPsCode() {
        return usPsCode;
    }

    public void setUsPsCode(String usPsCode) {
        this.usPsCode = usPsCode;
    }

    public Integer getUsWgID() {
        return usWgID;
    }

    public void setUsWgID(Integer usWgID) {
        this.usWgID = usWgID;
    }

    public Integer getUsQsID() {
        return usQsID;
    }

    public void setUsQsID(Integer usQsID) {
        this.usQsID = usQsID;
    }

    public String getUsAnswer() {
        return usAnswer;
    }

    public void setUsAnswer(String usAnswer) {
        this.usAnswer = usAnswer;
    }

    public String getUsEmail() {
        return usEmail;
    }

    public void setUsEmail(String usEmail) {
        this.usEmail = usEmail;
    }

    public Integer getUsActive() {
        return usActive;
    }

    public void setUsActive(Integer usActive) {
        this.usActive = usActive;
    }

    public Integer getUsAdmin() {
        return usAdmin;
    }

    public void setUsAdmin(Integer usAdmin) {
        this.usAdmin = usAdmin;
    }

    public String getUsDesc() {
        return usDesc;
    }

    public void setUsDesc(String usDesc) {
        this.usDesc = usDesc;
    }

    public String getUsPwdExpDt() {
        return usPwdExpDt;
    }

    public void setUsPwdExpDt(String usPwdExpDt) {
        this.usPwdExpDt = usPwdExpDt;
    }

    public String getUsUpdDt() {
        return usUpdDt;
    }

    public void setUsUpdDt(String usUpdDt) {
        this.usUpdDt = usUpdDt;
    }

    public Integer getUsUpdUsID() {
        return usUpdUsID;
    }

    public void setUsUpdUsID(Integer usUpdUsID) {
        this.usUpdUsID = usUpdUsID;
    }

    public String getUsSessionID() {
        return usSessionID;
    }

    public void setUsSessionID(String usSessionID) {
        this.usSessionID = usSessionID;
    }

    public Integer getUsDpID() {
        return usDpID;
    }

    public void setUsDpID(Integer usDpID) {
        this.usDpID = usDpID;
    }

    public String getDpName() { return dpName; }

    public void setDpName(String dpName) { this.dpName = dpName; }
}
