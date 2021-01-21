
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>后台登入界面</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/layui/css/layui.css">
</head>
<script src="${pageContext.request.contextPath }/layui/layui.all.js"></script>


<div class="layui-header header header-undefined" style="background-color: #007DDB;">
    <div style=" width: 1350px "
            class="layui-container"> <img id="logo"  src="${pageContext.request.contextPath }/images/login/yiyun.jpg" height="35" alt="yiyun">
    </div>
</div>

<%--style ="background-color: #0C0C0C;  left:50%;top:50%"--%>



<div style ="  width:400px;
     height:400px;
     background-color: #00FF00;
     position: relative;
     top: 50%;
     left: 50%;
     margin-top: -100px;
margin-left: -100px;" >

    <div  class="layui-form-mid layui-word-aux layui-col-md-offset1" >
        <img id="logoId" src="${pageContext.request.contextPath }/images/login/login.png" height="50"/>
    </div>

    <form class="layui-form bg-blue" action="" >
        <div class="layui-form-item margin-top-10">
            <label class="layui-form-label">用户名
                <i class="layui-icon">&#xe66f;</i>
            </label>
            <div class="layui-input-inline">

                <input type="username" name="username" required lay-verify="username" placeholder="请输入密码" autocomplete="off" class="layui-input" lay-verType="msg">
            </div>

            <!-- <div class="layui-form-mid layui-word-aux"></div> -->
        </div>
        <div class="layui-form-item" >
            <label class="layui-form-label">密码
                <i class="layui-icon"> &#xe672;</i>
            </label>
            <div class="layui-input-inline">
                <input type="password" name="password" required lay-verify="password" placeholder="请输入密码" autocomplete="off" class="layui-input">
            </div>

        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="login">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>

<script>
    //Demo 拿到你所需要用的layui已经封装好的代码
    layui.use(['jquery','form','layer'], function(){
        var $ =layui.jquery;
        var form = layui.form;//表单验证
        var layer= layui.layer;
        //表单验证（页面自动关联,验证结果绑定在表单）
        form.verify({
            username: function(value, item){ //value：表单的值、item：表单的DOM对象 自定义验证规则
                if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
                    return '用户名不能有特殊字符';
                }
                if(/^\d+\d+\d$/.test(value)){
                    return '用户名不能全为数字';
                }

            } ,
            password:function(value,item){
                if(!/^.{6,12}$/img.test(value)){
                    return"密码必须位6~12位"
                }
            },
        });
        //不想提交，可以监听，使用form.on
        form.on('submit(login)', function(data){
            //用ajax时需要注意你的url接口、采用哪一种方式type获取，它的使用的哪种数据类型datatype
            $.ajax({
                url:'${pageContext.request.contextPath }/',
                type:'get',
                dataType:'json',
                data:{
                    //监听的内容有哪些,你的登陆界面上用户输入的有哪些，就监听那些
                    username:$('input[name="username"]').val(),
                    password:$('input[name="password"]').val()
                },
                beforeSend:function(){
                    //弹出的lodinng层
                    layer.load(2,{
                        shade:[0.5,"#333"]
                    });
                },
                success:function(res){
                    if(res.code == 0){
                        //res.code == 0,表示用户输入成功，1表示失败
                        //获取用户输入的内容，存到本地存储，采用sessionStorage是因为用户只需输入一次，不需要保存，用户的体验感较好，也比较安全
                        sessionStorage.setItem('admin',JSON.stringify(res.data.admindata));
                        //获取用户数据，并存储在本地。
                        sessionStorage.setItem('role',JSON.stringify(res.data.roledata));
                        sessionStorage.setItem('module',JSON.stringify(res.data.moduledata));
                        layer.msg("登陆成功",{icon:1})
                        setTimeout(function(){
                            //如果输入成功，可以跳到另一个你需要的界面
                            location.href="./index.html";
                        },2000)
                    }else{
                        //不等于0时填出的内容
                        layer.msg(res.msg)
                    }
                },
                error:function(){
                    //用户输入与接口内容不对应，显示文字
                    layer.msg("网络繁忙，访问失败")
                },
                complete:function(){
                    //关掉loading
                    layer.closeAll("loading")
                }
            })
            return false;//不会跳转到网址栏，只会跳转到你要的界面 一定要写。
        });
    });
</script>
</body>

</html>
