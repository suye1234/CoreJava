package org.suye.corejava.factory.polymorphic;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.factory.polymorphic.service.ExportFactory;

/**
 * Created by Administrator on 2016/12/12.
 */
public class ExportFactoryTest {

    @Test
    public void testExportStandardHtmlFile(){
        String type = ExportFactory.TYPE_STANDARD;

        ExportFactory exportFactory = new ExportHtmlFactory();

        exportFactory.getExportFileInstance(type).export();

        Assert.assertTrue(true);
    }


    @Test
    public void tstExportFinancialPdfFile(){
        String type = ExportFactory.TYPE_FINANCIAL;

        ExportFactory exportFactory = new ExportPdfFactory();

        exportFactory.getExportFileInstance(type).export();

        Assert.assertTrue(true);
    }
}
