package core;

public enum StatusCode {
	
	success(200,"this request is successfull");
	  

	   public final int code;
	   public final String msg;


	   StatusCode(int code, String msg) {
	       this.code = code;
	       this.msg = msg;
	   }


}
