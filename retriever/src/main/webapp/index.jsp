<!doctype html>
<html>
<head>
<script src="//code.jquery.com/jquery-1.11.3.js"></script>
<script>
function fn_submit() {
	var dataObj = {
			"jobId" : $("#jobId").val(),
			"techId" : $("#techId").val(),
			"customerName" : $("#customerName").val(),
			"address1" : $("#address1").val(),			
			"jobDesc" : $("#jobDesc").val(),
			"startDate" : $("#startDate").val()			
	};
	
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "/retriever/createJob",
		data : JSON.stringify(dataObj),
		dataType : 'json',
		timeout : 100000,
        success: function (data) {
        	console.log(data); 
        },
        error : function (data) {
        	console.log("error");
        	console.log(data);
        }
	});	
}
</script>
</head>
<body>
<h2>Generate Mock Smart Link URL</h2>
<form name="frm">
	<table>
		<tr>
			<td>Job Id</td>
			<td><input type="text" id="jobId" value="1242"/></td>
		</tr>
		<tr>
			<td>Tech Id</td>
			<td><input type="text" id="techId" value="M3-02"/></td>
		</tr>		
		<tr>
			<td>Customer Name</td>
			<td><input type="text" id="customerName" value="Jake_Park"/></td>
		</tr>
		<tr>
			<td>Address1</td>
			<td><input type="text" id="address1" value="117 Old Pittwater Rd"/></td>
		</tr>
		<tr>
			<td>Job Description</td>
			<td><input type="text" id="jobDesc" value="6-monthly service2"/></td>
		</tr>
		<tr>
			<td>Start DateTime</td>
			<td><input type="text" id="startDate" value="2016-02-02 15:02:05"/></td>
		</tr>		
		<tr>
			<td colspan="2"><a href="#" onClick="fn_submit()">submit</a></td>
		</tr>		
	</table>
</form>
</body>
</html>
