package com.cms.util;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;



public class FileUploadUtility {

	private static final String ABS_PATH = "//home//ms-alsabagh//Documents//workspace1//collage-management-system//src//main//webapp//static//images//";
	private static String REAL_PATH = null;
	private static final Logger logger = LoggerFactory.getLogger(FileUploadUtility.class);

	public static void uploadFile(HttpServletRequest request, MultipartFile file, String code) {
		// TODO Auto-generated method stub
		
		REAL_PATH = request.getSession().getServletContext().getRealPath("/static/images/");

		
		logger.info(REAL_PATH);
		// create the directories if it does not exist  
				if(!new File(REAL_PATH).exists()) {
					new File(REAL_PATH).mkdirs();
				}
				
				if(!new File(ABS_PATH).exists()) {
					new File(ABS_PATH).mkdirs();
				}
				
				try {
					//transfer the file to both the location
					
					//this for server upload
					file.transferTo(new File(REAL_PATH + code + ".jpg"));
					//this for project directory upload
					file.transferTo(new File(ABS_PATH + code + ".jpg"));
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
				catch(NullPointerException n){
					n.printStackTrace();
				}
				
			}
	}

