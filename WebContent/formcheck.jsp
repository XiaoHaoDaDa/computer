<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>表单验证</title>
<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="themes/icon.css">
<link rel="stylesheet" type="text/css" href="js/demo.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
	<h2>Basic Form</h2>
	<p>Fill the form and submit it.</p>
	<div style="margin: 20px 0;"></div>
	<div class="easyui-panel" title="New Topic"
		style="width: 100%; max-width: 400px; padding: 30px 60px;">
		<form id="ff" method="get" action="a.jsp">
			<div style="margin-bottom: 20px">
				<input id="name"  class="easyui-textbox" name="name" style="width: 100%"
					data-options="label:'账户:',required:true">
			</div>
			<div style="margin-bottom: 20px">
				<input id="pwd" name="pwd" type="password" class="easyui-textbox"
					data-options="label:'密码:',required:true" style="width: 100%" />

			</div>
			<div style="margin-bottom: 20px">
				<input id="rpwd" name="rpwd" type="password" class="easyui-textbox"
					data-options="label:'确认密码:'" required="required"
					validType="equals['#pwd']" style="width: 100%" />
			</div>

			
		</form>
		<div style="text-align: center; padding: 5px 0">

			<a href="javascript:void(0)" class="easyui-linkbutton"
				onclick="submitForm()" style="width: 80px">提交</a> <a
				href="javascript:void(0)" class="easyui-linkbutton"
				onclick="clearForm()" style="width: 80px">重置</a>
		</div>
	</div>
	<script>
		function submitForm() {
			var bb;
			$.extend($.fn.validatebox.defaults.rules, {
				equals : {
					validator : function(value, param) {
						bb = value == $(param[0]).val()
						return value == $(param[0]).val();
					},
					message : '密码不同'
				}

			});
			$('#ff').form('submit');
			
			if ($("#name").val() == " ") {
			} else {
				if (bb == true) {
					$('#ff').submit();
				}

			}

		}

		function clearForm() {
			$('#ff').form('clear');
		}
	</script>

</body>
</html>