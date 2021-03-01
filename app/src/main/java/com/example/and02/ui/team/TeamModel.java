package com.example.and02.ui.team;

import com.example.and02.ui.common.CodeModel;
import com.example.and02.ui.common.UserModel;

import java.io.Serializable;

public class TeamModel implements Serializable {

    private UserModel register;
    private String teamNo;
    private String name;
    private String phoneNumber;
    private String homepageUrl;
    private boolean registeApprove;
    private int classificationCodeId;
    private int belongedCodeId;
    private int genderCodeId;
    private int regionCodeId;
    private int sportCodeId;
    private CodeModel classificationCode;
    private CodeModel belongCode;
    private CodeModel genderCode;
    private CodeModel regionCode;
    private CodeModel psortCode;
    private boolean deleteYn;

    public UserModel getRegister() {
        return register;
    }

    public void setRegister(UserModel register) {
        this.register = register;
    }

    public String getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(String teamNo) {
        this.teamNo = teamNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }

    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }

    public boolean isRegisteApprove() {
        return registeApprove;
    }

    public void setRegisteApprove(boolean registeApprove) {
        this.registeApprove = registeApprove;
    }

    public int getClassificationCodeId() {
        return classificationCodeId;
    }

    public void setClassificationCodeId(int classificationCodeId) {
        this.classificationCodeId = classificationCodeId;
    }

    public int getBelongedCodeId() {
        return belongedCodeId;
    }

    public void setBelongedCodeId(int belongedCodeId) {
        this.belongedCodeId = belongedCodeId;
    }

    public int getGenderCodeId() {
        return genderCodeId;
    }

    public void setGenderCodeId(int genderCodeId) {
        this.genderCodeId = genderCodeId;
    }

    public int getRegionCodeId() {
        return regionCodeId;
    }

    public void setRegionCodeId(int regionCodeId) {
        this.regionCodeId = regionCodeId;
    }

    public int getSportCodeId() {
        return sportCodeId;
    }

    public void setSportCodeId(int sportCodeId) {
        this.sportCodeId = sportCodeId;
    }

    public CodeModel getClassificationCode() {
        return classificationCode;
    }

    public void setClassificationCode(CodeModel classificationCode) {
        this.classificationCode = classificationCode;
    }

    public CodeModel getBelongCode() {
        return belongCode;
    }

    public void setBelongCode(CodeModel belongCode) {
        this.belongCode = belongCode;
    }

    public CodeModel getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(CodeModel genderCode) {
        this.genderCode = genderCode;
    }

    public CodeModel getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(CodeModel regionCode) {
        this.regionCode = regionCode;
    }

    public CodeModel getPsortCode() {
        return psortCode;
    }

    public void setPsortCode(CodeModel psortCode) {
        this.psortCode = psortCode;
    }

    public boolean isDeleteYn() {
        return deleteYn;
    }

    public void setDeleteYn(boolean deleteYn) {
        this.deleteYn = deleteYn;
    }
}
