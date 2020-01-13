<html>
<body>
<h2>Hello World!</h2>
</body>



<div class="easyui-panel" title="cs" data-options="fit:true">
    <form class="itemForm" id="itemAddForm" name="itemAddForm" method="post">
        <table style="width:100%;">

            <tr class="paramsShow" style="display:none;">
                <td class="label">商品规格：</td>
                <td>

                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <button onclick="submitForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-ok'">测试</button>

                </td>
            </tr>
        </table>
        <input name="paramData" id="paramData" style="display:none;">
    </form>
</div>



<script>
    //提交表单
    function submitForm() {
        $('#itemAddForm').form('submit', {
            //提交表单到item进行处理
            url: 'test',
            //在表单提交之前触发
            onSubmit: function () {

            },
            //在表单提交成功以后触发
            success: function (data) {
                if (data > 0) {
                    $.messager.alert('温馨提示', '测试成功');
                }
            }
        });
    }

</script>


</html>
