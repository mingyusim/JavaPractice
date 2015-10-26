/**
 * <pre>
 * org.dimigo.io
 *   |_ SaveImageFromUrl
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 10. 26.
 * </pre>
 *
 * @author		: 심민규
 * @version		: 1.0
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * @author master
 *
 */
public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "https://static.dimigo.in/img/logobeta.png";
		
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/logo.png")) {
				
				// 파일에 write하기
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
