<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

<title>查看电脑配件</title>


</head>
<body>
	<center>

		<table class="easyui-datagrid" title="Basic DataGrid"
			style="width: 700px; height: 250px"
			data-options="singleSelect:true,pagination:true,collapsible:true,url:'fen',method:'get'"
			id="dg">
			<thead>
				<tr>
					<th data-options="field:'cid',width:80">序号</th>
					<th data-options="field:'type_name',width:250 ,align:'center'">
						配件名称</th>
					<th field="ct" width="80" align="right" formatter="formatPrice">配件类型</th>
					<th field="capacity" width="80" align="right" formatter="formatR">容量</th>
					<th data-options="field:'price',width:60,align:'center'">价格</th>

				</tr>
			</thead>
		</table>


	</center>
	<script type="text/javascript">
		$(function() {

			var page = $("#dg").datagrid().datagrid('getPager');

			$("#dg").datagrid({
				pagination : true, //分页属性设置
				singleSelect : true,
				pageSize : 5,
				pageList : [ 5, 10, 20, 30 ]
			})

		})

		function formatPrice(val, row) {
			if (row.ct) {
				return row.ct.type;
			} else {
				return val;
			}
		}

		function formatR(val, row) {
			if (row.capacity=="") {
				return "----";
			} else {
				return row.capacity+"G";
			}
		}
		
	</script>


</body>

</html>