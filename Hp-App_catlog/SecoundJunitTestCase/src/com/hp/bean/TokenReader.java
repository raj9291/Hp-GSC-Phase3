package com.hp.bean;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TokenReader {
	public List<String> getTokens(String inFile) throws IOException {
		FileInputStream fis = null;
		StringBuffer buffer = null;
		List<String> tokens = null;
		int c = 0;

		try {
			buffer = new StringBuffer();
			fis = new FileInputStream(inFile);
			while ((c = fis.read()) != -1) {
				buffer.append((char) c);
			}
		} finally {
			fis.close();
		}
		String[] splits = buffer.toString().split(",");
		tokens = Arrays.asList(splits);

		return tokens;
	}
}
