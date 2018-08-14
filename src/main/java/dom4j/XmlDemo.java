package dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;

/**
 * Created by Administrator on 2018/8/8.
 */
public class XmlDemo {
    public static void main(String[] args) throws DocumentException {
        InputStream inputStream = XmlDemo.class.getResourceAsStream("/commons.xml");
        SAXReader reader = new SAXReader();
        Document doc = reader.read(inputStream);
        Element root = doc.getRootElement();
        /**
         *  System.out.println(root);
         */
        Element filepath = root.element("filepaths");
        String tempPath = filepath.elementText("record");
        System.out.println(tempPath);
    }
}
