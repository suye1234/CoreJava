/**
 * 
 */
package org.suye.xslt;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * @author ye.su 
 *
 */
public class TransformXmlByXsl {
	   public static void main(String[] args) throws IOException, URISyntaxException, TransformerException {
	        TransformerFactory factory = TransformerFactory.newInstance();
	        Source xslt = new StreamSource(new File("cdcatalog1.xslt"));
	        Transformer transformer = factory.newTransformer(xslt);

	        Source text = new StreamSource(new File("cdcatalog.xml"));
	        transformer.transform(text, new StreamResult(new File("output1.html")));
	        
	        xslt = new StreamSource(new File("cdcatalog2.xslt"));
	        transformer = factory.newTransformer(xslt);

	        transformer.transform(text, new StreamResult(new File("output2.html")));
	        
	        
	        xslt = new StreamSource(new File("cdcatalog3.xslt"));
	        transformer = factory.newTransformer(xslt);

	        transformer.transform(text, new StreamResult(new File("output3.html")));
	        
	        
	    }
}
