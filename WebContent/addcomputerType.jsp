<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加电脑配件</title>
</head>
<body>
	<center>
		<p>添加电脑配件</p>
		<form action="addcomType" method="post">
			<table>
				<tr>
					<td>配件名称:</td>
					<td><input type="text" id="type_name"
						name="computertype.type_name"></td>
				</tr>
				<tr>
					<td>配件类型:</td>
					<td><select name="tid" id="select_k1" onblur="hi()">
							
					</select></td>
				</tr>
				<tr id="rong">
					<td>容量：</td>
					<td><input type="text" id="c" name="computertype.capacity"
						onblur="jisuan()"></td>
				</tr>
				<tr>
					<td>价格</td>
					<td><input type="text" id="pice" name="computertype.price"></td>
				</tr>
				<tr>
					<td><input type="submit" value="提交"></td>
				</tr>
			</table>
		</form>
	</center>
	
	<script type="text/javascript">
		$("#rong").val("");
		function hi() {
			var text = document.getElementById("select_k1").value;
			if (text == 2 || text == 4) {
				$("#rong").show();
			} else {
				$("#rong").hide();
				$("#rong").val(" ");
				$("#pice").val("100")
			}
		}
		function jisuan() {
			var text1 = document.getElementById("select_k1").value;
			var text2 = document.getElementById("c").value;
			alert(text2);
			if (text1 == 2) {
				if (text2 > 200) {

					$("#pice").val(parseInt(text2) * 1.2)
				} else if (text2 <= 200) {
					$("#pice").val("200")
				}
			}
			if (text1 == 4) {
				if (text2 > 2) {
					$("#pice").val(parseInt(text2) * 40)
				} else {
					$("#pice").val("100")
				}
			}
			if (text1 != 2 && text1 != 4) {
				$("#pice").val("100")
			}
		}
		$("#rong").hide();

		$.ajax({
			timeout : 3000,
			async : false,
			type : "POST",
			url : "find",
			dataType : "json",
			success : function(getdata) {
				var dataObj = eval("(" + getdata + ")");
				for (var i = 0; i < dataObj.length; i++) {
					$("#select_k1").append(
							"<option value='"+  dataObj[i].type_id+"'>"
									+ dataObj[i].type + "</option>");
				}
			}

		});
	</script>
</body>
</html>