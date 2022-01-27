package com.poscoict.fileupload.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {

	private static final String SAVE_PATH = "/upload-images";
	private static final String URL_BASE = "/images";
	
	public String restore(MultipartFile multipartFile) {
		String url = null;
		
		try {
		if(multipartFile.isEmpty()) {
			return url;
		}
		
		String originFileName = multipartFile.getOriginalFilename();
		String extName01 = originFileName.substring(originFileName.lastIndexOf('.'));
		String extName02 = originFileName.substring(originFileName.lastIndexOf('.') + 1);
		String saveFileName = generateSaveFileName(extName02);
		long fileSize = multipartFile.getSize();
		System.out.println("# originFileName : " + originFileName);
		System.out.println("# fileSize : " + fileSize);
		System.out.println("# extName01 : " + extName01);
		System.out.println("# extName02 : " + extName02);
		System.out.println("# saveFileName : " + saveFileName);
		
		
		byte[] data = multipartFile.getBytes(); // error catch
		
		OutputStream os = new FileOutputStream(SAVE_PATH + "/" + saveFileName);
		os.write(data);
		os.close();
		
		url = URL_BASE + "/" + saveFileName;
		
		} catch(IOException ex) {
			throw new RuntimeException("file upload error : " + ex);
		}
		
		return url;
	}

	private String generateSaveFileName(String extName) {
		String filename = "";
		Calendar calendar = Calendar.getInstance(); // new 필요하지 않음

		filename += calendar.get(Calendar.YEAR);
		filename += calendar.get(Calendar.MONTH);
		filename += calendar.get(Calendar.DATE);
		filename += calendar.get(Calendar.HOUR);
		filename += calendar.get(Calendar.MINUTE);
		filename += calendar.get(Calendar.SECOND);
		filename += calendar.get(Calendar.MILLISECOND);
		filename += "." + extName;
		
		return filename;
	}

}
