<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/6 0006
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>字典表数据编辑</title>
</head>
<body>


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>表单集合演示--dictionaryEditor</legend>
</fieldset>

<form class="layui-form" action="" method="post" id ="AddForm" lay-filter="AddForm1">
    <div class="layui-form-item">
        <label class="layui-form-label">代码类型</label>
        <div class="layui-input-block">
            <input type="text" name="codeType" lay-verify="required" value="1" lay-reqtext="代码类型是必填项，不能为空。" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">代码值</label>
        <div class="layui-input-block">
            <input type="text" name="codeValue" lay-verify="required" value="2" lay-reqtext="代码值是必填项，不能为空。" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">代码说明</label>
        <div class="layui-input-block">
            <input type="text" name="codeExplain" lay-verify="required" value="3" lay-reqtext="代码说明是必填项，不能为空。" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">参数归类</label>
        <div class="layui-input-block">
            <input type="text" name="parametersClassified" lay-verify="required" value="4" lay-reqtext="参数归类是必填项，不能为空。" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1" >立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>

</form>

</body>

<script>

    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');


        //监听指定开关
        form.on('switch(switchTest)', function(data){
            layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });
            layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });

        //监听提交
        form.on('submit(demo1)', function(data){
            var paramsJson = [];
            var params = {
                gd: '',
                code: '1',
                mess: '2'
            }
            var gd = {};
            gd = form.val("AddForm1");
            paramsJson.push(gd);
            params.gd = JSON.stringify(paramsJson);
            $.ajax({
                type:'post',
                url: '${pageContext.request.contextPath }/dictionary',
                data :params,
                success:function(data) {
                    alert(data);
                }

            });
        });


    });

    //提交表单
    function submitForm() {

        $('#AddForm').form('submit', {
            //提交表单到item进行处理
             method:'post',
            //在表单提交之前触发
            onSubmit: function () {
                alert('submitForm.onSubmit');
                // 定义传入后台的参数
                var paramsJson = [];
                var o = {};
                o.codeType =  $codeType.val();
                o.codeValue =  $codeValue.val();
                o.codeExplain =  $codeExplain.val();
                o.parametersClassified =  $parametersClassified.val();
                paramsJson.push(o);
                paramsJson = JSON.stringify(paramsJson);
            },
            //在表单提交成功以后触发
            success: function (data) {
                if (data > 0) {
                    $.messager.alert('温馨提示', '恭喜！添加商品成功！');
                }
            }
        });
    }

</script>
</html>
