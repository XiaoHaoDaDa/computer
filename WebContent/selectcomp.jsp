<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>

</head>
<body>
	<center>


		<table class="easyui-datagrid" title="Basic DataGrid"
			style="width: 700px; height: 250px"
			data-options="singleSelect:true,collapsible:true,pagination:true,url:'secomjson',method:'get'">
			<thead>
				<tr>
					<th data-options="field:'com_id',width:80">序号</th>
					<th data-options="field:'com_name',width:156 ,align:'center'">
						电脑名称</th>
					<th field="memory" width="80" align="right"
						formatter="formatPrice1">内存</th>
					<th field="cpu" width="80" align="right" formatter="formatPrice2">cpu</th>
					<th field="videocard" width="80" align="right"
						formatter="formatPrice3">显卡</th>
					<th field="display" width="80" align="right"
						formatter="formatPrice4">显示器</th>
					<th field="hdd" width="80" align="right" formatter="formatPrice5">硬盘</th>
					<th data-options="field:'price',width:60,align:'center'">价格</th>

				</tr>
			</thead>
		</table>
		
	</center>
	<script type="text/javascript">
		function dele() {
			if (confirm("确定删除")) {
				return true;

			} else {
				return false;
			}

		}

		function formatPrice1(val, row) {
			if (row.memory) {
				return row.memory.type_name;
			} else {
				return val;
			}
		}
		function formatPrice2(val, row) {
			if (row.cpu) {
				return row.cpu.type_name;

			} else {
				return val;

			}
		}
		function formatPrice3(val, row) {
			if (row.videocard) {
				return row.videocard.type_name;

			} else {
				return val;

			}
		}
		function formatPrice4(val, row) {
			if (row.display) {
				return row.display.type_name;

			} else {
				return val;

			}
		}
		function formatPrice5(val, row) {
			if (row.hdd) {
				return row.hdd.type_name;

			} else {
				return val;

			}
		}
	</script>


</body>
</html>