package com.company;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.*;

import java.io.File;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) throws Throwable {
        PDFParser parser = new PDFParser(new FileInputStream(new File("/home/mariusz/django_prezentacja.pdf")));
	    parser.parse();

        PDDocument document = parser.getPDDocument();

        PDFTextStripper stripper = new PDFTextStripper();

        String text = stripper.getText(document);

        System.out.println(text);
    }
}
