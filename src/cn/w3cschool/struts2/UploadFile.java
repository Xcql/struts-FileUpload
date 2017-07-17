package cn.w3cschool.struts2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class UploadFile extends ActionSupport {

	private File myFile;
	private String myFileContentType;
	private String myFileFileName;
	private String destPath;
	@Override
	public String execute(){
		// TODO Auto-generated method stub
		destPath = "D:\\A\\B\\E";
		
		try {
			System.out.println("SrcFile name:" + myFile);
			System.out.println("DstFile name:" + myFileFileName);
			
			File destFile = new File(destPath, myFileFileName);
			FileUtils.copyFile(myFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		
		
		return SUCCESS;
	}
	public File getMyFile() {
		return myFile;
	}
	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}
	public String getMyFileContentType() {
		return myFileContentType;
	}
	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}
	public String getMyFileFileName() {
		return myFileFileName;
	}
	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}
	public String getDestPath() {
		return destPath;
	}
	public void setDestPath(String destPath) {
		this.destPath = destPath;
	}
	
	
}
