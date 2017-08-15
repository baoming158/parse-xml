package com.andy.xmlparse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * Author : baoming  15/08/2017.
 * description :
 */
@XmlRootElement(name = "ns0",namespace="http://webservice.web.api.budget.gome.com")
@XmlAccessorType(XmlAccessType.FIELD)
public class BudgetBeanXml {
        @XmlElement(name="AUFNR")
        private String aufnr;
        @XmlElement(name = "DMBTR")
        private BigDecimal dmbtr;
        @XmlElement(name = "JYID")
        private String jyid;
        @XmlElement(name = "KTEXT")
        private String ktext;
        @XmlElement(name = "USER7")
        private Long user7;
        @XmlElement(name = "USER8")
        private Long user8;

        public String getAufnr() {
                return aufnr;
        }

        public void setAufnr(String aufnr) {
                this.aufnr = aufnr;
        }

        public BigDecimal getDmbtr() {
                return dmbtr;
        }

        public void setDmbtr(BigDecimal dmbtr) {
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

        public Long getUser7() {
                return user7;
        }

        public void setUser7(Long user7) {
                this.user7 = user7;
        }

        public Long getUser8() {
                return user8;
        }

        public void setUser8(Long user8) {
                this.user8 = user8;
        }

        @Override
        public String toString() {
                return "BudgetBeanXml{" +
                        "aufnr='" + aufnr + '\'' +
                        ", dmbtr=" + dmbtr +
                        ", jyid='" + jyid + '\'' +
                        ", ktext='" + ktext + '\'' +
                        ", user7=" + user7 +
                        ", user8=" + user8 +
                        '}';
        }
}
