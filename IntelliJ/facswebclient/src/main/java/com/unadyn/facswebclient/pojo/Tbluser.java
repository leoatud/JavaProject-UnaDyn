package com.unadyn.facswebclient.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Tbluser {
    private int id;
    private String code;
    private Integer mailProfileDbid;
    private String password;
    private String passwordAes;
    private String firstname;
    private String lastname;
    private String email;
    private String language;
    private byte unit;
    private byte[] photo;
    private Integer cardid;
    private byte enabled;
    private int autologoff;
    private Timestamp passwordExpiry;
    private int passwordExpirySetting;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "MAIL_PROFILE_DBID")
    public Integer getMailProfileDbid() {
        return mailProfileDbid;
    }

    public void setMailProfileDbid(Integer mailProfileDbid) {
        this.mailProfileDbid = mailProfileDbid;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "PASSWORD_AES")
    public String getPasswordAes() {
        return passwordAes;
    }

    public void setPasswordAes(String passwordAes) {
        this.passwordAes = passwordAes;
    }

    @Basic
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "LANGUAGE")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "UNIT")
    public byte getUnit() {
        return unit;
    }

    public void setUnit(byte unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "PHOTO")
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "CARDID")
    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    @Basic
    @Column(name = "ENABLED")
    public byte getEnabled() {
        return enabled;
    }

    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "AUTOLOGOFF")
    public int getAutologoff() {
        return autologoff;
    }

    public void setAutologoff(int autologoff) {
        this.autologoff = autologoff;
    }

    @Basic
    @Column(name = "PASSWORD_EXPIRY")
    public Timestamp getPasswordExpiry() {
        return passwordExpiry;
    }

    public void setPasswordExpiry(Timestamp passwordExpiry) {
        this.passwordExpiry = passwordExpiry;
    }

    @Basic
    @Column(name = "PASSWORD_EXPIRY_SETTING")
    public int getPasswordExpirySetting() {
        return passwordExpirySetting;
    }

    public void setPasswordExpirySetting(int passwordExpirySetting) {
        this.passwordExpirySetting = passwordExpirySetting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tbluser tbluser = (Tbluser) o;
        return id == tbluser.id &&
                unit == tbluser.unit &&
                enabled == tbluser.enabled &&
                autologoff == tbluser.autologoff &&
                passwordExpirySetting == tbluser.passwordExpirySetting &&
                Objects.equals(code, tbluser.code) &&
                Objects.equals(mailProfileDbid, tbluser.mailProfileDbid) &&
                Objects.equals(password, tbluser.password) &&
                Objects.equals(passwordAes, tbluser.passwordAes) &&
                Objects.equals(firstname, tbluser.firstname) &&
                Objects.equals(lastname, tbluser.lastname) &&
                Objects.equals(email, tbluser.email) &&
                Objects.equals(language, tbluser.language) &&
                Arrays.equals(photo, tbluser.photo) &&
                Objects.equals(cardid, tbluser.cardid) &&
                Objects.equals(passwordExpiry, tbluser.passwordExpiry);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, code, mailProfileDbid, password, passwordAes, firstname, lastname, email, language, unit, cardid, enabled, autologoff, passwordExpiry, passwordExpirySetting);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }
}
