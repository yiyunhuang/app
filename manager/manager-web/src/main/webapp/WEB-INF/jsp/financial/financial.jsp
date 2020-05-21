<%--
  Created by IntelliJ IDEA.
  User: huangyifan
  Date: 2020/4/23
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>financial</title>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>账户明细</legend>
</fieldset>

<div class="layui-form">
    <table class="layui-hide" id="dictionary" lay-filter="test"></table>
</div>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
        <div class="layui-inline" lay-event="add"><i class="layui-icon layui-icon-add-1"></i></div>
        <div class="layui-inline" lay-event="update"><i class="layui-icon layui-icon-edit"></i></div>
    </div>
</script>
<script>
    layui.use('table', function(){
        var table = layui.table;
        //执行一个 table 实例
        table.render({
            elem: '#financial'
            ,height: 420
            ,url: '${pageContext.request.contextPath }/financial' //数据接口
            ,title: '字典表'
            ,even: true //开启隔行背景
            ,toolbar: '#toolbarDemo' //默认 default
            ,defaultToolbar: ['filter', 'print', 'exports']
            ,totalRow: false //开启合计行
            ,request: {
                pageName: 'page' //页码的参数名称，默认：page
                ,limitName: 'limit' //每页数据量的参数名，默认：limit
            }
            ,page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
                layout: [ 'prev', 'page', 'next', 'skip','limit', 'count','refresh'] //自定义分页布局
                // count（总条目输区域）、prev（上一页区域）、page（分页区域）、next（下一页区域）
                // limit（条目选项区域）、refresh（页面刷新区域)、skip（快捷跳页区域）
                ,curr: 1 //设定初始在第 1 页
                ,limits:[10, 20, 30, 40, 50]
                ,limit:10
                ,groups: 3 //只显示 1 个连续页码
                ,first: false //不显示首页
                ,last: false //不显示尾页

            }
            ,cols: [[ //表头
                {type: 'checkbox' ,align:'center' ,fixed: 'left'}
                ,{field: 'id', title: 'ID', width:200, sort: true,align:'center',fixed: 'left'}
                ,{field: 'codeType', title: '代码类型', align:'center',width:100 }
                ,{field: 'codeValue', title: '代码值', align:'center', width: 100}
                ,{field: 'codeExplain', title: '代码说明',align:'center', width:100}
                ,{field: 'parametersClassified', title: '参数归类',align:'center', width: 100  }
                ,{field: 'dictionaryRemark', title: '备注',align:'center', width: 100  }
                ,{field: 'gmtCreate', title: '创建时间', align:'center',width:200 ,templet : "<div>{{layui.util.toDateString(d.gmtCreate, 'yyyy-MM-dd HH:mm:ss')}}</div>"}
                ,{field: 'gmtModified', title: '更新时间', align:'center', width: 200 ,templet : "<div>{{layui.util.toDateString(d.gmtModified, 'yyyy-MM-dd HH:mm:ss')}}</div>"}
                ,{field: 'isSign', title: '有效标识', align:'center',width: 100,  totalRow: true}
                ,{fixed: 'right', width: 165, align:'center', toolbar: '#barDemo'}
            ]]
            ,parseData: function(res){ //res 即为原始返回的数据
                return {
                    "code": res.code, //解析接口状态
                    "msg": res.message, //解析提示文本
                    "count": res.count, //解析数据长度
                    "data": res.data //解析数据列表
                };
            }

        });
        //监听行工具事件
        table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                ,layEvent = obj.event; //获得 lay-event 对应的值
            if(layEvent === 'del'){
                layer.confirm('真的删除行么', function(index){
                    obj.del(); //删除对应行（tr）的DOM结构
                    layer.close(index);
                    //向服务端发送删除指令
                    $.ajax({
                        type:'delete',
                        url: '${pageContext.request.contextPath }/dictionaries/'+obj.data.id,
                        success:function(data) {
                            alert(data.message);
                            openWindows('dictionaryAction');
                        }
                    });
                });
            } else if(layEvent === 'edit'){
                // layer.msg('编辑操作');
                $.ajax({
                    type:'GET',
                    url: '${pageContext.request.contextPath }/dictionaryEditor',
                    data:{'id':obj.data.id},
                    success:function(data) {
                        $("#padding").html(data);
                    }
                });
            }
        });
        //监听头工具栏事件
        table.on('toolbar(test)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id)
                ,data = checkStatus.data; //获取选中的数据
            switch(obj.event){
                case 'add':
                    openWindows('dictionaryEditor');
                    break;
                case 'update':
                    if(data.length === 0){
                        layer.msg('请选择一行');
                    } else if(data.length > 1){
                        layer.msg('只能同时编辑一个');
                    } else {
                        $.ajax({
                            type:'GET',
                            url: '${pageContext.request.contextPath }/dictionaryEditor',
                            data:{'id':checkStatus.data[0].id},
                            success:function(data) {
                                $("#padding").html(data);
                            }
                        });
                    }
                    break;
            };
        });
    });
</script>
</body>
</html>
