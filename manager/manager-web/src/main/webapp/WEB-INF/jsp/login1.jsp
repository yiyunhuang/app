
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


<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>登入 - Layui</title>
<link rel="stylesheet" href="//at.alicdn.com/t/font_24081_qs69ykjbea.css">
<link rel="stylesheet" href="//res.layui.com/layui/dist/css/layui.css?t=1610462525588">
<link rel="stylesheet" href="//res.layui.com/static/css/fly/global.css?t=16104625255886" charset="utf-8">
<link rel="stylesheet" href="//res.layui.com/static/css/global.css?t=1610462525588" charset="utf-8">
</head><body><div class="layui-header header header-undefined" style="background-color: #24262F;">
<div class="layui-container"> <img id="logoid"  src="${pageContext.request.contextPath }/images/login/yiyun.jpg" height="35" alt="yiyun">
</div>
</div>


<div class="layui-container fly-marginTop ">
    <div class="fly-panel fly-panel-user " pad20 >
        <div class="layui-tab layui-tab-brief " lay-filter="user">
            <ul class="layui-tab-title">
                <li class="layui-this">登入</li>
                <li><a href="/user/reg/">注册</a></li>
            </ul>
            <div class="layui-form layui-tab-content layui-col-md-offset4" id="LAY_ucm" style="padding: 20px 0;">
                <div class="layui-tab-item layui-show">
                    <div class="layui-form layui-form-pane">
                        <form method="post">
                            <div class="layui-form-item"><input type="hidden" name="secret"
                                                                value="%E9%98%B2%E6%AD%A2%E5%B9%BF%E5%91%8A%E7%8B%97459540">
                                <label for="L_email" class="layui-form-label">用户名</label>
                                <div class="layui-input-inline"><input type="text" id="L_loginName" name="loginName"
                                                                       required lay-verify="required" autocomplete="off"
                                                                       class="layui-input"></div>
                                <div class="layui-form-mid layui-word-aux"> </div>
                            </div>
                            <div class="layui-form-item"><label for="L_pass" class="layui-form-label">密码</label>
                                <div class="layui-input-inline"><input type="password" id="L_pass" name="pass" required
                                                                       lay-verify="required" autocomplete="off"
                                                                       class="layui-input"></div>
                            </div>
                            <div class="layui-form-item"><label for="L_vercode" class="layui-form-label">图形码</label>
                                <div class="layui-input-inline"><input type="text" id="L_imagecode" name="imagecode"
                                                                       required lay-verify="required" autocomplete="off"
                                                                       class="layui-input"></div>
                                <div class="layui-form-mid" style="padding: 0!important;"><img
                                        src="/auth/imagecode?t=1611067782457" class="fly-imagecode"></div>
                            </div>
                            <div class="layui-form-item">
                                <button class="layui-btn" lay-filter="*" lay-submit>立即登录</button>
                                <span style="padding-left:20px;"> <a href="/user/forget">忘记密码？</a> </span></div>
                            <div class="layui-form-item fly-form-app"><span>或者使用社交账号登入</span> <a href="/app/qq"
                                                                                                 onclick="layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})"
                                                                                                 class="iconfont icon-qq"
                                                                                                 title="QQ登入"></a> <a
                                    href="/app/weibo/" onclick="layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})"
                                    class="iconfont icon-weibo" title="微博登入"></a></div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
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
