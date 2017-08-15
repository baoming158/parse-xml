package com.andy.xmlparse;

/**
 * Author : baoming  15/08/2017.
 * description :
 */
public class BudgetBean {
    private String aufnr;
    private String dmbtr;
    private String jyid;
    private String ktext;
    private String user7;
    private String user8;
    private String zremak;
    private String zscale;
    private String zyslx;

    public String getAufnr() {
        return aufnr;
    }

    public void setAufnr(String aufnr) {
        this.aufnr = aufnr;
    }

    public String getDmbtr() {
        return dmbtr;
    }

    public void setDmbtr(String dmbtr) {
        this.dmbtr = dmbtr;
    }

    public String getJyid() {
        return jyid;
    }

    public void setJyid(String jyid) {
        this.jyid = jyid;
    }

    public String getKtext() {
        return ktext;
    }

    public void setKtext(String ktext) {
        this.ktext = ktext;
    }

    public String getUser7() {
        return user7;
    }

    public void setUser7(String user7) {
        this.user7 = user7;
    }

    public String getUser8() {
        return user8;
    }

    public void setUser8(String user8) {
        this.user8 = user8;
    }

    public String getZremak() {
        return zremak;
    }

    public void setZremak(String zremak) {
        this.zremak = zremak;
    }

    public String getZscale() {
        return zscale;
    }

    public void setZscale(String zscale) {
        this.zscale = zscale;
    }

    public String getZyslx() {
        return zyslx;
    }

    public void setZyslx(String zyslx) {
        this.zyslx = zyslx;
    }

    @Override
    public String toString() {
        return "BudgetBean{" +
                "aufnr='" + aufnr + '\'' +
                ", dmbtr='" + dmbtr + '\'' +
                ", jyid='" + jyid + '\'' +
                ", ktext='" + ktext + '\'' +
                ", user7='" + user7 + '\'' +
                ", user8='" + user8 + '\'' +
                ", zremak='" + zremak + '\'' +
                ", zscale='" + zscale + '\'' +
                ", zyslx='" + zyslx + '\'' +
                '}';
    }
}
