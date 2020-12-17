package com.scratchcat458.util;

import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DownloadUtil {
    public DownloadUtil() {

    }

    public void downloadFromConsoleInput() throws Exception {
        String url;
        String fileName;
        Scanner i = new Scanner(System.in);

        System.out.println("");
        System.out.println("Enter the URL of the hosted file:");
        url = i.next();
        System.out.println("Enter the name for the file to be saved as:");
        fileName = i.next();

        download(url, fileName);
    }
    public void download(String url, String name) throws Exception {
        try (InputStream in = URI.create(url).toURL().openStream()) {
            Files.copy(in, Paths.get("src\\_output\\" + name));
            System.out.println("File from " + url + " imported successfully as " + name);
        }
    }
}
