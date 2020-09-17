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
    <title>记账数据编辑</title>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>表单集合演示--financeEditor</legend>
</fieldset>
<div class="layui-form"  method="post" lay-filter="AddForm" id ="form">
    <div class="layui-form-item" style="display:none;" >
        <label class="layui-form-label" >id</label>
        <div class="layui-input-block">
            <input type="text" name="id" type="hidden" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
            <label class="layui-form-label">理财类型</label>
            <div class="layui-input-block">
                <input type="text" name="financeType" lay-verify="required" lay-reqtext="代码类型是必填项，不能为空。" placeholder="请输入" autocomplete="off" class="layui-input">
            </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">总计金额</label>
        <div class="layui-input-block">
            <input type="text" name="totalAmount" lay-verify="required" lay-reqtext="代码值是必填项，不能为空。" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">金额变动</label>
        <div class="layui-input-block">
            <input type="text" name="sharesChange" lay-verify="required" lay-reqtext="代码值是必填项，不能为空。" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
            <label class="layui-form-label">变动数量</label>
            <div class="layui-input-block">
                <input type="text" name="sharesChange" lay-verify="required" lay-reqtext="代码说明是必填项，不能为空。" placeholder="请输入" autocomplete="off" class="layui-input">
            </div>
        </div>
    <div class="layui-form-item">
        <label class="layui-form-label">价格</label>
        <div class="layui-input-block" >
            <input type="text" name="stockPrice" lay-verify="required" lay-reqtext="参数归类是必填项，不能为空。" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">账户id</label>
        <div class="layui-input-block" >
            <input type="text" name="accountId" lay-verify="required" lay-reqtext="参数归类是必填项，不能为空。" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">请填写备注</label>
            <div class="layui-input-block">
                <textarea name="financeRemark" placeholder="请输入内容" class="layui-textarea"></textarea>
            </div>
        </div>

    <div class="layui-form-item">
        <label class="layui-form-label">手续费用明细</label>
        <div class="layui-input-block" >
            <input type="text" name="fee" lay-verify="required" lay-reqtext="参数归类是必填项，不能为空。" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1" >立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary reset" onclick="reset()">重置</button>
        </div>
    </div>
</div>
</body>

<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;
        form.render();  // 更新全部
        var id = '${id}';
        function initData(id){
            if(id!=null&&id!=''){
                $.ajax({
                    url: '${pageContext.request.contextPath }/finance/'+id,
                    type:"GET",
                    success:function(data){
                        // alert(data.message);
                        form.val("AddForm", data.data);
                    }
                });
            }
        };
        initData(id);
        //监听提交
        form.on('submit(demo1)', function(data){
            var paramsJson = [];
            var params = {
                gd: '',
                message: ''
            }
            var gd = {};
            gd = form.val("AddForm");
            paramsJson.push(gd);
            params.gd = JSON.stringify(paramsJson);
            if(id!=null&&id!=''){
                $.ajax({
                    type:'put',
                    url: '${pageContext.request.contextPath }/finance/'+id,
                    data :params,
                    success:function(data) {
                        alert(data.message);
                        openWindows('financeAction');
                    }

                });
            }else{
                $.ajax({
                    type:'post',
                    url: '${pageContext.request.contextPath }/finances',
                    data :params,
                    success:function(data) {
                        alert(data.message);
                        openWindows('financeAction');
                    }
                });
            }
        });
    });


</script>
</html>
