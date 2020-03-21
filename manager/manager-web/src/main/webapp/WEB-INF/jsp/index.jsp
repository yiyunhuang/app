<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.2.js"></script>

<body>
<h2>Hello WEB-INF/jsp/index.jsp </h2>
</body>

<a href="${pageContext.request.contextPath }/WEB-INF/jsp/layui.jsp">超链接1</a>
<span id="msg1"></span>

<a id="import" onclick="importItems()">超链接2</a>
<span id="msg"></span>

<a href="${pageContext.request.contextPath }/html/index.html">超链接3</a>



<script>
    function importItems() {


        $.ajax({
            type:"get",

            <%--url:"${pageContext.request.contextPath }/test",--%>
            url:"${pageContext.request.contextPath }/test",
            success:function(data) {
                // alert(data);

            }

        });


    }

</script>


</html>
