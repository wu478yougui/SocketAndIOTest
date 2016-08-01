
package com.hand;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class GetPdf {
	public static void main(String[] args) throws Exception {
		InputStream in = new URL("http://files.saas.hand-china.com/java/"
				+ "target.pdf").openConnection().getInputStream();
		FileOutputStream f = new FileOutputStream("D:/pdf_11.pdf");
		byte[] bb = new byte[1024];
		int len;
		while ((len = in.read(bb)) > 0) {
			f.write(bb, 0, len); 
		}
		f.close();
		in.close();
	}

}
