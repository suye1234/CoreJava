package org.suye.corejava.factory.polymorphic.service;

/**
 * Created by Administrator on 2016/12/12.
 */
public interface ExportFactory{
    public static final String TYPE_STANDARD = "standard";
    public static final String TYPE_FINANCIAL = "financial";

    ExportFile getExportFileInstance(String type);
}
