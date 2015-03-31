package parser;



public class LogFileRecord {
	 String host; // Имя хоста или адрес в Интернете
	 String date; // DD: HH: MM: SS (24 hour)
	 String httpMethod; // запрос
	 String protocolVersion;// версия
	 String bytesTransferred; // кол-во байт
	 String httpReplyCode; // код ответа (код состояния)
	 String path;//путь
	

	private String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	private String getHttpReplyCode() {
		return httpReplyCode;
	}

	public void setHttpReplyCode(String httpReplyCode) {
		this.httpReplyCode = httpReplyCode;
	}

	private String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	private String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	private String getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	private String getProtocolVersion() {
		return protocolVersion;
	}

	public void setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	private String getBytesTransferred() {
		return bytesTransferred;
	}

	public void setBytesTransferred(String bytesTransferred) {
		this.bytesTransferred = bytesTransferred;
	}
	

	public void logFileRecordToString() {
		
				System.out.println(getHost() + "\n" 
				+ getDate() + "\n" 				
				+ getHttpMethod() + "\n"
				+ getPath()+ "\n" 
				+ getProtocolVersion() + "\n"
				+ getHttpReplyCode() + "\n"
				+ getBytesTransferred());

	}


}