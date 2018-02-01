<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/demo.css">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
<div style="margin:20px 0;"></div>
	<div class="easyui-panel" style="padding:5px">
		<ul class="easyui-tree"  data-options="url:'javajson'">
			
		</ul>
	</div>
	
	
	<script>
		function myLoadFilter(data, parent){
			var state = $.data(this, 'tree');
			
		    function setData(){
		    	var serno = 1;
		        var todo = [];
		        for(var i=0; i<data.length; i++){
		            todo.push(data[i]);
		        }
		        while(todo.length){
		            var node = todo.shift();
		            if (node.id == undefined){
		            	node.id = '_node_' + (serno++);
		            }
		            if (node.children){
		                node.state = 'closed';
		                node.children1 = node.children;
		                node.children = undefined;
		                todo = todo.concat(node.children1);
		            }
		        }
		        state.tdata = data;
		    }
		    function find(id){
		    	var data = state.tdata;
		    	var cc = [data];
		    	while(cc.length){
		    		var c = cc.shift();
		    		for(var i=0; i<c.length; i++){
		    			var node = c[i];
		    			if (node.id == id){
		    				return node;
		    			} else if (node.children1){
		    				cc.push(node.children1);
		    			}
		    		}
		    	}
		    	return null;
		    }
		    
		    setData();
		    
		    var t = $(this);
		    var opts = t.tree('options');
		    opts.onBeforeExpand = function(node){
                var project =node.text;
	    		var n = find(node.id);
	    		if (n.children && n.children.length){return}
		    	if (n.children1){
		    		var filter = opts.loadFilter;
		    		opts.loadFilter = function(data){return data;};
		    		t.tree('append',{
		    			parent:node.target,
		    			data:n.children1
		    		});
		    		opts.loadFilter = filter;
		    		n.children = n.children1;
		    	}
		    };
			return data;
		}


	</script>

</body>
</html>