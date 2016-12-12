package org.suye.corejava.factory.polymorphic;

import org.suye.corejava.factory.polymorphic.service.ExportFactory;
import org.suye.corejava.factory.polymorphic.service.ExportFile;

/**
 * Created by Administrator on 2016/12/12.
 */
public class ExportHtmlFactory implements ExportFactory {

    @Override
    public ExportFile getExportFileInstance(String type) {
        if(TYPE_STANDARD.equals(type)){
            return new ExportStandardHtmlFile();
        }else if(TYPE_FINANCIAL.equals(type)){
            return new ExportFinancialHtmlFile();
        }

        return null;
    }
}
