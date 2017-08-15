package com.andy.xmlparse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;

//import org.jdom.Document;
//import org.jdom.Element;
//import org.jdom.JDOMException;
//import org.jdom.input.SAXBuilder;
//import org.jdom.output.XMLOutputter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * description :
 */
public class JDomParse {
    public static void JDomParse() throws JAXBException {
        String xmlpath = JDomParse.class.getResource("/test.xml").getFile();
        try {
            xmlpath = URLDecoder.decode(xmlpath, "utf-8");
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }

        xmlpath = xmlpath.trim().replaceFirst("^([\\W]+)<","<");
        JAXBContext context = JAXBContext.newInstance(BudgetBeanXml.class);

        Marshaller marshaller = context.createMarshaller();
        Unmarshaller unmarshaller = context.createUnmarshaller();
        BudgetBeanXml boy2 = (BudgetBeanXml) unmarshaller.unmarshal(new StringReader(xmlpath));
        System.out.println(boy2.toString());
//        SAXBuilder builder=new SAXBuilder(false);
//        try {
//            Document doc=builder.build(xmlpath);
//            Element books=doc.getRootElement();
//            List budgetBean=books.getChildren("budgetBean");
//            for (Iterator iter = budgetBean.iterator(); iter.hasNext();) {
//                Element book = (Element) iter.next();
//                String AUFNR =book.getChildText("AUFNR");
//                String DMBTR =book.getChildText("DMBTR");
//                String JYID = book.getChildText("JYID");
//                String KTEXT = book.getChildText("KTEXT");
//                String USER7 = book.getChildText("USER7");
//                String USER8 = book.getChildText("USER8");
//                String ZREMAK = book.getChildText("ZREMAK");
//                String ZSCALE = book.getChildText("ZSCALE");
//                String ZYSLX = book.getChildText("ZYSLX");
//
//                BudgetBean budgetBean1 = new BudgetBean();
//                budgetBean1.setAufnr(AUFNR);
//                budgetBean1.setDmbtr(DMBTR);
//                budgetBean1.setJyid(JYID);
//                budgetBean1.setKtext(KTEXT);
//                budgetBean1.setUser7(USER7);
//                budgetBean1.setUser8(USER8);
//                budgetBean1.setZremak(ZREMAK);
//                budgetBean1.setZscale(ZSCALE);
//                budgetBean1.setZyslx(ZYSLX);
//                System.out.println(budgetBean1.toString());
//            }
//
//            XMLOutputter outputter=new XMLOutputter();
//            outputter.output(doc,new FileOutputStream(xmlpath));
//        } catch (JDOMException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public static void main(String[] args) throws JAXBException {
        JDomParse.JDomParse();
    }
}
