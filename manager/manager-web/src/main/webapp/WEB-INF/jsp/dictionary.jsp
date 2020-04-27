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
 <%--   <table class="layui-table">
        <colgroup>
            <col width="150" aria-hidden="true" >
            <col width="150">
            <col width="200">
            <col width="200">
            <col width="200">
            <col width="200">
            <col width="200">
            <col width="200">
            <col width="200">
            <col>
        </colgroup>
        <thead>
        <tr>
            <th>id</th>
            <th>代码类型</th>
            <th>代码值</th>
            <th>代码说明</th>
            <th>参数归类</th>
            <th>创建时间</th>
            <th>更新时间</th>
            <th>有效标识</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th>id</th>
            <th>代码类型</th>
            <th>代码值</th>
            <th>代码说明</th>
            <th>参数归类</th>
            <th>创建时间</th>
            <th>更新时间</th>
            <th>有效标识</th>
            <th>操作</th>
        </tr>
        </tbody>
    </table>--%>
     <table class="layui-hide" id="dictionary" lay-filter="test"></table>

    <script>
        //执行一个 table 实例
        table.render({
            elem: '#dictionary'
            ,height: 420
            ,url: '${pageContext.request.contextPath }/dictionaries' //数据接口
            ,title: '字典表'
            ,page: true //开启分页
            ,toolbar: 'default' //开启工具栏，此处显示默认图标，可以自定义模板，详见文档
            ,totalRow: true //开启合计行
            ,cols: [[ //表头
                {type: 'checkbox', fixed: 'left'}
                ,{field: 'id', title: 'ID', width:80, sort: true, fixed: 'left', totalRowText: '合计：'}
                ,{field: 'codeType', title: '代码类型', width:80}
                /*      ,{field: 'experience', title: '积分', width: 90, sort: true, totalRow: true}
                     ,{field: 'sex', title: '性别', width:80, sort: true}
                     ,{field: 'score', title: '评分', width: 80, sort: true, totalRow: true}
                     ,{field: 'city', title: '城市', width:150}
                     ,{field: 'sign', title: '签名', width: 200}
                     ,{field: 'classify', title: '职业', width: 100}*/
                ,{field: 'isSign', title: '有效标识', width: 135, sort: true, totalRow: true}
                ,{fixed: 'right', width: 165, align:'center', toolbar: '#barDemo'}
            ]]
        });

    </script>

</div>
</body>
</html>
