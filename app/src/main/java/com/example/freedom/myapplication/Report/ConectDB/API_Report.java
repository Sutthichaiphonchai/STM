package com.example.freedom.myapplication.Report.ConectDB;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class API_Report {
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
    @SerializedName("sv_code_low")
    @Expose
    private Integer svCodeLow;
    @SerializedName("sv_code_Medium")
    @Expose
    private Integer svCodeMedium;
    @SerializedName("sv_code_High")
    @Expose
    private Integer svCodeHigh;
    @SerializedName("sv_code_Critical")
    @Expose
    private Integer svCodeCritical;
    @SerializedName("Sv_Percent_Low")
    @Expose
    private String svPercentLow;
    @SerializedName("Sv_Percent_Medium")
    @Expose
    private String svPercentMedium;
    @SerializedName("Sv_Percent_High")
    @Expose
    private String svPercentHigh;
    @SerializedName("Sv_Percent_Critical")
    @Expose
    private String svPercentCritical;
    @SerializedName("Sv_Totalnumber")
    @Expose
    private Integer svTotalnumber;
    @SerializedName("Sv_TotalPerNumber")
    @Expose
    private String svTotalPerNumber;
    @SerializedName("pr_code_low")
    @Expose
    private Integer prCodeLow;
    @SerializedName("pr_code_Medium")
    @Expose
    private Integer prCodeMedium;
    @SerializedName("pr_code_High")
    @Expose
    private Integer prCodeHigh;
    @SerializedName("pr_code_Urgent")
    @Expose
    private Integer prCodeUrgent;
    @SerializedName("Pr_Percent_Low")
    @Expose
    private String prPercentLow;
    @SerializedName("Pr_Percent_Medium")
    @Expose
    private String prPercentMedium;
    @SerializedName("Pr_Percent_High")
    @Expose
    private String prPercentHigh;
    @SerializedName("Pr_Percent_Urgent")
    @Expose
    private String prPercentUrgent;
    @SerializedName("Pr_Totalnumber")
    @Expose
    private Integer prTotalnumber;
    @SerializedName("Pr_TotalPerNumber")
    @Expose
    private String prTotalPerNumber;
    @SerializedName("Type_Documentation")
    @Expose
    private Integer typeDocumentation;
    @SerializedName("Type_Syntax")
    @Expose
    private Integer typeSyntax;
    @SerializedName("Type_Build_Package")
    @Expose
    private Integer typeBuildPackage;
    @SerializedName("Type_Assignment")
    @Expose
    private Integer typeAssignment;
    @SerializedName("Type_Interface")
    @Expose
    private Integer typeInterface;
    @SerializedName("Type_Checking")
    @Expose
    private Integer typeChecking;
    @SerializedName("Type_Data")
    @Expose
    private Integer typeData;
    @SerializedName("Type_Function")
    @Expose
    private Integer typeFunction;
    @SerializedName("Type_System")
    @Expose
    private Integer typeSystem;
    @SerializedName("Type_Environment")
    @Expose
    private Integer typeEnvironment;
    @SerializedName("Type_Documentation_percent")
    @Expose
    private String typeDocumentationPercent;
    @SerializedName("Type_Syntax_percent")
    @Expose
    private String typeSyntaxPercent;
    @SerializedName("Type_Build_Package_percent")
    @Expose
    private String typeBuildPackagePercent;
    @SerializedName("Type_Assignment_percent")
    @Expose
    private String typeAssignmentPercent;
    @SerializedName("Type_Interface_percent")
    @Expose
    private String typeInterfacePercent;
    @SerializedName("Type_Checking_percent")
    @Expose
    private String typeCheckingPercent;
    @SerializedName("Type_Data_percent")
    @Expose
    private String typeDataPercent;
    @SerializedName("Type_Function_percent")
    @Expose
    private String typeFunctionPercent;
    @SerializedName("Type_System_percent")
    @Expose
    private String typeSystemPercent;
    @SerializedName("Type_Environment_percent")
    @Expose
    private String typeEnvironmentPercent;
    @SerializedName("TotalNumber_Type")
    @Expose
    private Integer totalNumberType;
    @SerializedName("TotalNumber_Type_Percentage")
    @Expose
    private String totalNumberTypePercentage;
    @SerializedName("Status_New")
    @Expose
    private Integer statusNew;
    @SerializedName("Status_Assigned")
    @Expose
    private Integer statusAssigned;
    @SerializedName("Status_Open")
    @Expose
    private Integer statusOpen;
    @SerializedName("Status_Duplicate")
    @Expose
    private Integer statusDuplicate;
    @SerializedName("Status_Rejected")
    @Expose
    private Integer statusRejected;
    @SerializedName("Status_Deferred")
    @Expose
    private Integer statusDeferred;
    @SerializedName("Status_Not_A_Bug")
    @Expose
    private Integer statusNotABug;
    @SerializedName("Status_Fixed")
    @Expose
    private Integer statusFixed;
    @SerializedName("Status_Pending_Retest")
    @Expose
    private Integer statusPendingRetest;
    @SerializedName("Status_Retest")
    @Expose
    private Integer statusRetest;
    @SerializedName("Status_Re_Opened")
    @Expose
    private Integer statusReOpened;
    @SerializedName("Status_Verified")
    @Expose
    private Integer statusVerified;
    @SerializedName("Status_Closed")
    @Expose
    private Integer statusClosed;
    @SerializedName("Status_New_percent")
    @Expose
    private String statusNewPercent;
    @SerializedName("Status_Assigned_percent")
    @Expose
    private String statusAssignedPercent;
    @SerializedName("Status_Open_percent")
    @Expose
    private String statusOpenPercent;
    @SerializedName("Status_Duplicate_percent")
    @Expose
    private String statusDuplicatePercent;
    @SerializedName("Status_Rejected_percent")
    @Expose
    private String statusRejectedPercent;
    @SerializedName("Status_Deferred_percent")
    @Expose
    private String statusDeferredPercent;
    @SerializedName("Status_Not_A_Bug_percent")
    @Expose
    private String statusNotABugPercent;
    @SerializedName("Status_Fixed_percent")
    @Expose
    private String statusFixedPercent;
    @SerializedName("Status_Pending_Retest_percent")
    @Expose
    private String statusPendingRetestPercent;
    @SerializedName("Status_Retest_percent")
    @Expose
    private String statusRetestPercent;
    @SerializedName("Status_Re_Opened_percent")
    @Expose
    private String statusReOpenedPercent;
    @SerializedName("Status_Verified_percent")
    @Expose
    private String statusVerifiedPercent;
    @SerializedName("Status_Closed_percent")
    @Expose
    private String statusClosedPercent;
    @SerializedName("TotalNumber_Status")
    @Expose
    private Integer totalNumberStatus;
    @SerializedName("TotalNumber_Status_Percentage")
    @Expose
    private String totalNumberStatusPercentage;

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

    public Integer getSvCodeLow() {
        return svCodeLow;
    }

    public void setSvCodeLow(Integer svCodeLow) {
        this.svCodeLow = svCodeLow;
    }

    public Integer getSvCodeMedium() {
        return svCodeMedium;
    }

    public void setSvCodeMedium(Integer svCodeMedium) {
        this.svCodeMedium = svCodeMedium;
    }

    public Integer getSvCodeHigh() {
        return svCodeHigh;
    }

    public void setSvCodeHigh(Integer svCodeHigh) {
        this.svCodeHigh = svCodeHigh;
    }

    public Integer getSvCodeCritical() {
        return svCodeCritical;
    }

    public void setSvCodeCritical(Integer svCodeCritical) {
        this.svCodeCritical = svCodeCritical;
    }

    public String getSvPercentLow() {
        return svPercentLow;
    }

    public void setSvPercentLow(String svPercentLow) {
        this.svPercentLow = svPercentLow;
    }

    public String getSvPercentMedium() {
        return svPercentMedium;
    }

    public void setSvPercentMedium(String svPercentMedium) {
        this.svPercentMedium = svPercentMedium;
    }

    public String getSvPercentHigh() {
        return svPercentHigh;
    }

    public void setSvPercentHigh(String svPercentHigh) {
        this.svPercentHigh = svPercentHigh;
    }

    public String getSvPercentCritical() {
        return svPercentCritical;
    }

    public void setSvPercentCritical(String svPercentCritical) {
        this.svPercentCritical = svPercentCritical;
    }

    public Integer getSvTotalnumber() {
        return svTotalnumber;
    }

    public void setSvTotalnumber(Integer svTotalnumber) {
        this.svTotalnumber = svTotalnumber;
    }

    public String getSvTotalPerNumber() {
        return svTotalPerNumber;
    }

    public void setSvTotalPerNumber(String svTotalPerNumber) {
        this.svTotalPerNumber = svTotalPerNumber;
    }

    public Integer getPrCodeLow() {
        return prCodeLow;
    }

    public void setPrCodeLow(Integer prCodeLow) {
        this.prCodeLow = prCodeLow;
    }

    public Integer getPrCodeMedium() {
        return prCodeMedium;
    }

    public void setPrCodeMedium(Integer prCodeMedium) {
        this.prCodeMedium = prCodeMedium;
    }

    public Integer getPrCodeHigh() {
        return prCodeHigh;
    }

    public void setPrCodeHigh(Integer prCodeHigh) {
        this.prCodeHigh = prCodeHigh;
    }

    public Integer getPrCodeUrgent() {
        return prCodeUrgent;
    }

    public void setPrCodeUrgent(Integer prCodeUrgent) {
        this.prCodeUrgent = prCodeUrgent;
    }

    public String getPrPercentLow() {
        return prPercentLow;
    }

    public void setPrPercentLow(String prPercentLow) {
        this.prPercentLow = prPercentLow;
    }

    public String getPrPercentMedium() {
        return prPercentMedium;
    }

    public void setPrPercentMedium(String prPercentMedium) {
        this.prPercentMedium = prPercentMedium;
    }

    public String getPrPercentHigh() {
        return prPercentHigh;
    }

    public void setPrPercentHigh(String prPercentHigh) {
        this.prPercentHigh = prPercentHigh;
    }

    public String getPrPercentUrgent() {
        return prPercentUrgent;
    }

    public void setPrPercentUrgent(String prPercentUrgent) {
        this.prPercentUrgent = prPercentUrgent;
    }

    public Integer getPrTotalnumber() {
        return prTotalnumber;
    }

    public void setPrTotalnumber(Integer prTotalnumber) {
        this.prTotalnumber = prTotalnumber;
    }

    public String getPrTotalPerNumber() {
        return prTotalPerNumber;
    }

    public void setPrTotalPerNumber(String prTotalPerNumber) {
        this.prTotalPerNumber = prTotalPerNumber;
    }

    public Integer getTypeDocumentation() {
        return typeDocumentation;
    }

    public void setTypeDocumentation(Integer typeDocumentation) {
        this.typeDocumentation = typeDocumentation;
    }

    public Integer getTypeSyntax() {
        return typeSyntax;
    }

    public void setTypeSyntax(Integer typeSyntax) {
        this.typeSyntax = typeSyntax;
    }

    public Integer getTypeBuildPackage() {
        return typeBuildPackage;
    }

    public void setTypeBuildPackage(Integer typeBuildPackage) {
        this.typeBuildPackage = typeBuildPackage;
    }

    public Integer getTypeAssignment() {
        return typeAssignment;
    }

    public void setTypeAssignment(Integer typeAssignment) {
        this.typeAssignment = typeAssignment;
    }

    public Integer getTypeInterface() {
        return typeInterface;
    }

    public void setTypeInterface(Integer typeInterface) {
        this.typeInterface = typeInterface;
    }

    public Integer getTypeChecking() {
        return typeChecking;
    }

    public void setTypeChecking(Integer typeChecking) {
        this.typeChecking = typeChecking;
    }

    public Integer getTypeData() {
        return typeData;
    }

    public void setTypeData(Integer typeData) {
        this.typeData = typeData;
    }

    public Integer getTypeFunction() {
        return typeFunction;
    }

    public void setTypeFunction(Integer typeFunction) {
        this.typeFunction = typeFunction;
    }

    public Integer getTypeSystem() {
        return typeSystem;
    }

    public void setTypeSystem(Integer typeSystem) {
        this.typeSystem = typeSystem;
    }

    public Integer getTypeEnvironment() {
        return typeEnvironment;
    }

    public void setTypeEnvironment(Integer typeEnvironment) {
        this.typeEnvironment = typeEnvironment;
    }

    public String getTypeDocumentationPercent() {
        return typeDocumentationPercent;
    }

    public void setTypeDocumentationPercent(String typeDocumentationPercent) {
        this.typeDocumentationPercent = typeDocumentationPercent;
    }

    public String getTypeSyntaxPercent() {
        return typeSyntaxPercent;
    }

    public void setTypeSyntaxPercent(String typeSyntaxPercent) {
        this.typeSyntaxPercent = typeSyntaxPercent;
    }

    public String getTypeBuildPackagePercent() {
        return typeBuildPackagePercent;
    }

    public void setTypeBuildPackagePercent(String typeBuildPackagePercent) {
        this.typeBuildPackagePercent = typeBuildPackagePercent;
    }

    public String getTypeAssignmentPercent() {
        return typeAssignmentPercent;
    }

    public void setTypeAssignmentPercent(String typeAssignmentPercent) {
        this.typeAssignmentPercent = typeAssignmentPercent;
    }

    public String getTypeInterfacePercent() {
        return typeInterfacePercent;
    }

    public void setTypeInterfacePercent(String typeInterfacePercent) {
        this.typeInterfacePercent = typeInterfacePercent;
    }

    public String getTypeCheckingPercent() {
        return typeCheckingPercent;
    }

    public void setTypeCheckingPercent(String typeCheckingPercent) {
        this.typeCheckingPercent = typeCheckingPercent;
    }

    public String getTypeDataPercent() {
        return typeDataPercent;
    }

    public void setTypeDataPercent(String typeDataPercent) {
        this.typeDataPercent = typeDataPercent;
    }

    public String getTypeFunctionPercent() {
        return typeFunctionPercent;
    }

    public void setTypeFunctionPercent(String typeFunctionPercent) {
        this.typeFunctionPercent = typeFunctionPercent;
    }

    public String getTypeSystemPercent() {
        return typeSystemPercent;
    }

    public void setTypeSystemPercent(String typeSystemPercent) {
        this.typeSystemPercent = typeSystemPercent;
    }

    public String getTypeEnvironmentPercent() {
        return typeEnvironmentPercent;
    }

    public void setTypeEnvironmentPercent(String typeEnvironmentPercent) {
        this.typeEnvironmentPercent = typeEnvironmentPercent;
    }

    public Integer getTotalNumberType() {
        return totalNumberType;
    }

    public void setTotalNumberType(Integer totalNumberType) {
        this.totalNumberType = totalNumberType;
    }

    public String getTotalNumberTypePercentage() {
        return totalNumberTypePercentage;
    }

    public void setTotalNumberTypePercentage(String totalNumberTypePercentage) {
        this.totalNumberTypePercentage = totalNumberTypePercentage;
    }

    public Integer getStatusNew() {
        return statusNew;
    }

    public void setStatusNew(Integer statusNew) {
        this.statusNew = statusNew;
    }

    public Integer getStatusAssigned() {
        return statusAssigned;
    }

    public void setStatusAssigned(Integer statusAssigned) {
        this.statusAssigned = statusAssigned;
    }

    public Integer getStatusOpen() {
        return statusOpen;
    }

    public void setStatusOpen(Integer statusOpen) {
        this.statusOpen = statusOpen;
    }

    public Integer getStatusDuplicate() {
        return statusDuplicate;
    }

    public void setStatusDuplicate(Integer statusDuplicate) {
        this.statusDuplicate = statusDuplicate;
    }

    public Integer getStatusRejected() {
        return statusRejected;
    }

    public void setStatusRejected(Integer statusRejected) {
        this.statusRejected = statusRejected;
    }

    public Integer getStatusDeferred() {
        return statusDeferred;
    }

    public void setStatusDeferred(Integer statusDeferred) {
        this.statusDeferred = statusDeferred;
    }

    public Integer getStatusNotABug() {
        return statusNotABug;
    }

    public void setStatusNotABug(Integer statusNotABug) {
        this.statusNotABug = statusNotABug;
    }

    public Integer getStatusFixed() {
        return statusFixed;
    }

    public void setStatusFixed(Integer statusFixed) {
        this.statusFixed = statusFixed;
    }

    public Integer getStatusPendingRetest() {
        return statusPendingRetest;
    }

    public void setStatusPendingRetest(Integer statusPendingRetest) {
        this.statusPendingRetest = statusPendingRetest;
    }

    public Integer getStatusRetest() {
        return statusRetest;
    }

    public void setStatusRetest(Integer statusRetest) {
        this.statusRetest = statusRetest;
    }

    public Integer getStatusReOpened() {
        return statusReOpened;
    }

    public void setStatusReOpened(Integer statusReOpened) {
        this.statusReOpened = statusReOpened;
    }

    public Integer getStatusVerified() {
        return statusVerified;
    }

    public void setStatusVerified(Integer statusVerified) {
        this.statusVerified = statusVerified;
    }

    public Integer getStatusClosed() {
        return statusClosed;
    }

    public void setStatusClosed(Integer statusClosed) {
        this.statusClosed = statusClosed;
    }

    public String getStatusNewPercent() {
        return statusNewPercent;
    }

    public void setStatusNewPercent(String statusNewPercent) {
        this.statusNewPercent = statusNewPercent;
    }

    public String getStatusAssignedPercent() {
        return statusAssignedPercent;
    }

    public void setStatusAssignedPercent(String statusAssignedPercent) {
        this.statusAssignedPercent = statusAssignedPercent;
    }

    public String getStatusOpenPercent() {
        return statusOpenPercent;
    }

    public void setStatusOpenPercent(String statusOpenPercent) {
        this.statusOpenPercent = statusOpenPercent;
    }

    public String getStatusDuplicatePercent() {
        return statusDuplicatePercent;
    }

    public void setStatusDuplicatePercent(String statusDuplicatePercent) {
        this.statusDuplicatePercent = statusDuplicatePercent;
    }

    public String getStatusRejectedPercent() {
        return statusRejectedPercent;
    }

    public void setStatusRejectedPercent(String statusRejectedPercent) {
        this.statusRejectedPercent = statusRejectedPercent;
    }

    public String getStatusDeferredPercent() {
        return statusDeferredPercent;
    }

    public void setStatusDeferredPercent(String statusDeferredPercent) {
        this.statusDeferredPercent = statusDeferredPercent;
    }

    public String getStatusNotABugPercent() {
        return statusNotABugPercent;
    }

    public void setStatusNotABugPercent(String statusNotABugPercent) {
        this.statusNotABugPercent = statusNotABugPercent;
    }

    public String getStatusFixedPercent() {
        return statusFixedPercent;
    }

    public void setStatusFixedPercent(String statusFixedPercent) {
        this.statusFixedPercent = statusFixedPercent;
    }

    public String getStatusPendingRetestPercent() {
        return statusPendingRetestPercent;
    }

    public void setStatusPendingRetestPercent(String statusPendingRetestPercent) {
        this.statusPendingRetestPercent = statusPendingRetestPercent;
    }

    public String getStatusRetestPercent() {
        return statusRetestPercent;
    }

    public void setStatusRetestPercent(String statusRetestPercent) {
        this.statusRetestPercent = statusRetestPercent;
    }

    public String getStatusReOpenedPercent() {
        return statusReOpenedPercent;
    }

    public void setStatusReOpenedPercent(String statusReOpenedPercent) {
        this.statusReOpenedPercent = statusReOpenedPercent;
    }

    public String getStatusVerifiedPercent() {
        return statusVerifiedPercent;
    }

    public void setStatusVerifiedPercent(String statusVerifiedPercent) {
        this.statusVerifiedPercent = statusVerifiedPercent;
    }

    public String getStatusClosedPercent() {
        return statusClosedPercent;
    }

    public void setStatusClosedPercent(String statusClosedPercent) {
        this.statusClosedPercent = statusClosedPercent;
    }

    public Integer getTotalNumberStatus() {
        return totalNumberStatus;
    }

    public void setTotalNumberStatus(Integer totalNumberStatus) {
        this.totalNumberStatus = totalNumberStatus;
    }

    public String getTotalNumberStatusPercentage() {
        return totalNumberStatusPercentage;
    }

    public void setTotalNumberStatusPercentage(String totalNumberStatusPercentage) {
        this.totalNumberStatusPercentage = totalNumberStatusPercentage;
    }
}
