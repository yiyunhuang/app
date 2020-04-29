<%--
  Created by IntelliJ IDEA.
  User: huangyifan
  Date: 2020/4/23
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dictionary</title>
</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>参数录入</legend>
</fieldset>
<div>
    <button type="button" class="layui-btn layui-btn-normal" onclick="initQuery('dictionaries')" >查询所有</button>
</div>
<div class="layui-form">
     <table class="layui-hide" id="dictionary" lay-filter="test"></table>
</div>
<script>
    layui.use('table', function(){
        var table = layui.table;
        //执行一个 table 实例
        table.render({
            elem: '#dictionary'
            ,height: 420
            ,url: '${pageContext.request.contextPath }/dictionaries' //数据接口
            ,title: '字典表'
            ,page: true //开启分页
            ,toolbar: 'true' //开启工具栏，此处显示默认图标，可以自定义模板，详见文档
            ,totalRow: false //开启合计行
            ,cols: [[ //表头
                {type: 'checkbox' ,align:'center'}
                ,{field: 'id', title: 'ID', width:80, sort: true,align:'center'}
                ,{field: 'codeType', title: '代码类型', align:'center',width:80 }
                ,{field: 'codeValue', title: '代码值', align:'center', width: 90}
                ,{field: 'codeExplain', title: '代码说明',align:'center', width:80}
                ,{field: 'parametersClassified', title: '参数归类',align:'center', width: 80,  }
                ,{field: 'gmtCreate', title: '创建时间', align:'center',width:200 ,templet : "<div>{{layui.util.toDateString(d.sbj_start, 'yyyy-MM-dd HH:mm:ss')}}</div>" }
                ,{field: 'gmtModified', title: '更新时间', align:'center', width: 200 ,templet : "<div>{{layui.util.toDateString(d.sbj_start, 'yyyy-MM-dd HH:mm:ss')}}</div>"}
                ,{field: 'isSign', title: '有效标识', align:'center',width: 135,  totalRow: true}
            ]]
        });
    });
</script>


</body>
</html>
