package com.bobby.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.markdown4j.Markdown4jProcessor;

public class MarkdownTest {

	@Test
	public void test() {
		File file=new File("C:\\Users\\cailikun\\Desktop\\JQuery学习笔记(一)—JQuery选择器.md");
		 Markdown4jProcessor mdprocessor= new Markdown4jProcessor();
		 try {
			String html=mdprocessor.process(file);
			System.out.println(html);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
