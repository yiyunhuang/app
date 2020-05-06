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

<form class="layui-form" action="">
    <div class="layui-form-item">
        <label class="layui-form-label">代码类型</label>
        <div class="layui-input-block">
            <input type="text" name="username" lay-verify="required" lay-reqtext="代码类型是必填项，不能为空？" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">代码值</label>
        <div class="layui-input-block">
            <input type="text" name="username" lay-verify="required" lay-reqtext="用户名是必填项，不能为空？" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">代码说明</label>
        <div class="layui-input-block">
            <input type="text" name="username" lay-verify="required" lay-reqtext="用户名是必填项，不能为空？" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">参数归类</label>
        <div class="layui-input-block">
            <input type="text" name="username" lay-verify="required" lay-reqtext="用户名是必填项，不能为空？" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>

</form>

</body>
</html>
