<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript"  src="http://code.jquery.com/jquery-latest.min.js" ></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function pageMove(){
		$('#frm').attr('action' , '/sample/sampleMain.do');
		$('#frm').submit();
	}
</script>
</head>
<body>
<form id="frm" name="frm" method="post" action="">
<button onclick="pageMove();">이동</button>
</form>
</body>
</html>