package org.suye.corejava.factory.polymorphic;

import org.suye.corejava.factory.polymorphic.service.ExportFile;

/**
 * Created by Administrator on 2016/12/12.
 */
public class ExportStandardPdfFile implements ExportFile {
    @Override
    public void export() {
        System.out.println("Exporting standard PDF file....");
    }
}
