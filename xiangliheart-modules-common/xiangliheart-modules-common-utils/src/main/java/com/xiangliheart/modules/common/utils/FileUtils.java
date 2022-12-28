/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.modules.common.utils;

import java.io.*;

import javax.servlet.http.HttpServletResponse;

/**
 * FileUtils 文件相关操作
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/20
 */
public class FileUtils {
    /**
     * downloadFile 下载文件
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/20
     */
    public static void downloadFile(HttpServletResponse response, File file, String newFileName) {
        try {
            response.setHeader("Content-Disposition",
                "attachment; filename=" + new String(newFileName.getBytes("ISO-8859-1"), "UTF-8"));
            BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
            InputStream is = new FileInputStream(file.getAbsolutePath());
            BufferedInputStream bis = new BufferedInputStream(is);
            int length = 0;
            byte[] temp = new byte[1 * 1024 * 10];
            while ((length = bis.read(temp)) != -1) {
                bos.write(temp, 0, length);
            }
            bos.flush();
            bis.close();
            bos.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
