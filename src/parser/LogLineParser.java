package parser;

public class LogLineParser {
	public LogFileRecord parseLine (String line) {
		String[] parse = line.split("[\\s\\[\\]\"]+");
		LogFileRecord logFileRecord = new LogFileRecord();
		logFileRecord.setHost(parse[0]);
		logFileRecord.setDate(parse[1]);		
		logFileRecord.setPath(parse[2]);
		logFileRecord.setProtocolVersion(parse[3]);
		logFileRecord.setHttpReplyCode(parse[4]);
		logFileRecord.setBytesTransferred(parse[5]);
		
		return logFileRecord;
	}


}