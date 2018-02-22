package cn.et.test.entity;
public class Result {
	/**
	 * 0��ʾʧ�� 
	 * 1��ʾ�ɹ�
	 */
	private int code;
	/**
	 * ʧ�ܵ���Ϣ
	 */
	private String message;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * ��дsetMessage�������쳣�Ķ�ջ��Ϣ���õ� message������
	 * @param msg
	 */
//	public void setMessage(Exception msg) {
//		ByteArrayOutputStream baos=new ByteArrayOutputStream();
//		msg.printStackTrace(new PrintStream(baos));
//		this.message = new String(baos.toByteArray());
//	}
}
