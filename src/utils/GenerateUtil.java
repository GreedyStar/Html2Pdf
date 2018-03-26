package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.Map;

import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.BaseFont;

import freemarker.core.ParseException;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * PDF生成辅助类
 */
public class GenerateUtil {
    public final static String PATH = "Html2Pdf/resources/";

    /**
     * html文件转pdf
     */
    public static void generatePDF(Map<Object, Object> data, String outputFileName) throws IOException, TemplateException, DocumentException {
        OutputStream out = new FileOutputStream(PATH + outputFileName + ".pdf"); // 文件输出流
        ITextRenderer render = new ITextRenderer();
        render.setDocument(generateHtml(data, outputFileName)); // 设置文档源（html文件）
        render.getFontResolver().addFont(PATH + "simsun.ttc", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED); // 添加本地字体(宋体)，用于中文显示
        render.layout();
        System.out.println("html 2 pdf start");
        render.createPDF(out);
        render.finishPDF();
        File tempFile = new File(PATH + outputFileName + ".html");
        if (tempFile.exists()) { // 删除产生的html文件
            tempFile.delete();
        }
        render = null;
        out.close();
        System.out.println("html 2 pdf done");
    }

    /**
     * 使用freemarker填充ftl模板生成html文件
     */
    private static File generateHtml(Object data, String outputFileName) throws IOException, TemplateException {
        Template tpl = FreemarketConfigUtil.getInstance().getTemplate("template.ftl"); // 获取模板
        tpl.setEncoding("UTF-8");
        StringWriter writer = new StringWriter();
        tpl.process(data, writer); // 填充数据
        writer.flush();
        FileOutputStream fos = new FileOutputStream(PATH + outputFileName + ".html");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        BufferedWriter bw = new BufferedWriter(osw, 1024);
        System.out.println("ftl 2 html start ");
        tpl.process(data, bw); // 生成html文件
        System.out.println("ftl 2 html done");
        fos.close();
        return new File(PATH + outputFileName + ".html");
    }

}
