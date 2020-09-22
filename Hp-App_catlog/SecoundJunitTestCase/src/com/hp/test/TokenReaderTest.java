package com.hp.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

import com.hp.bean.TokenReader;

import junit.framework.TestCase;

public class TokenReaderTest extends TestCase{

	private String INPUT_FILE_NM = "d:\\test-data.txt";
	private List<String> expectedTokens;
	private TokenReader tokenReader;

	@Override
	protected void setUp() throws Exception {
		String s = new String("cat,rat,dog,buffalo,pig");

		expectedTokens = Arrays.asList(new String[] { "cat", "rat", "dog", "buffalo", "pig" });
		FileOutputStream fos = new FileOutputStream(INPUT_FILE_NM);
		fos.write(s.getBytes());
		fos.close();

		tokenReader = new TokenReader();
	}

	public void testNoOfTokens() throws IOException {
		int actualTokens = 0;
		int expectedTokens = this.expectedTokens.size();
		List<String> actualTokensList = null;

		actualTokensList = tokenReader.getTokens(INPUT_FILE_NM);
		actualTokens = actualTokensList.size();
		Assert.assertEquals(expectedTokens, actualTokens);
	}

	@Override
	protected void tearDown() throws Exception {
		File f = new File(INPUT_FILE_NM);
		f.delete();
	}
}
