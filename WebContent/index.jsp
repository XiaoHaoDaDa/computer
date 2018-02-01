<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>首页</title>


<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="themes/icon.css">
<link rel="stylesheet" type="text/css" href="js/demo.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>


</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:false"
		style="height: 60px; background: #B3DFDA; padding: 10px">north
		region</div>
	<div id="tree" class="easyui-panel"
		data-options="region:'west',split:true,title:'West'"
		style="width: 150px; padding: 10px;">
		<ul class="easyui-tree">
			<li><span>电脑配件管理</span>
				<ul>
					<li><b onclick="am1()">电脑配件添加 </b></li>
					<li><b onclick="am2()">电脑配件查询 </b></li>
				</ul></li>
			<li><span >电脑管理</span>
				<ul>
					<li><b onclick="am3()">电脑添加 </b></li>
					<li><b onclick="am4()">电脑查询 </b></li>
				</ul></li>
		</ul>
	</div>
	<div
		data-options="region:'east',split:true,collapsed:true,title:'East'"
		style="width: 100px; padding: 10px;">east region</div>
	<div data-options="region:'south',border:false"
		style="height: 50px; background: #A9FACD; padding: 10px;">south
		region</div>
	<div data-options="region:'center',title:'Center' ">
		<div id="cc1">
			<jsp:include page='addcomputerType.jsp'></jsp:include>
		</div>
		<div id="cc2">
			<jsp:include page='Selectaction.jsp'></jsp:include>
		</div>

		<div id="cc3">
			<jsp:include page='addcomputer.jsp'></jsp:include>
		</div>

		<div id="cc4">
			<jsp:include page='selectcomp.jsp'></jsp:include>
		</div>

	</div>


</body>
<script type="text/javascript">
	function am1() {

		$("#cc1").show();
		$("#cc2").hide();
		$("#cc3").hide();
		$("#cc4").hide();

	}
	function am2() {

		$("#cc1").hide();
		$("#cc2").show();
		$("#cc3").hide();
		$("#cc4").hide();

	}
	function am3() {

		$("#cc1").hide();
		$("#cc2").hide();
		$("#cc3").show();
		$("#cc4").hide();

	}
	function am4() {

		$("#cc1").hide();
		$("#cc2").hide();
		$("#cc3").hide();
		$("#cc4").show();

	}
	function comptype(){
		$("#cc1").hide();
		$("#cc2").hide();
		$("#cc3").show();
		$("#cc4").show();
		}

	function comp(){
		$("#cc1").show();
		$("#cc2").show();
		$("#cc3").hide();
		$("#cc4").hide();
		}

	$("#cc1").show();
	$("#cc2").hide();
	$("#cc3").hide();
	$("#cc4").hide();
</script>
</html>