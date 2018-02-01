<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加电脑</title>
</head>
<body >
	<center>
		<p>添加电脑</p>
		<form action="computer" method="post">
			<table>
				<tr>
					<td>电脑型号:</td>
					<td><input type="text" id="type_name" name="computer.com_name"></td>
				</tr>
				<tr>
					<td>cpu:</td>
					<td><select name="computer.cpu.cid" id="cpu">
					</select></td>
				</tr>
				<tr>
					<td>内存：</td>
					<td><select name="computer.memory.cid" id="nei">

					</select></td>
				</tr>
				<tr>
					<td>硬盘:</td>
					<td><select name="computer.hdd.cid" id="ying">

					</select></td>
				</tr>

				<tr>
					<td>显卡:</td>
					<td><select name="computer.videocard.cid" id="xian">

					</select></td>
				</tr>
				<tr>
					<td>显示器:</td>
					<td><select name="computer.display.cid" id="xianshi">

					</select></td>
				</tr>
				<tr>
					<td>价格:</td>
					<td><input type="text" name="computer.price" id="price"></td>
				</tr>
				<tr>
					<td><input type="submit" value="提交"></td>
				</tr>
			</table>
		</form>
		</center>
	
	<script type="text/javascript">
 		$.ajax({
			timeout : 3000,
			async : false,
			type : "POST",
			url : "findct",
			data : {
				ct : 1
			},
			dataType : "json",
			success : function(getdata) {
				var dataObj = eval("(" + getdata + ")");

				for (var i = 0; i < dataObj.length; i++) {
					$("#cpu").append(
							"<option value='"+  dataObj[i].cid+"'>"
									+ dataObj[i].type_name + "</option>");

				}
			}

		}); 

	 	$.ajax({
			timeout : 3000,
			async : false,
			type : "POST",
			url : "findct",
			data : {
				ct : 2
			},
			dataType : "json",
			success : function(getdata) {
				var dataObj = eval("(" + getdata + ")");

				for (var i = 0; i < dataObj.length; i++) {
					$("#nei").append(
							"<option value='"+  dataObj[i].cid+"'>"
									+ dataObj[i].type_name + "</option>");
				}
			}

		});

		$.ajax({
			timeout : 3000,
			async : false,
			type : "POST",
			url : "findct",
			data : {
				ct : 3
			},
			dataType : "json",
			success : function(getdata) {
				var dataObj = eval("(" + getdata + ")");

				for (var i = 0; i < dataObj.length; i++) {
					$("#xian").append(
							"<option value='"+  dataObj[i].cid+"'>"
									+ dataObj[i].type_name + "</option>");

				}

			}

		});

		$.ajax({
			timeout : 3000,
			async : false,
			type : "POST",
			url : "findct",
			data : {
				ct : 4
			},
			dataType : "json",
			success : function(getdata) {
				var dataObj = eval("(" + getdata + ")");

				for (var i = 0; i < dataObj.length; i++) {
					$("#ying").append(
							"<option value='"+  dataObj[i].cid+"'>"
									+ dataObj[i].type_name + "</option>");

				}

			}

		});

		$.ajax({
			timeout : 3000,
			async : false,
			type : "POST",
			url : "findct",
			data : {
				ct : 5
			},
			dataType : "json",
			success : function(getdata) {
				var dataObj = eval("(" + getdata + ")");

				for (var i = 0; i < dataObj.length; i++) {
					$("#xianshi").append(
							"<option value='"+  dataObj[i].cid+"'>"
									+ dataObj[i].type_name + "</option>");

				}

			}

		});

		/*  价钱计算*/
		var mprice = 0;
		var cprice = 0;
		var hprice = 0;
		var dprice = 0;
		var vprice = 0;
		var price = 0;
		$(function() {
		});
	
		$("#cpu").click(function() {
			$.ajax({
				timeout : 3000,
				async : false,
				type : "POST",
				url : "findprice",
				data : {
					ct : $("#cpu").val()
				},
				dataType : "json",
				success : function(data) {
					var d = eval("(" + data + ")");					
					cprice= d[0].price;
					price = cprice + mprice + dprice + vprice + hprice;
					$("#price").val(price);
				},
				error : function() {
					alert("系统异常，请稍后再试！")
				}
			});
		});
		$("#nei").click(function() {
			$.ajax({
				timeout : 3000,
				async : false,
				type : "POST",
				url : "findprice",
				data : {
					ct : $("#nei").val()
				},
				dataType : "json",
				success : function(data) {
					var d = eval("(" + data + ")");
					mprice = d[0].price;
					price = cprice + mprice + dprice + vprice + hprice;
					$("#price").val(price);
				},
				error : function() {
					alert("系统异常，请稍后再试！")
				}
			});
		});
		$("#ying").click(function() {
			$.ajax({
				timeout : 3000,
				async : false,
				type : "POST",
				url : "findprice",
				data : {
					ct :$("#ying").val()
				},
				dataType : "json",
				success : function(data) {
					var d = eval("(" + data + ")");					
					hprice = d[0].price;
					price = cprice + mprice + dprice + vprice + hprice;
					$("#price").val(price);
				},
				error : function() {
					alert("系统异常，请稍后再试！")
				}
			});
		});
		$("#xianshi").click(function() {
			$.ajax({
				timeout : 3000,
				async : false,
				type : "POST",
				url : "findprice",
				data : {
					ct : $("#xianshi").val()
				},
				dataType : "json",
				success : function(data) {
					var d = eval("(" + data + ")");
					dprice = d[0].price;
					price = cprice + mprice + dprice + vprice + hprice;
					$("#price").val(price);
				},
				error : function() {
					alert("系统异常，请稍后再试！")
				}
			});
		});
		$("#xian").click(function() {
			$.ajax({
				timeout : 3000,
				async : false,
				type : "POST",
				url : "findprice",
				data :{
					ct : $("#xian").val()
				},
				dataType : "json",
				success : function(data) {
					var d = eval("(" + data + ")");
					vprice = d[0].price;
					price = cprice + mprice + dprice + vprice + hprice;
					$("#price").val(price);
				},
				error : function() {
					alert("系统异常，请稍后再试！")
				}
			});
		}); 
	</script>


</body>
</html>